import java.lang.Math;
/**
 * Polygone Regulier
 * @author Pascal Fares
 * @version 0.1
 */
public class PolygoneRegulier
{
    /**
     * La lobgueur d'un coté
     */
    private int longueurDuCote;
    /**
     * Le nombre de cotés
     */
    private int nombreDeCotes;

    /**
     * Constructeur par défaut
     */
    public PolygoneRegulier() 
    {
        longueurDuCote=0;
        nombreDeCotes=0;
    }
    /**
     * Conctructeur publique
     * @param l : longueur d'un coté
     * @param nb : nombre de cotés
     */
    public PolygoneRegulier(int l,int nb) 
    {
        longueurDuCote=l;
        nombreDeCotes=nb;
    }

    /**
     * initialiser/Reinitialiser un polygoneRegulier
     */
    public void initialiser( int nCotes, int longueur){
        nombreDeCotes = nCotes;
        longueurDuCote = longueur;
    }

    /**
     * <h2>Calcul surface polygone régulier</h2>
     * 
     * <p>Voir pour les informations sur les polygone régulier 
     * https://fr.wikipedia.org/wiki/Polygone_r%C3%A9gulier
     * </p>
     * <p>n*a^2/4*tan(PI/n)</p>
     * @return la surface du plolygone régulier
     */
    public double surface() {
        return (
            nombreDeCotes*(longueurDuCote*longueurDuCote))
        /
        (4*Math.tan(Math.PI/nombreDeCotes)
        );
    }

    /**
     * Périmétre
     * @return le périmétre du plolygone régulier
     */
    public double perimetre() {
        return nombreDeCotes*longueurDuCote;
    }

    /**
     * Obtenir longueur coté
     */
    public int getLongueurDuCote() {
        return longueurDuCote;
    }

}
