package question1.exemples;

import java.util.*;
import container.*;
import config_editor.GUI;

public class ConfigEditorTests extends junit.framework.TestCase{

    
    public void testConfigEditor()throws Exception{
        ApplicationContext ctx = Factory.createApplicationContext("./question1/exemples/README.TXT");
        GUI gui = ctx.getBean("config_editor");
        // TODO
    }
}