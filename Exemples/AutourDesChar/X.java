
/**
 * Décrivez votre classe X ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class X
{

    /**
     * Constructeur d'objets de classe X
     */
    public X()
    {

    }

    public static String translate(String src)
    {
        StringBuffer result = new StringBuffer();
        if(src!=null && src.length()!=0)
        {
            int index = -1;
            char c = (char)0;
            String chars=	"àâäéèêëîïôöùûüç- ";
            String replace=	"aaaeeeeiioouuuc__";
            for(int i=0; i<src.length(); i++)
            {
                c = src.charAt(i);
                if( (index=chars.indexOf(c))!=-1 )
                    result.append(replace.charAt(index));
                else
                    result.append(c);
            }
        };
        return result.toString();
    }

    /**
     * Un exemple de méthode - remplacez ce commentaire par le vôtre
     *
     * @param  y   le paramètre de la méthode
     * @return     la somme de x et de ypublic static String translate(String src)
     */
    public static void apprendre()
    {
        String s="AÀaàZzäeéèëiï_-^`'";
        for (char i=0; i < s.length(); i++) {
            char x=s.charAt(i);
            System.out.printf("%n%c <%d>= %b %d %d%n",x, (int) x,Character.isLetter(x),
                Character.getType(x),
                Character.getNumericValue(x));
        }

    }
}
