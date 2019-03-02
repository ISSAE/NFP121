
/**
 * Write a description of class ListePointAbstract here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class ListePointAbstract implements ListePointInterface
{
    protected int nbreElements;  // nombre d'éléments de la liste :  toujours nbreElements<=tabImplantation.length
    @Override
    public boolean listeVide(){     
        return nbreElements==0;
    }
    @Override
    public int longueur(){
        return nbreElements;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.nbreElements;
        return hash;
    }
    public boolean equals(Object lst){
        if(!(lst instanceof ListePointInterface)){
            return false;
        }
        if(nbreElements!=((ListePointInterface)lst).longueur()){
            return false;
        } 
        return lst.toString().equals(((ListePointInterface)lst).toString());
       }

}
