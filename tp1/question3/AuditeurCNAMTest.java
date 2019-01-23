package question3;

/**
 * Classe-test AuditeurCNAMTest.
 * 
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 * 
 *          Les classes-test sont documentées ici :
 *          http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 *          et sont basées sur le document © 2002 Robert A. Ballance intitulé
 *          «JUnit: Unit Testing Framework».
 * 
 *          Les objets Test (et TestSuite) sont associés aux classes à tester
 *          par la simple relation yyyTest (e.g. qu'un Test de la classe
 *          Name.java se nommera NameTest.java); les deux se retrouvent dans le
 *          même paquetage. Les "engagements" (anglais : "fixture") forment un
 *          ensemble de conditions qui sont vraies pour chaque méthode Test à
 *          exécuter. Il peut y avoir plus d'une méthode Test dans une classe
 *          Test; leur ensemble forme un objet TestSuite. BlueJ découvrira
 *          automatiquement (par introspection) les méthodes Test de votre
 *          classe Test et générera la TestSuite conséquente. Chaque appel d'une
 *          méthode Test sera précédé d'un appel de setUp(), qui réalise les
 *          engagements, et suivi d'un appel à tearDown(), qui les détruit.
 */
public class AuditeurCNAMTest extends junit.framework.TestCase {
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).

    /**
     * Constructeur de la classe-test AuditeurCNAMTest.
     */
    public AuditeurCNAMTest() {
    }

    /**
     * Met en place les engagements.
     * 
     * Méthode appelée avant chaque appel de méthode de test.
     */
    protected void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
    }

    /**
     * Supprime les engagements
     * 
     * Méthode appelée après chaque appel de méthode de test.
     */
    protected void tearDown() // throws java.lang.Exception
    {
        // Libérez ici les ressources engagées par setUp()
    }

    /*
     * Il ne vous reste plus qu'à définir une ou plusieurs méthodes de test. Ces
     * méthodes doivent vérifier les résultats attendus à l'aide d'assertions
     * assertTrue(<boolean>). Par convention, leurs noms devraient débuter par
     * "test". Vous pouvez ébaucher le corps grace au menu contextuel
     * "Enregistrer une méthode de test".
     */

    /** Un test de la méthode toString(). */
    public void test_toString() {
        question3.AuditeurCNAM auditeur1 = new question3.AuditeurCNAM("Dupont",
                "paul", "03-1234");
        assertEquals("Dupont paul login : dupont_p", auditeur1.toString());
    }

    public void test_nom_court() {
        question3.AuditeurCNAM auditeur1 = new question3.AuditeurCNAM("paul",
                "pierre", "12345");
        assertEquals("paul", auditeur1.nom());
        assertEquals("pierre", auditeur1.prenom());
        assertEquals("paul_p", auditeur1.login());
    }

    public void test_nom_court_bis() {
        question3.AuditeurCNAM auditeur1 = new question3.AuditeurCNAM("thon",
                "germon", "12345");
        assertEquals("Mr thon germon", "thon", auditeur1.nom());
        assertEquals("Mr thon germon", "germon", auditeur1.prenom());
        assertEquals("Mr thon germon", "thon_g", auditeur1.login());
    }

    public void test_nom_avec_particule() {
        question3.AuditeurCNAM auditeur1 = new question3.AuditeurCNAM(
                "le Thon", "alban", "12345");
        assertEquals("Mr le Thon albacore ", "le Thon", auditeur1.nom());
        assertEquals("Mr le Thon albacore ", "alban", auditeur1.prenom());
        assertEquals(" matricule ?", "12345", auditeur1.matricule());
        assertEquals(" login ? ", "le_tho_a", auditeur1.login());
    }

    public void test_nom_compose() {
        question3.AuditeurCNAM auditeur1 = new question3.AuditeurCNAM(
                "Ton-Ton", "max", "12345");
        assertEquals("Mr Ton-Ton max ", "Ton-Ton", auditeur1.nom());
        assertEquals("Mr Ton-Ton max ", "max", auditeur1.prenom());
        assertEquals("Mr Ton-Ton max ", "ton_to_m", auditeur1.login());
    }

    public void test_nom_court_avec_particule() {

        question3.AuditeurCNAM auditeur1 = new question3.AuditeurCNAM("Te-Te",
                "max", "12345");
        assertEquals("Mr Te-Te max ", "Te-Te", auditeur1.nom());
        assertEquals("Mr Te-Te max ", "max", auditeur1.prenom());
        assertEquals("nom court avec particules ? ", "te_te_m",
            auditeur1.login());
    }

    public void test_nom_avec_accent() {
        question3.AuditeurCNAM auditeur1 = new question3.AuditeurCNAM("Chloé",
                "chloé", "12345");
        assertEquals("Mme Chloé chloé ", "Chloé", auditeur1.nom());
        assertEquals("Mme Chloé chloé ", "chloé", auditeur1.prenom());
        assertEquals(" nom avec accent (é devient e) ? ", "chloe_c",
            auditeur1.login());
    }
}
