package question1.exemples;

// https://docs.oracle.com/javase/tutorial/javabeans/writing/index.html
// https://www.jmdoudoux.fr/java/dej/chap-javabean.htm

import java.awt.*;
import javax.swing.*;
import java.beans.*;

public class UnBean implements java.io.Serializable {

  private int longueur;

  private PropertyChangeSupport propertySupport;
  private VetoableChangeSupport vetoableSupport;
  
  public UnBean(){
    propertySupport = new PropertyChangeSupport(this);
    vetoableSupport = new VetoableChangeSupport(this);
  }
  
 
  public int getLongueur() {
    return longueur;
  }

  public void setLongueur(int longueur) {
    int oldLongueur = this.longueur;
    this.longueur = longueur;
    try{
      vetoableSupport.fireVetoableChange("longueur",oldLongueur,longueur);
    }catch(PropertyVetoException e) {    
      this.longueur = oldLongueur;
    }
    if ( oldLongueur != this.longueur ) {   
      propertySupport.firePropertyChange("longueur",oldLongueur, longueur);
    }
  }

  // modif set pour femtoContainer, set déclenche add
  public void setPropertyChangeListener(PropertyChangeListener listener){
    addPropertyChangeListener(listener);
  }
  
  public void addPropertyChangeListener(PropertyChangeListener listener) {
    propertySupport.addPropertyChangeListener(listener);
  }
 
  public void removePropertyChangeListener(PropertyChangeListener listener) {
    propertySupport.removePropertyChangeListener(listener);
  }
  
  public void setVetoableChangeListener(VetoableChangeListener listener){
    addVetoableChangeListener(listener);
  }
  public synchronized void addVetoableChangeListener(VetoableChangeListener listener) {
    vetoableSupport.addVetoableChangeListener(listener);
  }

  public synchronized void removeVetoableChangeListener(VetoableChangeListener listener) {
    vetoableSupport.removeVetoableChangeListener(listener);
  } 
  
 
  

  public static void main(String[] args){
    UnBean bean = new UnBean();
    PropertyChangeListener listener1 = new FaceBeanPropertyChangeListener();
    bean.addPropertyChangeListener(listener1);
    PropertyChangeListener listener2 = new FaceBeanPropertyChangeListener();    
    bean.addPropertyChangeListener(listener2);
    
    bean.setLongueur(10);
    bean.setLongueur(100);
    bean.setLongueur(-1);
    bean.setLongueur(10);
    
    
  }
 
}
