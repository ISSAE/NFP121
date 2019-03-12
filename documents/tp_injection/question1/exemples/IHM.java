package question1.exemples;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class IHM{
  private JFrame jFrame;
  private JButton jButton;
  
  public IHM(){this.jButton = new JButton(" click ! ");}
  public void setJFrame(JFrame jFrame){this.jFrame = jFrame;}
  public JFrame getJFrame(){return jFrame;}
  public void setLayout(LayoutManager layout){this.jFrame.setLayout(layout);}
  public LayoutManager getLayout(){return jFrame.getLayout();}
  public void setListener(ActionListener listener){
    this.jButton.addActionListener(listener);
  }
  
  public void draw(){
    jFrame.add(jButton);
    jFrame.pack();
    jFrame.setVisible(true);
    
    WindowListener l = new WindowAdapter() {
      public void windowClosing(WindowEvent e){
        System.exit(0);
      }
    };
    jFrame.addWindowListener(l);
  }
  public void doClick(String str){
    jButton.setActionCommand(str);
    jButton.doClick(500);
  }
  public void close(){
    jFrame.dispose();
  }
}
