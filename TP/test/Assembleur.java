

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * Décrivez votre classe Assembleur ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Assembleur {
    A a;
    /**
     * Constructeur d'objets de classe Assembleur
     * @throws java.lang.Exception
     */
    public Assembleur() throws Exception {
        Properties props = new Properties();
// chargement de la table des propriétés par une lecture du fichier
        props.load(new FileInputStream(new File("assembleur.props")));
// chargement de la classe, à partir de la clef
        Class<?> c
                = Class.forName(props.getProperty("implementation_i_class"));

// création d’une instance, appel du constructeur par défaut
        I i = (I) c.newInstance();

// injection de cette instance, à la création de a
        a = new A(i);
    }

    public A getA() {
         return a;
    }
    
    public static void main (String args[]) throws Exception {
        Assembleur ass = new Assembleur();
        A a = ass.getA();
        System.out.printf("a.sampleMethod(%d) =%d\n", 5,a.sampleMethod(5)); 
        
    }
}
