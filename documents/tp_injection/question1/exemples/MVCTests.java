
package question1.exemples;
import java.util.*;
import container.*;

public class MVCTests extends junit.framework.TestCase{

  

    public void testMVC()throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Vue vue = (Vue) ctx.getBean("vue");
        vue.click();
        assertEquals(1, vue.compte);
        vue.click();
        assertEquals(2, vue.compte);
    }

  
}

