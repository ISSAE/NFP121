package container;



import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import java.net.URL;
/**
 * <b>femtoContainer</b> Un conteneur de beans adapt� au cours NFP121.
 * Injection de d�pendances par mutateur.<br>
 *
 * Une fabrique de conteneur en fonction du format du fichier de configuration.<b>
 * Un seul format de fichier pour le moment, Un fichier de Properties.
 * @author jm Douin
 * @version 14 Janvier 2018
 * @see container container.FileSystemPropsApplicationContext
 */
public class Factory{
    
    public static ApplicationContext createApplicationContext(String fileName){
      try{
         InputStream inputStream = new FileInputStream(new File(fileName));
        //ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        //InputStream inputStream = classLoader.getResourceAsStream(fileName);
         return new FileSystemPropsApplicationContext(inputStream);
      }catch(Exception e){
          try{
          // serait-ce une URL ? � affiner
            InputStream inputStream = new URL(fileName).openStream();
            return new FileSystemPropsApplicationContext(inputStream);
          }catch(Exception exc){
          }
          e.printStackTrace();
          return null;
      }

    // Le choix du format par d�faut pourrait �tre
    // return new FileSystemXMLApplicationContext(inputStream);
    // return new FileSystemJSONApplicationContext(inputStream);
    // return new FileSystemTexteApplicationContext(inputStream);
  }
    

   /** Ajout en pr�cisant le nom du fichier.
    * @param fileName le nom du fichier de configuration des beans
    * @param className (optionnel), pr�cise le nom de la classe associ� au format de configuration
    * par d�faut, ce sera FileSystemPropsApplicationContext(InputStream) qui sera s�lectionn�).
    * Ce nom de classe peut aussi �tre d�fini sur la ligne de commandes 
    * java -Dfactory.class=package.FileSystemPropsApplicationContext -Dverbose=true ...
    */
  public static ApplicationContext createApplicationContext(String filename, String... className){
    ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
    InputStream inputStream = classLoader.getResourceAsStream(filename);
    //InputStream inputStream = Factory.class.getClassLoader().getResourceAsStream(filename);
    if(inputStream==null)throw new RuntimeException(" fichier de configuration absent ?");
    try{
      String factoryClassName=null;
      if(className!=null && className.length>=1){
        factoryClassName = className[0];
      }else{
         // La clef factory.classname est peut �tre pr�sente dans la ligne de commandes 
         // par ex. -Dfactory.classname=FileSystemPropsApplicationContext ...
        Properties props = System.getProperties();
        factoryClassName = props.getProperty("factory.className","question1.FileSystemPropsApplicationContext");
        
      }
        
      Class<? extends ApplicationContext> cl = (Class<? extends ApplicationContext>)Class.forName(factoryClassName).asSubclass(ApplicationContext.class);
      //Class<?> cl = Class.forName(factoryClassName); en moins typ�
      Constructor<? extends ApplicationContext> cons = cl.getConstructor(InputStream.class);
      return cons.newInstance(inputStream);
    }catch(Exception e){ // en mode d�grad� : ce sera ici un fichier de Properties
      System.err.println("mode d�grad� s�lectionn�. cf factory.className , fichier femto.config");
      return new FileSystemPropsApplicationContext(inputStream);
    }
    // Le choix du format par d�faut pourrait �tre
    // return new FileSystemXmlApplicationContext(inputStream);
    // return new FileSystemJsonApplicationContext(inputStream);
    // return new FileSystemTexteApplicationContext(inputStream);
  }

  /** Ajout, cumul de plusieurs fichiers de configuration.
   * A chaque fichier le format choisi props, xml, json ...
   * @param fileNames les noms des fichiers
   */
  public static ApplicationContext createApplicationContext(String[] fileNames){
    ApplicationContext context=null;
    if(fileNames!=null && fileNames.length>=1){
      context = createApplicationContext(fileNames[0]);
      for(int i=1;i < fileNames.length;i++){
        context.addApplicationContext(createApplicationContext(fileNames[i]));
      }
    }
    return context;
  }


}
