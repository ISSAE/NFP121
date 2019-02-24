---
titre: implanter les listes pointées par un tableau
---

# Exercice n&#176; 1: implanter les listes pointées par un tableau
      
      squelette à compléter du code de ListeP_Tab :
      

```java
import java.util.Iterator ;
/**
 * Décrivez votre classe ListeP_T ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public  class ListeP_Tab implements ListePointInterface
{
     /**
      * ATTENTION, ATTENTION,
      * il est plus facile d'ajouter des objets à la fin d'un tableau 
      * qu'au début d'un tableau 
      * car en ajoutant au début il faudrait à chaque fois décaler tous les éléments du tableau.
      * Alors dans le tableau d'implantation 'liste' la tête de liste est le dernier du tableau
      */  
     
    // variables d'instance / attributs 
    private Object []  tabImplantation;
    private int nbreElements;  // nombre d'éléments de la liste, donc on aura toujours nbreElements&lt;=tabImplantation.length
    
    public ListeP_Tab(){
        tabImplantation= new Object [3];  //3 ou n'importe quel autre nombre &gt;0 d'éléments
    }
/**
 * retourne la tête de la tabImplantation. lecture seulement
 */
    public Object car()
    { 
        return tabImplantation[nbreElements-1];
     }
/**
 * destruction du premier élément de la tabImplantation
 */
      public void cdr()
      { 
          tabImplantation[nbreElements-1]=null;
          nbreElements--;     
       }
 /**
  * procédure : ajout d'un objet quelconque en début de tabImplantation
  */   
    public void cons(Object objet){ 
        tabImplantation[nbreElements]=objet;
        nbreElements++;
       }
       /**
        * procédure : concaténation d'une tabImplantation sur 'this'
        * ATTENTION cette version ne permet que la concaténation d'une 'ListeP_Tab'
        * réfléchir à la version générale...
        */
    public void conc(ListePointInterface lst ){
            /*
             * à compléter...
             * 
             */
         nbreElements=nbreElements+lst.longueur();
       }
/** 
 * procédure : retourner une tabImplantation sur elle même
 */ 
    public void renverse(){
        if(nbreElements!=0 &amp; nbreElements!=1){
        Object[] temp= new Object[nbreElements];
        for(int i=0 ; i&lt;nbreElements ; i++){
            temp[i]=tabImplantation[nbreElements-1-i];
           }
           tabImplantation=temp;
       }
    }
/**
 * prédicat : objet est-il membre de la liste ?
 * ATTENTION à ne pas comparer n'importe quoi et obtenir "un false silencieux"
 */
    public boolean membre(Object objet){
            /*
             * à compléter...
             * un vrai casse-tête !!!
             */
        return false; 
    }
    public boolean listeVide(){     
        return nbreElements==0;
    }
    public int longueur(){
        return nbreElements;
    }
    
// méthodes de services "imposées" par Java
        
    public String toString(){
        if(nbreElements==0) return "[]";
        String s="[";
        for(int i=nbreElements-1 ; i&gt;0 ; i--){
            s+=tabImplantation[i].toString()+",";
        }
        return s+tabImplantation[0]+"]";
    }    

    public boolean equals(Object liste){
        if(!(liste instanceof ListePointInterface)){
            return false;
        }
        if(nbreElements!=((ListePointInterface)liste).longueur()){
            return false;
        }
           /*
            * à compléter...
            * avec soin.
            */
        return false;
    }    
}
```

# remarques et rappels :
- car() et cdr() : l'application de ces méthodes
	  sur une liste vide est une erreur il faudra donc prévoir de traiter
	  cette erreur (crash du programme dans tous les cas et il faut cacher à
	  l'utilisateur l'implémentation par un tableau..).
    - à la main
    - par une levée d'exception (créer alors la classe
	      'ListeVideException' extends Exception {...}) et modifier l'interface.
    - par une instruction assert
- en java comme dans la plus part des langages la longueur d'un tableau est
	  fixée à la déclaration. Or ici les listes sont NON
	  bornées donc quand il le faudra il faudra faire "grandir" le tableau
	  tabImplantation ou le rétrécir s'il est devenu trop
	  grand... pour cela étudier la méthode arraycopy(...)
	  de la classe System
- la méthode arraycopy(...) de la classe System
	  sera aussi utile pour développer conc(ListePointInterface lst)
- pour membre et equals bien poser le probl&egrave;me
	  et si il &nbsp;est trop compliqué attendre les listes
	  génériquespour une solution robuste.
- enfin ajouter un "iterator" à la classe pour pouvoir énumérer
	  les éléments de la liste. l'entête de la classe devient
	  alors : <br/>
	  public class ListeP_Tab implements ListePointInterface , Iterable
    tests : 
    
      développer avec Bluej une classe de tests (pertinents) couvrant tous les cas particuliers et généraux que vous "voyez"
