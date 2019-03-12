package question1.exemples;
import javax.swing.*;
import java.awt.event.*;
public class ActionAuClick implements ActionListener{

    public void actionPerformed(ActionEvent ae){
      System.out.println(ae.getActionCommand());
      ihm.getJFrame().add(new JLabel(ae.getActionCommand()));
      ihm.getJFrame().pack();
    }
    
    private IHM ihm;
    public void setIhm(IHM ihm){
      this.ihm = ihm;
    }
}
