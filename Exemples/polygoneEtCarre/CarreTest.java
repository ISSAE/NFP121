

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Classe-test CarreTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class CarreTest
{


    /**
     * Constructeur de la classe-test CarreTest
     */
    public CarreTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

    @Test
    public void testSurface()
    {
        Carre carre1 = new Carre(1);
        assertEquals(1, carre1.surface(), 0);
    }
    
    @Test
    public void testSurface2()
    {
        PolygoneRegulier polygone = new Carre(1);
        assertEquals(1, polygone.surface(), 0);
    }

    @Test
    public void testDeclareConstate()
    {
        PolygoneRegulier polygone1;
        Carre carre1 = new Carre(10);
        assertEquals("Carre", carre1.jeSuis());
        polygone1 = carre1;
        //La ligne qui suit crée une erreur de compilation 
        //jeSuis pas déclaré dans PolygoneRegulier
        //Essdayer d' enlever le commentaire
        /* assertEquals("Carre", polygone1.jeSuis());
        /**/
        //Celle ci fonctionne et c' est bien surface de Carré quii est utilisé
        //Le type constaté
        assertEquals(100.0, polygone1.surface(),0.0);
    }
}


