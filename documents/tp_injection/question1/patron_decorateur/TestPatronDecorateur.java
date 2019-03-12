package question1.patron_decorateur;

import container.*;

public class TestPatronDecorateur extends junit.framework.TestCase{
 

  public void testDecorateur()throws Exception{
    ApplicationContext ctx = Factory.createApplicationContext("./question1/patron_decorateur/README.TXT");
 
    Texte texte = ctx.getBean("texte");
    //System.out.println("texte: " + texte.toHTML());
    assertEquals("<U>bonjour</U>", texte.toHTML());
  }
  
  public void testDecorateurBis()throws Exception{
    ApplicationContext ctx = Factory.createApplicationContext("./question1/patron_decorateur/README.TXT");
 
    Texte texte2 = ctx.getBean("texte2");
    //System.out.println("texte: " + texte2.toHTML());
    assertEquals("<U><I><B>bonsoir</B></I></U>",texte2.toHTML());
  }

 

}

