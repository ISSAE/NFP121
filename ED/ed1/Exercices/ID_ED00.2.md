---
titre: exo n&#176; 2 ED00 static
---

<center>
Exercice n&#176; 2
Static ?
</center>



**QUESTION 1** : Construire une classe de nom "CompteurInstance" qui contient
une m&eacute;thode qui retourne le nombre d'instances de la classe &agrave;
tout moment d'une session Java.

**QUESTION 2** : sous Bluej cr&eacute;er une classe de test permettant de
v&eacute;rifier le bon fonctionnement du compteur. 

suggestions : 

* une solution simple est d'utiliser une variable static, donc qui sera
    partag&eacute;es par toutes les instances de la classe et qui sera
    incr&eacute;ment&eacute;es dans le(s) constructeur(s).
* ATTENTION, cette variable "static" ne doit pas &ecirc;tre accessible.
* la m&eacute;thode doit-elle &ecirc;tre aussi "static" ?


<table border cellpadding="2">
<tr>
<td> 

**classe "CompteurInstance"** 

</td>
<td> 

**classe "CompteurInstanceTest"** 

</td>
</tr>
<tr>
<td>

```java		
public class CompteurInstance
{
	// variables d'instance 
	private static int nbInstances=0;

	/**
	 * Constructeur d'objets de classe CompteurInstance
	 */
	public CompteurInstance()
	{
		// initialisation des variables d'instance
		nbInstances += 1;
	}

	
	public int voirNbInstances()
	{
		return nbInstances;
	}

	public static int statVoirNbInstances()
	{
		// Ins&eacute;rez votre code ici
		return nbInstances;
	}
}
```
</td><td>

```java
public class CompteurInstanceTest extends junit.framework.TestCase
{

    /**
     * Constructeur de la classe-test CompteurInstanceTest
     */
    public CompteurInstanceTest()
    {
    }
   
	public void testCptInstances()
	{
		CompteurInstance compteur1 = new CompteurInstance();
		CompteurInstance compteur2 = new CompteurInstance();
		assertEquals(2, CompteurInstance.statVoirNbInstances());
		assertEquals(2, compteur2.voirNbInstances());
		assertEquals(2, compteur1.voirNbInstances());
		assertEquals(compteur1.voirNbInstances(), CompteurInstance.statVoirNbInstances());
		CompteurInstance compteur3 = new CompteurInstance();
		assertEquals(compteur2.voirNbInstances(), CompteurInstance.statVoirNbInstances());
	}
}
```

</td></tr>
</table>

<hr/>

[retour](ED00.2)
