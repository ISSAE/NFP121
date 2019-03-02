
/**
 * Décrivez votre interface LPointeeI ici.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 */
public interface ListePointInterface extends Iterable, Cloneable {

    /**
     * retourne la valeur du premier élément de la liste sans destruction
     *
     * @return
     * @throws ListeVideException
     */
    Object car() throws ListeVideException;

    /**
     * supprime la tete de la liste remarque : on ne peut pas supprimer la tête
     * d'une liste vide
     *
     * @throws ListeVideException
     */
    void cdr() throws ListeVideException;

    /**
     * ajoute 'obj' au début de la liste; la longueur de la liste est augmentée
     * de 1
     *
     * @param objet
     */
    public void cons(Object objet);

    /**
     * ajoute en fin de liste la liste 'liste' : c'est la concaténation
     *
     * @param liste
     */
    public void conc(ListePointInterface liste);

    /**
     * retourne la liste sur elle même
     */
    public void renverse();

    /**
     * 'objet' appartient-il à la liste ?
     *
     * @param objet
     * @return
     */
    public boolean membre(Object objet);

    /**
     *
     * @return 
     */
    public boolean listeVide();

    /**
     * retourne le nombre d'éléments dans la liste
     * @return 
     */
    public int longueur();

    /*
     *  toString() , equals(),   sont "imposée" par Java => elles ne figurent pas dans cette interface
     */
    //public java.util.Iterator<Object> iterator();
    @Override
    public java.util.Iterator iterator();

}
