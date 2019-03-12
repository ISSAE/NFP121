package container;

/**
 * <b>femtoContainer</b> est unn conteneur de beans adapt� au cours NFP121 du Cnam.<br><br>
 * L'injection des d�pendances est effectu�e par l'appel des mutateurs.<br>
 * Un fichier de configuration pr�cise les noms des beans et des propri�t�s � injecter<br>
 * Le format du fichier est d�fini depuis la classe Factory cf. la classe container.Factory<br><br>
 *
 * <br><u>Un exemple d'utilisation:</u><br>
 * <pre>
 * import container.*;
 * ...
 * ApplicationContext ctx = Factory.createApplicationContext("./martin_fowler/README.TXT");
 * MovieLister lister = ctx.getBean("movieLister");
 * </pre>
 * @author jean-michel Douin
 * @version 19 septembre 2018
 * @see https://fr.wikipedia.org/wiki/JavaBeans
 * @see container.Factory
 */

public interface ApplicationContext extends Iterable<String>{
  /** Obtention du nom de ce conteneur.
   * @return son nom
   */
  public String getName();
  
  /** Obtention d'une instance d'un bean du conteneur.
   *  Il n'existe qu'une seule instance avec cet id (un singleton).
   * @param id l'identifiant unique du bean
   * @return l'instance associ�e
   * @throws RuntimeException "pas de bean avec cet identifiant: " + id
   */
  public <T> T getBean(String id);
  
  /** Obtention du type du bean � partir de son identifiant.
   * @param id l'identifiant unique du bean
   * @return le type,instance de la classe Class du bean
   * @throws RuntimeException "pas de bean avec cet identifiant: " + id
   */
  public Class<?> getType(String id);
  
  /** Obtention d'un it�rateur sur les beans pr�sents dans ce conteneur.
   * L'op�ration de retrait : remove, est sans effet.
   * @return un it�rateur des identifiants du conteneur
   */
  public java.util.Iterator<String> iterator();
  
  /** Ajout, cumul d'une autre instance d'ApplicationContext
   * Tous les beans de l'instance appContext sont ajout�s au conteneur en cours.
   * @param appContext le conteneur � ajouter
   * @throws RuntimeException "d�j� un bean avec cet identifiant: " + id
   */
  public void addApplicationContext(ApplicationContext appContext);
}
