
package question1.exemples;
import java.util.*;
import container.*;

public class TableTests extends junit.framework.TestCase{

    public void testTable() throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Table<Integer> table =  ctx.getBean("table");
        table.ajouter(4);table.ajouter(2);table.ajouter(3);table.ajouter(1);
        assertEquals("[4, 2, 3, 1]",table.toString());
        try{
            table.ajouter(5);
            fail("Une exception doit être levée, la capacité de la table est atteinte...");
        }catch(Exception e){
        }
        assertEquals(Table.class,ctx.getType("table"));
        Table<Integer> table2 = ctx.getBean("table");
        assertSame(table, table2);
    }

    public void testTable2() throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Table<Integer> table =  ctx.getBean("table2");
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
        Table<Integer> table = ctx.getBean("tableSet");
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
        Table<Integer> table = ctx.getBean("tableSet");
        table.ajouter(4);table.ajouter(2);table.ajouter(2);table.ajouter(1);
        assertEquals("[1, 2, 4]",table.toString());

        ApplicationContext ctx2 = Factory.createApplicationContext("./question1/exemples/README.TXT");
        Table<Integer> table2 = ctx2.getBean("tableSet");
        table2.ajouter(4);table2.ajouter(2);table2.ajouter(2);table2.ajouter(1);
        assertEquals("[1, 2, 4]",table2.toString());

        table.ajouter(3);
        assertEquals("[1, 2, 3, 4]",table.toString());
        assertEquals("[1, 2, 4]",table2.toString());
    }

   
}

