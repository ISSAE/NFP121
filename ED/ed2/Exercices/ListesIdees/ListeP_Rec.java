
import java.util.*;

/**
 * D�crivez votre classe ListeP_R ici.
 *
 * @author (votre nom)
 * @version (un num�ro de version ou une date)
 */
public class ListeP_Rec extends ListePointAbstract implements Iterable {

    private Maillon elem;

    /**
     * retourne la valeur du premier �l�ment de la liste sans destruction
     */
    public Object car() {
        assert nbreElements != 0 : "on ne peut pas obtenir la tête d'une liste vide";
        return elem.valeur();
    }

    /**
     * supprime la tete de la liste remarque : on ne peut pas supprimer la t�te
     * d'une liste vide
     */
    public void cdr() {  //throws ListeVideException{
        assert nbreElements != 0 : "on ne peut pas supprimer la t�te d'une liste vide";
        elem = elem.suite();
        nbreElements--;
    }

    /**
     * ajoute 'obj' au d�but de la liste; la longueur de la liste est augment�e
     * de 1
     */
    public void cons(Object obj) {
        elem = new Maillon(obj, elem);
        nbreElements++;
    }

    /**
     * ajoute en fin de liste la liste 'liste'
     */
    public void conc(ListePointInterface liste) {
        if (listeVide()) {
            elem = ((ListeP_Rec) liste).maillonDeTete();
        } else {
            ajouterDerriere(((ListeP_Rec) liste).maillonDeTete());
        }
    }

    /**
     *
     */
    public void renverse() {
        Maillon temp = null;
        for (Object el : elem) {
            temp = new Maillon(el, temp);
        }
        elem = temp;
    }

    /**
     * 'objet' appartient-il � la liste ?
     */
    public boolean membre(Object objet) {
        if (listeVide()) {
            return false;
        }
        Maillon temp = elem;
        do {
            if (temp.valeur().equals(objet)) {
                return true;
            }
            temp = temp.suite();
        } while (temp != null);
        return false;
    }
//     public  boolean listeVide(){
//         return nbreElements==0;
//     }
//     public  int longueur(){
//         return nbreElements;
//     }

    public String toString() {
        return "[" + elem.toString() + "]";
    }

//      public boolean  equals(Object lst){
//          
//          if(!(lst instanceof ListePointInterface)) return false;
//          return lst.toString().equals(((ListePointInterface)lst).toString());   
//          /*
//          return this.nbreElements==((ListePointInterface)obj).longueur() &&
//          elem.equals(((ListeP_Rec)obj).maillonDeTete());
//          */
//     }
// 
    public Iterator iterator() {
        return new Iterator() {
            Maillon temp = elem;

            public boolean hasNext() {
                return temp != null;
            }

            public Object next() {
                Object el = temp.valeur();
                temp = temp.suite();
                return el;
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    protected Object clone() {//pas oblig� de retourner l�exception
        try {
            ListeP_Rec l = (ListeP_Rec) super.clone();
            l.elem = (Maillon) elem.clone();
//              for( int i=0 ; i<tabImplantation.length ; i++){
//                  l.tabImplantation[i]=tabImplantation[i].clone();
//                 }
            return l;
        } catch (CloneNotSupportedException e) {
            // Ceci n�arrivera pas car Stack est Cloneable
            throw new InternalError();
        }
    }

    //-------------------------------------
    //-------------------------------------       
    //m�thodes de service
    private Maillon maillonDeTete() {
        return elem;
    }

    private void ajouterDerriere(Maillon m) {
        Maillon mm = elem;
        while (mm.suite() != null) {
            mm = mm.suite();
        }
        assert mm.suite() == null;
        mm.modifSuite(m);
        nbreElements++;
    }
    // fin des m�thodes de service
    //-------------------------------------
    //-------------------------------------       

    private class Maillon implements Iterable<Object> {

        private Object valeur;
        private Maillon suite;

        public Maillon(Object valeur) {
            this.valeur = valeur;
            this.suite = null;
        }

        public Maillon(Object valeur, Maillon suite) {
            this.valeur = valeur;
            this.suite = suite;
        }

        public Object valeur() {
            return valeur;
        }

        public Maillon suite() {
            return suite;
        }

        public void modifSuite(Maillon m) {
            suite = m;
        }

        public boolean equals(Object that) {
            if (!(that instanceof Maillon)) {
                return false;
            }
            return this.valeur.equals(((Maillon) that).valeur)
                    && (this.suite == ((Maillon) that).suite
                    || this.suite.equals(((Maillon) that).suite));

        }

        public String toString() {
            return valeur + ((suite != null) ? ", " + suite : "");
        }

        public Iterator<Object> iterator() {
            return new Iterator<Object>() {
                Maillon temp = new Maillon(valeur, suite);

                public boolean hasNext() {
                    return temp != null;
                }

                public Object next() {
                    Object el = temp.valeur();
                    temp = temp.suite();
                    return el;
                }

                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
        }

        protected Object clone() {//pas oblig� de retourner l�exception
            try {
                Maillon m = (Maillon) super.clone();
                //            m.valeur=valeur.clone();
                m.suite = (Maillon) suite.clone();
//              for( int i=0 ; i<tabImplantation.length ; i++){
//                  l.tabImplantation[i]=tabImplantation[i].clone();
//                 }
                return m;
            } catch (CloneNotSupportedException e) {
                // Ceci n�arrivera pas car Stack est Cloneable
                throw new InternalError();
            }
        }

    }
}
