package service_locator;

import container.ApplicationContext;
import java.util.Iterator;

/** Recherche d'un bean, apparent� "service" dans 
 *  un conteneur de conteneur de beans
 */
public interface ServiceLocatorI extends Iterable<String>{
    
  /** Recherche d'un bean, � l'aide de son nom.
   */
  public <T> T lookup(String serviceName) throws Exception;
  
  /** Ajout de conteneur, 'setContainer': il faut lire 'addContainer'
   * Attention pas de tests sur la pr�sence �ventuelle de doublons
   * @exception si l'ajout des services �choue (fichier inexistant...)
   */
  public void setContainer(ApplicationContext container) throws Exception;
  
  /** Retourne un it�rateur sur les services accessibles.
   * Tous les beans de tous les conteneurs ajout�s
   */
  public Iterator<String> iterator();

}