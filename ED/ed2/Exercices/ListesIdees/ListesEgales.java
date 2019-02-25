

/**
 * The test class egaux.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ListesEgales extends junit.framework.TestCase
{
	private ListeP_Tab listeP_T1;
	private Carre carre1;
	private Carre carre2;
	private Carre carre3;
	private ListeP_Rec listeP_R1;
	private ListeP_Java listeP_J1;

    /**
     * Default constructor for test class egaux
     */
    public ListesEgales()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    protected void setUp()
    {
		listeP_T1 = new ListeP_Tab();
		carre1 = new Carre(java.awt.Color.yellow, 123);
		carre2 = new Carre(java.awt.Color.red, 45);
		carre3 = new Carre(78, java.awt.Color.blue);
		listeP_T1.toString();
		listeP_T1.longueur();
		listeP_T1.cons(carre1);
		listeP_T1.cons(carre2);
		listeP_T1.cons(carre3);
		listeP_T1.toString();
		listeP_T1.renverse();
		listeP_T1.longueur();
		listeP_R1 = new ListeP_Rec();
		listeP_R1.cons(carre1);
		listeP_R1.cons(carre2);
		listeP_R1.cons(carre3);
		listeP_J1 = new ListeP_Java();
		listeP_J1.cons(carre1);
		listeP_J1.cons(carre2);
		listeP_J1.cons(carre3);
		listeP_T1.equals(listeP_R1);
		listeP_R1.equals(listeP_J1);
		listeP_J1.longueur();
		listeP_J1.cons(carre1);
		listeP_J1.toString();
		listeP_J1.cdr();
	}

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    protected void tearDown()
    {
    }

	public void testEgales()
	{
		listeP_R1.toString();
		assertEquals(true, listeP_R1.equals(listeP_T1));
		assertEquals(true, listeP_T1.equals(listeP_J1));
		assertEquals(true, listeP_J1.equals(listeP_R1));
		assertEquals(true, listeP_T1.equals(listeP_R1));
	}
}

