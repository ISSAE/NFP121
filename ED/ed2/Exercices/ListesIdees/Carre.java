import java.awt.Color;
/**
 * Décrivez votre classe Carre ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class Carre
{
  private int cote;
  private Color couleur;
  Carre(int cote , Color coul){
      this.cote=cote;
      this.couleur=coul;
    }
  Carre(Color coul , int cote){
      this.cote=cote;
      this.couleur=coul;
    }
    public int getCote(){
      return cote;
    }
    public Color getCouleur(){
      return couleur;
    }
    public void setCouleur(Color c){
      couleur=c;
    }  
    public String toString(){
      return "<" + cote + " , " + couleur + ">";
    }  
    public boolean equals(Object oo) 
    {  
        try{
      if(oo.getClass()!=Class.forName("Carre")) return false;
    }catch (ClassNotFoundException cnfe){
        System.out.println("throws ClassNotFoundException");
    }
      return cote==((Carre)oo).getCote() & couleur.equals(((Carre)oo).getCouleur());
    }      
}
