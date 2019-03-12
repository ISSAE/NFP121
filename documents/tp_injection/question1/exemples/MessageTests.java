
package question1.exemples;
import java.util.*;
import container.*;

public class MessageTests extends junit.framework.TestCase{

  
    public void testMessage()throws Exception{
        // inspiré de :
        // http://www.springbyexample.org/static/1.5/html/intro-to-ioc-creating-a-spring-application.html
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Message message = ctx.getBean("message");
        assertEquals("Cnam/NFP121 femtoContainer is fun", message.getMessage());
    }

}

