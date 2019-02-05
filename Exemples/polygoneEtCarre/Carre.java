
/**
 * Décrivez votre classe Carre ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Carre extends PolygoneRegulier
{
    /**
     * Constructeur Carre
     * @param l : talle du coté
     */
    public Carre(int l) {
        super(l,4);
    }

    public double surface() {
        double l = getLongueurDuCote();
        return l*l;
    }
    
    public String jeSuis()
    {
        return "Carre" ;
    }
}
