package question1.exemples;


public class Vue{
  private Controleur controleur;
  public int compte;
  
  public void update(){
    compte++;
  }
  public void click(){
    controleur.action();
  }
  public void setControleur(Controleur c){
    this.controleur = c;
  }
}
