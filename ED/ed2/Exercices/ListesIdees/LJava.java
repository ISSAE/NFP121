
/**
 * The test class LJava.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LJava extends junit.framework.TestCase {

    private ListeP_Java listeP_J1;
    private Carre carre1;
    private Carre carre2;
    private Carre carre3;

    /**
     * Default constructor for test class LJava
     */
    public LJava() {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp() {
        listeP_J1 = new ListeP_Java();
        carre1 = new Carre(45, java.awt.Color.blue);
        carre2 = new Carre(java.awt.Color.red, 78);
        carre3 = new Carre(java.awt.Color.yellow, 123);
        listeP_J1.cons(carre1);
        listeP_J1.cons(carre2);
        listeP_J1.cons(carre3);
        listeP_J1.longueur();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @Override
    protected void tearDown() {
    }

    public void testLjava() {
        listeP_J1.toString();
        assertEquals(3, listeP_J1.longueur());
        listeP_J1.toString();
    }
}
