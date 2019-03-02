
import java.util.Iterator;

/**
 * D�crivez votre classe ListeP_T ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class ListeP_Tab extends ListePointAbstract {

    /**
     * ATTENTION, ATTENTION, il est plus facile d'ajouter des objets � la fin
     * d'un tableau qu'au d�but d'un tableau car en ajoutant au d�but il
     * faudrait � chaque fois d�caler tous les �l�ments du tableau. Alors dans
     * le tableau d'implantation 'liste' la t�te de liste est le dernier du
     * tableau
     */
    private Object[] tabImplantation;
//    private int nbreElements;  // nombre d'�l�ments de la tabImplantation :  toujours nbreElements<=tabImplantation.length

    public ListeP_Tab() {
        tabImplantation = new Object[3];
    }

    /**
     * retourne la t�te de la tabImplantation.lecture seulement
     *
     * @return
     * @throws ListeVideException
     */
    @Override
    public Object car() throws ListeVideException {
        if (listeVide()) {
            throw new ListeVideException();
        }
        return tabImplantation[nbreElements - 1];
    }

    /**
     * destruction du premier élément de la tabImplantation ATTENTION au
     * redimensionnement du tableau quand c'est nécessaire
     */
    public void cdr() throws ListeVideException {
        assert nbreElements != 0 : "on ne peut pas supprimer la tête d'une tabImplantation vide";
        tabImplantation[nbreElements - 1] = null;
        if (nbreElements + 3 < tabImplantation.length) {  // diminution du nbreElements de tabImplantation devenu trop grande
            Object[] temp = new Object[tabImplantation.length - 3];
            System.arraycopy(tabImplantation, 0, temp, 0, nbreElements);
            tabImplantation = temp;
        }
        nbreElements--;
    }

    /**
     * procédure : ajout d'un objet quelconque en d�but de tabImplantation
     * ATTENTION le tableau tabImplantation peut �tre plein cf java.lang.System
     * pour arraycopy(Object src, int srcPos, Object dest, int destPos, int
     * length)
     */
    public void cons(Object objet) {
        if (nbreElements == tabImplantation.length) {
            Object[] temp = new Object[nbreElements + 3];
            System.arraycopy(tabImplantation, 0, temp, 0, nbreElements);
            tabImplantation = temp;
        }
        tabImplantation[nbreElements] = objet;
        nbreElements++;
    }

    /**
     * procédure : concat�nation d'une tabImplantation sur 'this' ATTENTION
     * cette version ne permet que la concat�nation d'une 'ListeP_Tab' r�fl�chir
     * � la version g�n�rale...
     */
    public void conc(ListePointInterface lst) {
        if (listeVide()) {
            System.arraycopy(((ListeP_Tab) lst).tabImplantation, 0, tabImplantation, 0, ((ListeP_Tab) lst).longueur());
        } else {
            if (lst.listeVide()) {
            } else {
                Object[] temp = new Object[nbreElements + lst.longueur() + 3];
                // ATTENTION exception lev�e si une des 2 tabImplantations est nulle
                System.arraycopy(((ListeP_Tab) lst).tabImplantation, 0, temp, 0, lst.longueur());
                System.arraycopy(this.tabImplantation, 0, temp, lst.longueur(), nbreElements);
                this.tabImplantation = temp;
                nbreElements = nbreElements + lst.longueur();
            }
        }
    }

    /**
     * proc�dure : retouner une tabImplantation sur elle m�me
     */
    public void renverse() {
        if (nbreElements != 0 & nbreElements != 1) {
            Object[] temp = new Object[nbreElements];
            for (int i = 0; i < nbreElements; i++) {
                temp[i] = tabImplantation[nbreElements - 1 - i];
            }
            tabImplantation = temp;
        }
    }

    /**
     * pr�dicat : objet est -il membre de la tabImplantation ? ATTENTION � ne
     * pas comparer n'importe quoi et obtenir "un false silecieux"
     */
    public boolean membre(Object objet) {
        for (int i = 0; i < nbreElements; i++) {
            /*            if(tabImplantation[i].getClass()==objet.getClass()) {
                if(tabImplantation[i].getClass().cast(tabImplantation[i]).equals(objet.getClass().cast(objet)))
                //la formule ci dessus est issue d'une �tude de la classe Class.
                //est ce la seule solution ??
             
            }    */
            if (tabImplantation[i].equals(objet)) {
                return true;
            }
        }
        return false;
    }

//     public boolean listeVide(){     
//         return nbreElements==0;
//     }
//     public int longueur(){
//         return nbreElements;
//     }
// m�thodes de services
    //  toString() , equals(), �  sont "impos�e" par Java => elles ne figurent pas dans cette interface
    public String toString() {
        if (nbreElements == 0) {
            return "[]";
        }
        String s = "[";
        for (int i = nbreElements - 1; i > 0; i--) {
            s += tabImplantation[i].toString() + ", ";
        }
        return s + tabImplantation[0] + "]";
    }

//     public boolean equals(Object lst){
//         if(!(lst instanceof ListePointInterface)){
//             return false;
//         }
//         if(nbreElements!=((ListePointInterface)lst).longueur()){
//             return false;
//         } 
// //         int j=nbreElements-1;
// //         // l'iterator est la seule mani�re d'�num�rer les �l�ments d'une tabImplantation
// //         for(Iterator i=((ListeP_Tab)tabImplantation).iterator() ; i.hasNext() ; ){
// //             if(!this.tabImplantation[j].equals(i.next())){ // ATTENTION ATTENTION on compare n'importe qoi !!!
// //                 return false;
// //             }
// //             j--;
// //            }
// //           return true;
//         // solution violente avant la vraie : deux tabImplantations sont �gales si leurs "toString" sont egales
//         return lst.toString().equals(((ListePointInterface)lst).toString());
//        }
    /*
        * un iterator implant� avec une classe anonyme
        * montrer avec une classe interne (et une classe externe ???)
        * constater les fichiers g�n�r�s.
     */
    //public Iterator<Object> iterator(){
    @Override
    public Iterator iterator() {
        //return new Iterator<Object>(){
        return new Iterator() {
            Object[] temp = tabImplantation;
            int indiceCourant = 0;

            @Override
            public boolean hasNext() {
                return indiceCourant < nbreElements;
            }

            @Override
            public Object next() {
                Object obj = temp[indiceCourant];
                indiceCourant++;
                return obj;
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

        };
    }

// clone()  
    @Override
    protected Object clone() throws CloneNotSupportedException {//pas oblig� de retourner l�exception
        try {
            ListeP_Tab l = (ListeP_Tab) super.clone();
            l.tabImplantation = tabImplantation.clone();
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
