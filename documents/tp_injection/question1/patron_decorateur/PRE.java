package question1.patron_decorateur;



public class PRE extends Decorateur{
    public PRE(){}

    public PRE(Texte texte){
        super(texte);
    }

    public String toHTML(){
        return "<PRE>" + super.toHTML() + "</PRE>";
    }
}