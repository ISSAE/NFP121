package question1.exemples;
import java.beans.*;

public class FaceBeanPropertyChangeListener 
    implements PropertyChangeListener, VetoableChangeListener{
      
  public int valeurLongueurRecue=0;
  
  @Override
  public void propertyChange(PropertyChangeEvent e) {
    String propertyName = e.getPropertyName();
    if ("longueur".equals(propertyName)) {
      System.out.println("longueur a changé : " + e.getNewValue());
      valeurLongueurRecue = (Integer)e.getNewValue();
    } //else if ("focusedWindow".equals(propertyName) {
    //...
    //}
  }
   @Override
  public void vetoableChange(PropertyChangeEvent e) throws PropertyVetoException {
    String propertyName = e.getPropertyName();
    if ("longueur".equals(propertyName)) {
      if( ((Integer)e.getNewValue()) <=0){
        System.out.println("longueur a un veto : " + e.getNewValue());
        throw new PropertyVetoException("valeur négative ou nulle",e);
      }
      valeurLongueurRecue = (Integer)e.getNewValue();
    } //else if ("focusedWindow".equals(propertyName) {
    //...
    //}
  }
}
