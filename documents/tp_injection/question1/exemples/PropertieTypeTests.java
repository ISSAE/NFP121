
package question1.exemples;
import java.util.*;
import container.*;

public class PropertieTypeTests extends junit.framework.TestCase{

   
    public void testProperties()throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        PropertiesType properties = ctx.getBean("properties");
        assertEquals(1, properties.getB());
        assertEquals(1, properties.getS());
        assertEquals(1, properties.getI());
        assertEquals(1L, properties.getL());
        assertEquals(1.0F, properties.getF(),0.1);
        assertEquals(1.0, properties.getD(),0.1);
        assertEquals(true, properties.getBool());

        assertEquals(7, properties.calcul());
        assertEquals(7, properties.calcul());

        assertEquals(3, properties.getTables().length);
        
        
        int somme = 0;
        for(int i : properties.getTab()){
            somme = somme + i;
        }
        int n = properties.getTab().length;
        int sommeDesNPremiersNombres = n*(n+1)/2;
        assertEquals(sommeDesNPremiersNombres,somme);
        
        assertEquals(String.class, properties.getClasse());
    }

   
}

