
package question1.exemples;
import java.util.*;
import container.*;

public class CoursTests extends junit.framework.TestCase{

    
    public void testCours()throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Cours cours = ctx.getBean("cours");
        assertEquals(LinkedList.class,cours.getInscrits().getClass());
        // TODO
    }
}

