package question1.patron_commande;


import java.util.*;
import container.*;

public class TestCommandPattern extends junit.framework.TestCase{
 

  public void testLight()throws Exception{
    ApplicationContext ctx = Factory.createApplicationContext("./question1/patron_commande/README.TXT");
    // 
    Invoker invoker =  ctx.getBean("invoker");
    Receiver receiver =  ctx.getBean("lampe");
    
    assertEquals("Off", receiver.getState());
    invoker.on();
    assertEquals("On", receiver.getState());
  }

 

}

