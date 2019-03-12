package config_editor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import java.text.*;

public class GUI extends JFrame{
    private static final String FILE_NAME = "config.props";
    private int number=1;
    private JTextField numberBean;
    private JTextField nameBean;
    private JLabel     classBeanLabel;
    private JTextField classBean;
    private JButton    addParamButton, nextButton, clearButton;
    private JTextArea  configText;
    private boolean    first = true;
    private PrintWriter outFile;
    private Properties  props;

    public GUI(){
        super("Modeste éditeur du fichier de configuration pour femtoContainer/NFP121");
        props = new Properties();
        setLocation(10,10);
        setLayout(new BorderLayout(20,20));

        JPanel panel = new JPanel();
        panel.setFont(new Font("Serif", Font.PLAIN, 16));
        panel.setLayout(new FlowLayout());
        numberBean = new JTextField(Integer.toString(number),2);
        numberBean.setEnabled(false);
        JLabel label = new JLabel(" bean.id.");
        label.setFont(new Font("Serif", Font.PLAIN, 16));
        label.setForeground(Color.RED);
        panel.add(label);panel.add(numberBean);
        nameBean = new JTextField(6);
        label = new JLabel("=");
        label.setFont(new Font("Serif", Font.PLAIN, 16));
        label.setForeground(Color.BLUE);
        panel.add(label);panel.add(nameBean);
        nameBean.addActionListener(new NameBeanAction());
        classBean = new JTextField(20);
        classBean.setEnabled(true);
        this.classBeanLabel = new JLabel(" name.class: ");
        this.classBeanLabel.setFont(new Font("Serif", Font.PLAIN, 16));
        this.classBeanLabel.setForeground(Color.BLUE);
        panel.add(classBeanLabel);panel.add(classBean);
        classBean.addActionListener(new AddParamAction());
        classBean.addFocusListener(new FocusClassNameAction());
        classBean.addKeyListener(new NumberOfCharactersControl());
        this.addParamButton =new JButton("add property");
        this.addParamButton.setFont(new Font("Arial", Font.PLAIN, 16));
        this.addParamButton.setForeground(Color.BLUE);
        this.addParamButton.setEnabled(false);
        panel.add(addParamButton);
        this.addParamButton.addActionListener(new AddParamAction());
        this.nextButton = new JButton("next bean");
        this.nextButton.setEnabled(false);
        this.nextButton.setFont(new Font("Arial", Font.PLAIN, 16));
        this.nextButton.setForeground(Color.RED);
        panel.add(nextButton);
        this.nextButton.addActionListener(new NextAction());

        this.configText = new JTextArea(10,20);
        add(panel, BorderLayout.NORTH);
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(panel,BorderLayout.WEST);

        configText.setFont(new Font("Serif", Font.PLAIN, 14));
        configText.setText("#\n#   Ci-dessous, un exemple de ce qui sera engendré, \n" +
                           "#  cf. le fichier " + FILE_NAME + ", même répertoire\n" + example);
        //
        configText.setRows(12);
        JScrollPane scrollPane = new JScrollPane(configText);
        add(scrollPane,BorderLayout.CENTER);
        pack();
        try{
            outFile = new PrintWriter(new BufferedWriter(new FileWriter(FILE_NAME, false)));
            outFile.println("# femtoContainer, un fichier de configuration");
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            outFile.println("# généré par config_editor.GUI le " + dateFormat.format(date));
            outFile.println("#");
        } catch (IOException e) {
            configText.setText("# exception, à la création du fichier : .\\" + FILE_NAME);
        }
        //scrollPane.setBounds(10,60,780,500);
        //scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        show();
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        WindowAdapter windowAdapter = new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    super.windowClosing(e);
                    if(outFile!=null){
                        outFile.flush();
                        outFile.close();
                        String message = "Après analyse, le fichier généré semble correct, cf. " + FILE_NAME;
                        try{
                            verifyProperties();
                        }catch(RuntimeException exc){
                            message = exc.getMessage();
                        }
                        JOptionPane.showMessageDialog(GUI.this, message, "Vérification.",JOptionPane.WARNING_MESSAGE);

                    }
                    System.exit(0);
                }

            };
        this.addWindowListener(windowAdapter);
    }

    private int paramNumber = 1;
    private String beanName;

    private class AddParamAction implements ActionListener{
        private JFrame frame;
        private JTextField property, param;

        private int number;

        public void actionPerformed(ActionEvent ae){
            beanName = nameBean.getText();
            if(classBean!=null && classBean.getText()!=null &&
            classBean.getText().length()==0) return;
            addParamButton.setEnabled(true); nextButton.setEnabled(true);
            this.number = Integer.parseInt(numberBean.getText());
            if(number==1 && first){
                configText.setText("");// suppression de l'exemple, création du fichier
                configText.setFont(new Font("Serif", Font.PLAIN, 18));

            }
            if(first){ // la 1ère fois le numéro du bean, son nom, sa classe
                first = false;
                String res = "bean.id."+number+"="+beanName;
                props.put("bean.id."+number,beanName);
                outFile.println("#");outFile.println("#");
                outFile.println(res);
                String res2 = beanName+".class="+classBean.getText();
                props.put(beanName+".class",classBean.getText());
                outFile.println(res2);
                configText.setText(configText.getText() + "\n" + res + "\n" + res2 + "\n");
                classBeanLabel.setText(beanName+".class=");
                pack();
            }
            nameBean.setEnabled(false);
            classBean.setEnabled(false);

            // pour chaque paramètre
            this.frame = new JFrame("add property ident and value, number "+paramNumber);
            JPanel panel = new JPanel();
            panel.setFont(new Font("Serif", Font.PLAIN, 16));
            panel.setLayout(new FlowLayout());
            panel.add(new JLabel(beanName+".property."+paramNumber+"="));
            this.property = new JTextField(10);
            panel.add(property);
            panel.add(new JLabel(beanName+".property."+paramNumber+".param.1="));
            this.param = new JTextField(10);
            panel.add(param);
            JButton ok = new JButton("ok");
            panel.add(ok);
            param.addActionListener(new OkAction());
            ok.addActionListener(new OkAction());
            JButton cancel = new JButton("cancel");
            panel.add(cancel);
            cancel.addActionListener(new CancelAction());

            frame.add(panel);
            frame.setAlwaysOnTop(true);
            frame.setLocation(20, 20);

            frame.pack();
            frame.show();

        }

        private class OkAction implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                if(property.getText()!=null && property.getText().length()>0 &&
                param.getText() !=null && param.getText().length()>0){
                    String res = beanName+".property."+paramNumber+"="+property.getText();
                    props.put(beanName+".property."+paramNumber, property.getText());
                    outFile.println(res);
                    String res2 = beanName+".property."+paramNumber+".param.1="+param.getText();
                    props.put(beanName+".property."+paramNumber+".param.1", param.getText());
                    outFile.println(res2);
                    configText.setText(configText.getText() + res + "\n" + res2 + "\n");
                    paramNumber++;
                    pack();
                    getRootPane().setDefaultButton(addParamButton);
                    addParamButton.requestFocus();
                }
                frame.dispose();
            }
        }

        private class CancelAction implements ActionListener{
            public void actionPerformed(ActionEvent ae){
                frame.dispose();
            }
        }
    }

    private class NameBeanAction implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            classBeanLabel.setText(nameBean.getText()+".class=");
            classBean.requestFocus();
            classBean.setEnabled(true);
            pack();
        }
    }

    private class FocusClassNameAction implements FocusListener{

        public void focusGained(FocusEvent e) {
            String beanName = nameBean.getText();
            if(beanName!=null && beanName.length()>0){
                classBeanLabel.setText(beanName+".class=");
                pack();
            }
        }

        public void focusLost(FocusEvent e) {

        }
    }

    private class NumberOfCharactersControl extends KeyAdapter{
        public void keyTyped(KeyEvent e) { 
            if (classBean != null){
                if(classBean.getText().length() >= 1){
                    addParamButton.setEnabled(true);
                    nextButton.setEnabled(true);
                }else{
                    addParamButton.setEnabled(false);
                    nextButton.setEnabled(false);
                }
            }
        }
    }
    private class NextAction implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if(nameBean.getText()!=null && classBean.getText()!=null &&
            nameBean.getText().length()>0 && classBean.getText().length()>0){
                if(number==1 && first){
                    configText.setText("");// suppression de l'exemple
                    configText.setFont(new Font("Serif", Font.PLAIN, 18));
                }
                if(first){
                    beanName = nameBean.getText();
                    first = false;
                    String res = "bean.id."+number+"="+beanName;
                    props.put("bean.id."+number,beanName);
                    String res2 = beanName+".class="+classBean.getText();
                    props.put( beanName+".class",classBean.getText());
                    outFile.println("#");
                    outFile.println(res);
                    outFile.println(res2);
                    configText.setText(configText.getText() + "\n" + res + "\n" + res2 + "\n");
                }
                number++;
                numberBean.setText(Integer.toString(number));
                classBean.setText("");
                classBeanLabel.setText("name.class=");
                nameBean.setText("");
                nameBean.setEnabled(true);
                classBean.setEnabled(true);
                addParamButton.setEnabled(false); 
                nextButton.setEnabled(false);
                paramNumber = 1;
                first=true;
                nameBean.requestFocus();
                pack();
            }
        }
    }

    private class ClearAction implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            classBean.setEnabled(true);
            classBean.requestFocus();
        }
    }

    /** Quelques vérifications du fichier de properties, loin d'être complètes
     * 
     */
    private void verifyProperties() throws RuntimeException{

        java.util.List<Object> cles = new ArrayList<Object>(props.keySet());
        Properties properties = new Properties(props); // copie par prévention
        String premier = properties.getProperty("bean.id.1");
        if(premier==null) throw new RuntimeException("bean.id.1 est absent ???");
        int indexBean=1;
        String id = properties.getProperty("bean.id." +indexBean); // de 1 à N
        java.util.List<String> ids = new ArrayList<String>();
        while(id!=null){
            ids.add(id);
            indexBean++;
            id = properties.getProperty("bean.id." +indexBean);
        }
        Set<String> set = new HashSet<String>(ids);
        if(set.size()<ids.size()){
            for(String s : set){
                ids.remove(s);
            }
            throw new RuntimeException("bean.ids : " + ids + " en doublon...");
        }
        indexBean=1;
        int somme = 0;
        id = properties.getProperty("bean.id." +indexBean); // de 1 à N
        while(id!=null){

            String className = properties.getProperty(id+".class");
            if(className==null) throw new RuntimeException("id présent, mais pas "+id+".class");

            int indexProperty = 1; 
            String propertyName = properties.getProperty(id+".property."+indexProperty);
            while(propertyName!=null){        
                String propertyId = properties.getProperty(id+".property."+indexProperty+".param.1");
                if(propertyId==null)throw new RuntimeException("property présent, mais pas "+id+".property."+indexProperty+".param.1");
                indexProperty++;
                propertyName = properties.getProperty(id+".property."+indexProperty); 
            }
            somme = somme + indexBean;
            cles.remove("bean.id." +indexBean);
            indexBean++;
            id = properties.getProperty("bean.id." +indexBean);
        }

        indexBean--;
        // une suite croissante
        int s = (indexBean*(indexBean+1))/2;// somme des n premiers nombres
        if(s!=somme)throw new RuntimeException("Les *.id.N, ne forment pas une suite croissante ...");
        // cas des clefs restantes
        for(Object c : cles){
            if(((String)c).contains("bean.id")) //il reste (au moins) une clef
                throw new RuntimeException("les id, ne forment pas une suite croissante ...");
        } 
    }

    public static void main(String[] args){
        new GUI();
    }

    private static final String example =
        "#\n" +
        "#verbose=true\n\n"+

        "bean.id.1=invoker\n" +
        "invoker.class=command.Invoker\n" +
        "invoker.property.1=commande\n" +
        "#invoker.property.1.param.1=cmdProjecteur\n" +
        "invoker.property.1.param.1=commandes\n\n" +

        "bean.id.2=lampeDeLAmphi\n" +
        "lampeDeLAmphi.class=command.Light\n\n" +

        "bean.id.3=cmdLampe\n" +
        "cmdLampe.class=command.CommandLight\n" +
        "cmdLampe.property.1=lampe\n" +
        "cmdLampe.property.1.param.1=lampeDeLAmphi\n\n" +

        "bean.id.4=projecteurDeLAmphi\n" +
        "projecteurDeLAmphi.class=command.Projecteur\n\n" +

        "bean.id.5=cmdProjecteur\n" +
        "cmdProjecteur.class=command.CommandeProjecteur\n" +
        "cmdProjecteur.property.1=projecteur\n" +
        "cmdProjecteur.property.1.param.1=projecteurDeLAmphi\n\n" +

        "bean.id.6=commandes\n" +
        "commandes.class=command.MacroCommand\n" +
        "commandes.property.1=commands\n" +
        "commandes.property.1.param.1=cmdProjecteur cmdLampe\n\n";
        
    private static final String example2 =
        "#\n" +
        "bean.id.1=congeAnciennete" + "\n" +
        "congeAnciennete.class=injection_strategie.CongeAvecLePatronStrategie" + "\n" +
        "congeAnciennete.property.1=contexte" + "\n" +
        "congeAnciennete.property.1.param.1=null" + "\n" +
        "congeAnciennete.property.2=operation" + "\n" +
        "congeAnciennete.property.2.param.1=operationCongesAnciennete" + "\n\n" +

        "bean.id.2=operationCongesAnciennete"+ "\n" +
        "operationCongesAnciennete.class=injection_strategie.OperationCongesAnciennete"+ "\n\n" +

        "bean.id.3=operationCongesBonifies"+ "\n" +
        "operationCongesBonifies.class=injection_strategie.OperationCongesBonifies"+ "\n";
}
