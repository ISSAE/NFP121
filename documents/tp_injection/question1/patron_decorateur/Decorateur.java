package question1.patron_decorateur;

public abstract class Decorateur extends Texte{
    private Texte decorateur;
    public Decorateur(){}
    
    public void setDecorateur(Texte decore){
        this.decorateur = decore;
    }
    
    public Decorateur(Texte decore){
        this.decorateur = decore;
    }

    public String toHTML(){
        return decorateur.toHTML();
    }
}