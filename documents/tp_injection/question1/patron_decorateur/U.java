package question1.patron_decorateur;


public class U extends Decorateur{
    public U(){}

    public U(Texte texte){
        super(texte);
    }

    public String toHTML(){
        return "<U>" + super.toHTML() + "</U>";
    }
}
