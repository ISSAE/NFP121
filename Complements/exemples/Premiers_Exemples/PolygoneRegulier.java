import java.lang.Math;
/**
 * Polygone Regulier
 *
 * @author Pascal Fares
 * @version 0.1
 */
public class PolygoneRegulier
{
    // variables d'instance
    /**
     * La lobgueur d'un coté
     */
    private int longueurDuCote;
    /**
     * Le nombre de cotés
     */
    private int nombreDeCotes;
    private Couleur couleur;

    /**
     * Conctructeur publique
     * @param l : longueur d'un coté
     * @param nb : nombre de cotés
     */
    public PolygoneRegulier(int l,int nb) 
    {
        longueurDuCote=l;
        nombreDeCotes=nb;
        couleur = Couleur.NOIR;
    }

    /**
     * <h2>Calcul surface polygone régulier</h2>
     * 
     * <p>Voir pour les informations sur les polygone régulier https://fr.wikipedia.org/wiki/Polygone_r%C3%A9gulier
     * </p>
     * <p>n*a^2/4*tan(PI/n)</p>
     */
    public double surface() {
        return (
            nombreDeCotes*(longueurDuCote*longueurDuCote))
            /
            (4*Math.tan(Math.PI/nombreDeCotes)
        );
    }
    
    /**
     * Obtenir longueur coté
     */
    public int getLongueurDuCote() {
        return longueurDuCote;
    }
    
}
