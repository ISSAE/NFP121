
package question1.exemples;
import java.util.*;
import container.*;

public class AllTests extends junit.framework.TestCase{

    public void testTable() throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Table<Integer> table = (Table<Integer>) ctx.getBean("table");
        table.ajouter(4);table.ajouter(2);table.ajouter(3);table.ajouter(1);
        assertEquals("[4, 2, 3, 1]",table.toString());
        try{
            table.ajouter(5);
            fail("Une exception doit être levée, la capacité de la table est atteinte...");
        }catch(Exception e){
        }
        assertEquals(Table.class,ctx.getType("table"));
        Table<Integer> table2 = (Table<Integer>) ctx.getBean("table");
        assertSame(table, table2);
    }

    public void testTable2() throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Table<Integer> table = (Table<Integer>) ctx.getBean("table2");
        assertEquals(Table.class,ctx.getType("table2"));
        table.ajouter(4);table.ajouter(2);table.ajouter(2);table.ajouter(1);
        assertEquals("[4, 2, 2, 1]",table.toString());
        try{
            table.ajouter(5);
            fail("Une exception doit être levée, la capacité de la table est atteinte...");
        }catch(Exception e){
        }

    }

    public void testTable3() throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Table<Integer> table = (Table<Integer>) ctx.getBean("tableSet");
        table.ajouter(4);table.ajouter(2);table.ajouter(2);table.ajouter(1);
        assertEquals("[1, 2, 4]",table.toString());
        try{
            table.ajouter(3);
            assertEquals("[1, 2, 3, 4]",table.toString());
            table.ajouter(6);
            fail("Une exception doit être levée, la capacité de la table est atteinte...");
        }catch(Exception e){
        }
        assertEquals(Table.class,ctx.getType("tableSet"));
    }	

    public void testTwoContainers()throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Table<Integer> table = (Table<Integer>) ctx.getBean("tableSet");
        table.ajouter(4);table.ajouter(2);table.ajouter(2);table.ajouter(1);
        assertEquals("[1, 2, 4]",table.toString());

        ApplicationContext ctx2 = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Table<Integer> table2 = (Table<Integer>) ctx2.getBean("tableSet");
        table2.ajouter(4);table2.ajouter(2);table2.ajouter(2);table2.ajouter(1);
        assertEquals("[1, 2, 4]",table2.toString());

        table.ajouter(3);
        assertEquals("[1, 2, 3, 4]",table.toString());
        assertEquals("[1, 2, 4]",table2.toString());
    }

    public void testMessage()throws Exception{
        // inspiré de :
        // http://www.springbyexample.org/static/1.5/html/intro-to-ioc-creating-a-spring-application.html
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Message message = (Message) ctx.getBean("message");
        assertEquals("Cnam/NFP121 femtoContainer is fun", message.getMessage());
    }

    public void testProperties()throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        PropertiesType properties = (PropertiesType) ctx.getBean("properties");
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
    }

    public void testIHM()throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        IHM ihm = (IHM) ctx.getBean("ihm");
        ihm.draw();
        ihm.doClick("un premier click !");
        ihm.doClick("un second ! ");
        Thread.sleep(1000);
        ihm.close();
    }

    public void testMVC()throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Vue vue = (Vue) ctx.getBean("vue");
        vue.click();
        assertEquals(1, vue.compte);
        vue.click();
        assertEquals(2, vue.compte);
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

    public void testCours()throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Cours cours = (Cours) ctx.getBean("cours");
        assertEquals(LinkedList.class,cours.getInscrits().getClass());
    }
}

