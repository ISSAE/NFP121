---
titre: Intro à la POO + java "impératif"
---

pour ce premier TD/TP en présentiel je vous monterais ce qu'il faut faire (_sur le PC de l'enseignant_). En plus de devoir installer les logiciels et outils nécessaires (_si vous avez d;jà fait les devoir de classroom c'est déjà fait!_); vous devrez écrire et exécuter les programmes pour que les exercices soient profitables (ne vous contenter pas de copier/coller et de lire ce document!).

# Pré-requis

* VS code : Un éditeur de texte avancé par exemple [Visual Studio Code](https://code.visualstudio.com/download) (Open Source et disponible Linux, Mac, et windows) pour editer nos fichiers de scripts, les pages html les fichiers markdown et même le Java etc...

* GIT: [GIT pour windows](https://git-scm.com/download/win), tous le long de ce cours vous utiliserez git et github pour rendre les devoirs et les projets
* BlueJ et JDK8 : Télécharger la dernière version de [BlueJ](https://www.bluej.org/) (si ce n'est pas déjà fait) cette version contient la JDK8

Pour des instructions sur l'environnement de développement voir [Installer l'environnement](/NFP121/TP/tp0)

pour utiliser la même jdk que BlueJ en ligne de commande : définir la variable d'environnement JDK_HOME et modifier le PATH

Pour des raison d'unifications des commandes dans les 3 systèmes Linux, Mac et windows. Voici une démarche pour ceux qui possède windows pour travailler en ligne de commande similaire a Unix (Linux et Mac)

1. Git pour windows installé alors vous posséder gitbash (un terminal de shell unix appelé bash)
2. Un éditeur avancé "VS code" vous pouvez aussi utiliser tous simplement notepad!
2. Lancer gitbash et éditer ou créer le fichier .bashrc et y insérer le code suivant: (le .bash doit être défini dans le répertoire HOME de votre utilisateur) executer la commande ```code $HOME/.bashrc``` 

en fonction de votre répértoire d'installation Bluej (=> BLUEJ_HOME)
```bash
export BLUEJ_HOME='/c/sharing/BlueJ'
export JAVA_HOME=$BLUEJ_HOME/jdk
export PATH=$JAVA_HOME/bin:$PATH
```

Quitter gitbash et re-rentrer

essayer ensuite ```java -version``` et `javac -version`
vous devriez obtenir quelque chose comme ceci
```bash
ppfar@DomicileTerra MINGW64 /c/sharing/mesgit
$ java -version
openjdk version "11.0.2" 2019-01-15
OpenJDK Runtime Environment 18.9 (build 11.0.2+9)
OpenJDK 64-Bit Server VM 18.9 (build 11.0.2+9, mixed mode)

ppfar@DomicileTerra MINGW64 /c/sharing/mesgit
$ javac -version
javac 11.0.2

```
<hr/>
# Le TDP (Travail Dirigé et Pratique) 1

## Rappels :

l'activité de programmation dans un "langage objet" consiste à écrire des classes.
* Les classes définissent des types (de données).
* Les objets sont des instances de classes.
* une application est une classe qui contient  la méthode  'main' (point d'entrée de l'application) de signature : "`public static void main(String [] a)`"

Compilation - Exécution d'un Programme : (environnement Window) dans une fenêtre "cmd" ou "gitbash"

L'ensemble des classes intervenant dans le programme doit d'abord être compilé :
> `javac ...  xxx.java`  cette commande génère en cas de succès le fichier xxx.class
Java est alors interprété i.e. on soumet à l'interpréteur "java" le ".class" de la classe contenant le "main" `java ... xxx`
Exemple :

```java
//Dans le fichier HelloWorld.java
class HelloWorld {
   public String bonjour(){ 
        return "Bonjour tout le monde...";
   } 
   // pour être présentée sur la sortie courante toute classe contiendra une méthode de signature  
   // public String toString(){...} qui surcharge cette même méthode de la classe "Object"
   public String toString() { 
        return bonjour();
     } 
  }

//Dans le fichier TestHelloWorld.java
public class TestHelloWorld { 
      // application
     public static void main (String[] args) { 
        HelloWorld hello= new HelloWorld();

        System.out.println(hello.toString());  // justifier cette écriture

        System.out.println(hello);  // justifier cette écriture

        System.out.println(new HelloWorld().toString());  // justifier cette écriture
// les trois instructions retourne le même résultat...
     } 
  }
```

[Exercice n°1](Exercices/ED00.1.Hello) : compilation, exécution "hello world"

[Exercice n°2](Exercices/ED00.2) : "static" ou NON ?

Découvrir les objets (classes) et premiers programmes :

[Un Exercice  plus complet](Exercices/ED00_CourseSki) : la course de ski...

Remarque :

Forme canonique d'une classe publique :
Définir  effectivement le constructeur publique sans argument.
Surcharger la méthode toString() de la classe "Object"
Surcharger les méthodes equals() (et hashCode()) de la classe "Object"
un peu d'algorithmique ou Java impératif :

... reprendre en Java tous les algorithmes classiques sur les entiers avec des tableaux divers et variés.

* a<sup>b</sup> :  créer l'application Java de l'exponentiation de 2 entiers 'a' et 'b' quand on ne connaît que les opérateurs * et «-1».
* Construire l'application Java de la recherche de l'indice de la plus grande valeur dans un tableau  de n entiers naturels (>=0) .

/* [une idée...](ID_ED00.java_imp)

### Pouvez vous donner une définition claire aux concepts suivants (rappel nous sommes dans un contexte JAVA)? 
_Sinon revoir le cours,... posez la question en TD, en cours, sur le "[issue tracker](https://github.com/ISSAE/NFP121/issues)" de l'UE et la classroom de vos enseignants, google..._ 

* classe
* objet (style JAVA)
* attribut d'instance, attribut de classe
* méthode
* signature de méthode
* constructeur
* surcharge de méthode, de constructeur

  

