
/**
 * Décrivez votre interface LPointeeI ici.
 * 
 * @author  (votre nom) 
 * @version (un numéro de version ou une date)
 */

public interface ListePointInterface  extends Iterable , Cloneable
{
    /**
     * retourne la valeur du premier élément de la liste sans destruction
     */ 
     Object car() throws  ListeVideException;
    /**
     * supprime la tete de la liste
     * remarque :  on ne peut pas supprimer la tête d'une liste vide
     */
     void cdr() throws ListeVideException;    
    /**
     * ajoute 'obj' au début de la liste;
     * la longueur de la liste est augmentée de 1
     */
    public void cons(Object objet);
    /**
     * ajoute en fin de liste la liste 'liste' : c'est la concaténation
     */
    public void conc(ListePointInterface liste );
    /**
     * retourne la liste sur elle même
     */
    public void renverse();
/**
 * 'objet' appartient-il à la liste ?
 */ 
    public boolean membre(Object objet);
    /**
     * 
     */
    public boolean listeVide();
    /**
     * retourne le nombre d'éléments dans la liste
     */
    public int longueur();
    
 
    
    
    /*
     *  toString() , equals(), …  sont "imposée" par Java => elles ne figurent pas dans cette interface
     */
    
    
    
    
    
    
    
    
    
    //public java.util.Iterator<Object> iterator();
    public java.util.Iterator iterator();

}
