
import java.util.*;

/**
 * Décrivez votre classe ListeP_Java ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class ListeP_Java extends ListePointAbstract {

    private LinkedList liste = new LinkedList();

    @Override
    public Object car() {
        return liste.getFirst();
    }

    public void cdr() {
        liste.removeFirst();
        nbreElements--;
    }

    public void cons(Object objet) {
        liste.addFirst(objet);
        nbreElements++;
    }

    public void conc(ListePointInterface li) {
        if (li != null) {
            ListeP_Java temp = (ListeP_Java) li;
            for (Object el : temp) {
                liste.add(el);
            }
        }
    }

    public void renverse() {
        if (!listeVide()) {
            Object o = car();
            cdr();
            renverse();
            liste.add(o);
        }
    }

    public boolean membre(Object objet) {
        return liste.contains(objet);
    }

    public Iterator iterator() {
        return this.liste.iterator();
    }

    public String toString() {
        return liste.toString();
    }

    public boolean equals(Object lst) {
        if (!(lst instanceof ListePointInterface)) {
            return false;
        }
        return liste.toString().equals(((ListePointInterface) lst).toString());
    }

    protected Object clone() {//pas oblig� de retourner l�exception
        try {
            ListeP_Java l = (ListeP_Java) super.clone();
            l.liste = (LinkedList) liste.clone();
//              for( int i=0 ; i<tabImplantation.length ; i++){
//                  l.tabImplantation[i]=tabImplantation[i].clone();
//                 }
            return l;
        } catch (CloneNotSupportedException e) {
            // Ceci n�arrivera pas car Stack est Cloneable
            throw new InternalError();
        }
    }

}
