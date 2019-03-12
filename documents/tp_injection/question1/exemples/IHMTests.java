
package question1.exemples;
import java.util.*;
import container.*;

public class IHMTests extends junit.framework.TestCase{

  
  public void testIHM()throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        IHM ihm = (IHM) ctx.getBean("ihm");
        ihm.draw();
        ihm.doClick("un premier click !");
        ihm.doClick("un second ! ");
        Thread.sleep(1000);
        ihm.close();
    }
    public void testIHM2()throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        ctx.addApplicationContext(Factory.createApplicationContext("./question1/exemples/configIHM2.props"));

        IHM ihm = (IHM) ctx.getBean("ihm2");
        ihm.draw();
        ihm.doClick("un premier click !");
        ihm.doClick("un deuxième ! ");
        ihm.doClick("un troisième ! ");
        ihm.doClick("un dernier ");
        Thread.sleep(1000);
        ihm.close();
    }

    public void testIHM3()throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/configIHM3.props");
        IHM ihm = (IHM) ctx.getBean("ihm3");
        ihm.draw();
        ihm.doClick("un premier click !");
        ihm.doClick("un deuxième ! ");
        ihm.doClick("un troisième ! ");
        ihm.doClick("un dernier ");
        Thread.sleep(1000);
        ihm.close();
    }
    
   
}

