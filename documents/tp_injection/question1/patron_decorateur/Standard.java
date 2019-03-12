package question1.patron_decorateur;


public class Standard extends Texte{
    private String texte;
    public Standard(){}
    public void setTexte(String texte){
        this.texte = texte;
    }
    public Standard(String texte){
        this.texte = texte;
    }
    public String toHTML(){
       return texte;
    }
}
