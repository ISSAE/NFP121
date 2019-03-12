package container;


import java.util.Map;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.ArrayList;
/**
 * <b>femtoContainer</b> Un conteneur de beans adapté au cours NFP121.
 * Injection de dépendances par mutateur.
 * Ce conteneur est aussi un bean cf. ServiceLocator.
 *
 * @author jm Douin
 * @version 14 Janvier 2018
 */

public abstract class AbstractApplicationContext implements ApplicationContext, Iterable<String>{
  /** La table des beans. */
  protected Map<String, Object> beans;
  /** Le nom du conteneur. */
  private String name;
  
  public AbstractApplicationContext(){
    this.beans = new TreeMap<String, Object>(); // identifiants des beans, par ordre alphabétique
  }
  
  public void setName(String name){
      this.name=name;
  }
  public String getName(){return this.name;}

  
  public <T> T getBean(String id){// un singleton
    Object bean = beans.get(id);
    if(bean==null) throw new RuntimeException("pas de bean avec cet identifiant: " + id);
    return (T)bean;
  }
  
  public Class<?> getType(String id){
    Object instance = getBean(id);
    if(instance==null) throw new RuntimeException("pas de bean avec cet identifiant: " + id);
    return instance.getClass();
  }
  
  public Iterator<String> iterator(){
    return new ArrayList<String>(beans.keySet()).iterator();
  }
  
  public void addApplicationContext(ApplicationContext context){
    for(String id : context){
      if(beans.get(id)!=null) throw new RuntimeException("déjà un bean avec cet identifiant: " + id);
      beans.put(id, context.getBean(id));
    }
  }
  
}
