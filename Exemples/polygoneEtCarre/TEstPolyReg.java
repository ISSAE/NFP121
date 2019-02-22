
/**
 * Décrivez votre classe TEstPolyReg ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class TEstPolyReg
{
    public static void main(String args[]){
    PolygoneRegulier p1 = new PolygoneRegulier();
    PolygoneRegulier p2 = new PolygoneRegulier();

    p1.initialiser(4,100); 
    System.out.println(" surface de p1 = " + p1.surface());

    p2.initialiser(5,10);
    System.out.println(" perimetre de p2 = " + p2.perimetre());

  }

}
