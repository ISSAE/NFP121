package question1.patron_decorateur;

public class B extends Decorateur{
    public B(){}

    public B(Texte texte){
        super(texte);
    }

    public String toHTML(){
        return "<B>" + super.toHTML() + "</B>";
    }
}
