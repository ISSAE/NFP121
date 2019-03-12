package question1.exemples;


public class Controleur{
  private Modele modele;
  public void setModele(Modele m){
    this.modele = m;
  }
  public void action(){
    modele.change();
  }
}
