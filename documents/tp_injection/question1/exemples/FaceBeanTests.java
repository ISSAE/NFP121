package question1.exemples;

import javax.swing.*;
import java.beans.*;
import container.*;

public class FaceBeanTests extends junit.framework.TestCase{

  public void testFaceBean() throws Exception{
    ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/configBean.props");
    //ApplicationContext ctx = Factory.createApplicationContext("question1/README.TXT");
    UnBean bean = (UnBean) ctx.getBean("unBean");
    assertEquals(100, bean.getLongueur());
  }
  
  public void testFirePropertyChange(){
    ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/configBean.props");
    UnBean bean = (UnBean) ctx.getBean("unBean");
    bean.setLongueur(10);
    PropertyChangeListener listener1 = (PropertyChangeListener) ctx.getBean("listener1");
    assertTrue(listener1 instanceof FaceBeanPropertyChangeListener);
    FaceBeanPropertyChangeListener listener = (FaceBeanPropertyChangeListener)listener1;
    
    assertEquals(10, listener.valeurLongueurRecue);
    assertEquals(10, bean.getLongueur());
    bean.setLongueur(-1); // un véto a été installé, cf config
    assertEquals(10, bean.getLongueur());
     
  }
  
  public void testFirePropertyChangeSansInjection(){
    UnBean bean = new UnBean();
    PropertyChangeListener listener1 = new FaceBeanPropertyChangeListener();
    bean.addPropertyChangeListener(listener1);
    bean.setLongueur(100);
    assertTrue(listener1 instanceof FaceBeanPropertyChangeListener);
    FaceBeanPropertyChangeListener listener = (FaceBeanPropertyChangeListener)listener1;
    assertEquals(100, listener.valeurLongueurRecue);

  }


}

