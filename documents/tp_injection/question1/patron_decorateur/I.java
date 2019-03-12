package question1.patron_decorateur;

public class I extends Decorateur{
    public I(){}

    public I(Texte texte){
        super(texte);
    }

    public String toHTML(){
        return "<I>" + super.toHTML() + "</I>";
    }
}