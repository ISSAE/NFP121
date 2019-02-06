---
titre: Exos assert, interface, types et classes
---


Impl&eacute;menter les listes point&eacute;es ch&egrave;res &agrave;
LISP et &agrave; Prolog

Informellement : une liste point&eacute;e est repr&eacute;sent&eacute;e par

L = TETE.Reste_de_la_Liste 

ou

[TETE| Reste_de_la_Liste ]

en LISP traditionnellement TETE est obtenue traditionnellement par la fonction
car() et Reste_de_la_Liste par la fonction cdr(). Nous
reprendrons ces noms.

Les autres m&eacute;thodes &#171;&nbsp;traditionnelles&nbsp;&#187; sur ces
listes sont :

* cons() : ajouter un &eacute;l&eacute;ment en t&ecirc;te d&#146;une
liste
* conc() : la concat&eacute;nation de 2 listes.
* membre() : pr&eacute;dicat de l&#146;appartenance d&#146;un objet
&agrave; la liste.
* renverse() : proc&eacute;dure : retourne la liste sur elle m&ecirc;me.
* listeVide() : pr&eacute;dicat qui r&eacute;pond &#145;true&#146;
si la liste est vide.
* longueur() : nombre d&#146;&eacute;l&eacute;ments de la liste

Les sp&eacute;cifications ci dessus nous ont permis de construire l'interface
suivante :



## Interface des listes point&eacute;es

  
```java
public interface ListePointInterface{
    /**
     * retourne la valeur du premier &eacute;l&eacute;ment (la t&ecirc;te) de la liste sans destruction
     * simple lecture...
     * remarque :  on ne peut pas obtenir la t&ecirc;te d'une liste vide
     */ 
     Object car();
    /**
     * supprime la tete de la liste
     * remarque :  on ne peut pas supprimer la t&ecirc;te d'une liste vide
     */
     void cdr(); 
    /**
     * proc&eacute;dure : ajoute 'obj' au d&eacute;but de la liste;
     * la longueur de la liste est augment&eacute;e de 1
     */
    public void cons(Object objet);
    /**
     * proc&eacute;dure : concat&egrave;ne la liste 'lst' &agrave; 'this'
     */
    public void conc(ListePointInterface lst );
    /**
     * proc&eacute;dure : retourne la liste sur elle m&ecirc;me
     */
    public void renverse();
    /**
     * pr&eacute;dicat : 'objet' appartient-il &agrave; la liste ?
     */ 
    public boolean membre(Object objet);
    /**
     * pr&eacute;dicat : 'this est-il une liste vide ?
     */
    public boolean listeVide();
    /**
     * retourne le nombre d'&eacute;l&eacute;ments dans la liste
     */
    public int longueur();  
}
```
  

*Remarques compl&eacute;mentaires :*

* Les listes sont de longueur quelconque, sont NON
born&eacute;es.
* L'affichage sera de la forme [objet1 , ... , objetn]


A/ il est demand&eacute; d'impl&eacute;menter l'interface ci dessus
de 3 mani&egrave;res diff&eacute;rentes
* <a HREF="Exercices/LTAB-1.html">implantation par un tableau</a>
* <a HREF="Exercices/LTAB-2.html">implantation par une structure de donn&eacute;es r&eacute;cursive</a>
* <a HREF="Exercices/LTAB-3.html">implantation utilisant une api java : java.util.LinkedList</a>


nous obtenons ainsi le premier diagramme de classes :

<IMG SRC="Exercices/listes3-squel-1.jpg" width="672" height="357">

B/ v&eacute;rifier par une classe de tests pertinents que les trois
implantations ont le m&ecirc;me comportement

on a maintenant le diagramme de classes suivant :

<IMG SRC="Exercices/listes3-idee-1-.jpg" width="708" height="416">


C/deux listes sont &eacute;gales (par equals(...)) si
elles ont le m&ecirc;me nombre d'&eacute;l&eacute;ments et que les
&eacute;l&eacute;ments au m&ecirc;me rang sont &eacute;gaux
(equals()). Donc on doit pouvoir comparer deux piles d'implantations
diff&eacute;rentes. A v&eacute;rifier !!!

remarque et rappel : 
* en fait nous comparons les "toString()" des listes donc le point
    C semble assez simple &agrave; condition que les 3 "toString()"
    g&eacute;n&egrave;rent la m&ecirc;me chose.
* construire de "vraies" m&eacute;thodes equals(...)


D/classe abstraite : on veut maintenant le diagramme
de classes suivant :

<IMG SRC="Exercices/listes3-idee-2-.jpg" width="531" height="384">

que peut-on transferer "au maximum" dans cette classe abstraite ?

E/clone : rendre les listes (toutes) clonable et
d&eacute;velopper la m&eacute;thode clone dans chacune des classes. d'abord
une copie superficielle puis une copie profonde.

F/<a HREF="Exercices/listes3.jar">des id&eacute;es &agrave;
perfectionner... </a>(Bluej)

## Expressions Arithm&eacute;tiques
  enti&egrave;res 

<hr COLOR="#00ff00" />

Construire une application Java pour l'&eacute;valuation et l'affichage
  d'expressions arithm&eacute;tiques enti&egrave;res "classiques".
  
On part de la syntaxe abstraite :
  
    
1. cat&eacute;gories syntaxiques :

>    e,e1,e2 &isin; Exp<br/>
    o &isin; {+ | - | * | /}<br/>
    n &isin; Entier
	
2. d&eacute;finitions :
	
>	  e ::= n | e1 o e2
	
      
    
  
  
=> <a HREF="Exercices/exo.J03.1.html">(1)</a> : Version imp&eacute;rative
  : Construire/sp&eacute;cifier une classe pour l'&eacute;valuation&nbsp;et
  l'affichage des expressions arithm&eacute;tiques num&eacute;riques .
  
=> <a HREF="Exercices/exo.J03.2.html">(2)</a> : Premi&egrave;re Vision
  objet : pattern COMPOSITE.
  
=> <a HREF="Exercices/exo.J03.3.html">
  (3)</a> : Vision OO : granularit&eacute; plus fine , ajout de nouvelles
  m&eacute;thodes...
<IMG SRC="aniFlecheRouge.gif" WIDTH="10" HEIGHT="10"><a HREF="Exercices/exo.J03.4.html">(4)</a> : pattern VISITEUR.

