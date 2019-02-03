---
titre: TP n° 2 - Conversion Fahrenheit - Celsius ...EN COURS D"ADAPTATION...
---


<div class="question">
<img src="images/prerequis.png" width="101" height="80" />
<span></span>
</div>

<div class="paragraphe">
Lectures préalables :  
<ul>
<li>Java_I</li>
<li><a href="http://docs.oracle.com/javase/tutorial/index.html" target="_blank">The Java&trade; Tutorials</a> <i>(Getting Started et Learning the Java Language)</i></li>
</ul>
<br />
Thèmes du TP :
<ul>
<li>Utilisation de <a href="http://www.bluej.org/" target="_blank">BlueJ</a></li>
<li>Java impératif</li>
<li>Exceptions</li>
</ul>
<br />
Ce TP est consacré à une application Java de conversion des degrés Fahrenheit (Angleterre) en degrés Celsius (reste de l'Europe!). 
<br />
<br />
<br />
</div>
<hr />
<div class="question">
<img src="images/question1.png" width="101" height="80" />
<span>La classe "FahrenheitCelsius"</span>
</div>
<div class="paragraphe">
Ouvrir avec Bluej le projet "tp2", descendre dans le paquetage "question1" où l'on découvre la classe "FahrenheitCelsius".
<br />
<br />
C'est dans cette classe qu'est effectuée la conversion. Cette classe est une application car elle contient la méthode : 
<br />
<br />
<code>
<font color="#ffffff">&nbsp;&nbsp;</font><font color="#7f0055"><b>public&nbsp;static&nbsp;</b></font><font color="#7f0055"><b>float&nbsp;</b></font><font color="#000000">fahrenheitEnCelsius</font><font color="#000000">(</font><font color="#7f0055"><b>int&nbsp;</b></font><font color="#000000">f</font><font color="#000000">)&nbsp;{&nbsp;</font><font color="#3f7f5f">//..</font>
<br />
</code>
<br />
<b>Compléter les 2 méthodes de cette classe</b>
<br />
<br />
<b>Contraintes :</b><br />
<ul>
<li>La formule de conversion : °C = 5/9 * (°F -32)<br />
</li>
<li><i>Les valeurs en degrés Fahrenheit à convertir sont données sur la ligne de commande.</i><br />
</li>
<li><i>Ce sont des valeurs entières.</i><br />
</li>
<li><i>Le résultat est attendu avec un seul chiffre derrière la virgule, obtenu uniquement par le calcul.</i> ( par exemple r = ((int)resultat*10)/10.0 )</li>
</ul>
<br />
<b>Exécution sous Bluej : </b>
<br />
<br />
"clic droit" sur le diagramme de la classe "FahrenheitCelsius" , choisir l'item "void main(String[] args)", introduire des données comme ci dessous par exemple ...
</div>
<p align="center">
<img class="win_screenshot" src="images/bluej1.png" width="645" height="475" />
</p>
<div class="paragraphe">
Le résultat dans la fenêtre Terminal
</div>
<p align="center">
<img class="win_screenshot" src="images/bluej2.png" width="578" height="435" />
</p>

<div class="paragraphe">
<b>Technique Java :</b>
<ul>
<li>Les arguments de la ligne de commande sont des chaînes (String), donc pour effectuer la conversion il faut les convertir en entiers  (cf. static int parseInt(String s) de la classe <a href="http://docs.oracle.com/javase/7/docs/api/index.html?java/lang/Integer.html" target="_blank">Integer</a> du paquetage java.lang)</li>
<li>Pour les tableaux, le champ length contient le nombre d'éléments du tableau (ATTENTION le premier indice d'un tableau est 0).</li>
<li>Attention : la division entre 2 entiers est une division entière . Exemple 5/9 = 0  et 9/5 = 1</li>
</ul>
</div>
<br />
<hr />

<div class="question">
<img src="images/question1_1.png" width="111" height="80" />
<span>La classe de tests unitaires "FahrenheitCelsiusTest"</span>
</div>

<div class="paragraphe">
Enrichissez la classe de tests unitaires comparant des résultats calculés à des résultats attendus.<br />
<br />
Lire le tutoriel "<a href="http://www.bluej.org/doc/documentation.html" target="_blank">Unit Testing in BlueJ</a>" sur les classes de tests sous Bluej et un exemple est donné dans le projet... 
</div>
<br />
<hr />

<div class="question">
<img src="images/question2.png" width="101" height="80" />
<span>La gestion de l'exception "NumberFormatException"</span>
</div>

<div class="paragraphe">
"runtime" Exceptions :<br />
<br />
Descendre maintenant dans le paquetage "question2" où l'on découvre une autre version de la classe "FahrenheitClesius".<br />
<br />
Développez une nouvelle version de cette classe en reprenant la conversion de la question 1 et en ajoutant la gestion de l'exception <b>"<a href="http://docs.oracle.com/javase/7/docs/api/index.html?java/lang/NumberFormatException.html" target="_blank">NumberFormatException</a>"</b>.<br />
<br />

L'exception <b>"NumberFormatException"</b> est levée lors d'une mauvaise entrée  sur la ligne de commande i.e. d'une entrée autre qu'une chaîne convertible en "int"

Exemple : {"10","ZZ","100"} engendre :<br />
<br />
<b>For input string: "ZZ"</b> est généré par l'appel de e.getMessage() .   e étant le nom de l'Exception soit <b><i>System.out.println("error : " + e.getMessage());</i></b>
</div>
<br />
<hr />

<div class="question">
<img src="images/question2_1.png" width="111" height="80" />
<span>La classe de tests unitaires</span>
</div>

<div class="paragraphe">
Développez une classe de tests unitaires (cf. question1)
</div>
<br />
<hr />

<div class="question">
<img src="images/question3.png" width="101" height="80" /> IHM
</div>

<div class="paragraphe">
Descendre maintenant dans le paquetage "question2" et compléter l'"IHM 
Fahrenheit" fournie en utilisant la fonction de conversion de la question, 
cette IHM doit avoir un comportement analogue à cette interface. 
Celle-ci s'exécutera facilement dans votre environnement en 
déclenchant la méthode de classe main (clic droit, classe 
IHMFahrenheit)<p align="center">
<img border="0" src="images/tp2.ht1.jpg" width="253" height="70"></p>
<p>Aide au comportement attendu :</div>
<br />
<applet code="question3.AppletteFahrenheit.class" align="baseline" width="400" height="66" archive="applettes.jar"><paramname="backgroundColor" value="0xc0c0c0"></applet>
<div class="paragraphe">
<p align="center">&nbsp;</p>
<p align="center">L'applette de l'énoncé devrait s'exécuter, au 
dessus de cette ligne et présenter une interface, <br>
<b>attention certains navigateurs pour des raisons de 
sécurité ne le permettent plus.</b></p>
<p align="left">Il vous faut utiliser un outil du JDK, depuis le répertoire de ce tp dans 
une console, exécuter cette commande:</p>
<p align="left"><b>&gt;appletviewer tp2.html&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
ou bien appletviewer http://jfod.cnam.fr/progAvancee/tp2/tp2.html</b></p>
<p align="left">&nbsp;&nbsp;&nbsp; sous windows&nbsp; &gt; set 
PATH=&quot;c:/ installation de bluej /jdk/bin&quot;;%PATH%</p>
<blockquote>
<p align="left">ou bien modifier la variable d'environnement</p>
</blockquote>
</div>
<br />
<hr />

<div class="question">
<img src="images/question3_1.png" width="111" height="80" />
<span>Prise en compte de l'exception "NumberFormatException"</span>
</div>

<div class="paragraphe">
Ajoutez à l'IHM la prise en compte de l'exception "NumberFormatException" : si cette exception est levée la sortie mentionnera le libellé "error !", comme le montre cette copie d'écran 
<p>
<img border="0" src="images/bluej3.png" width="416" height="147"></div>

</div>
<blockquote>
  <blockquote>
<p align="left">
<b>&gt;appletviewer http://jfod.cnam.fr/progAvancee/tp2/tp2.html</b>
</p>
  </blockquote>
</blockquote>
<div id="content">


<hr />

<div class="question">
<img src="images/question3_3.png" width="112" height="80" />
<span>Prise en compte du zéro absolu</span>
</div>

<div class="paragraphe">
Complétez L'IHM par la prise en compte du zéro absolu : la valeur minimale ne peut être inférieure en à -273.1°C, un fonctionnement analogue à l'applette de 
l'énoncé ( if(celsius < -273.1F) celsius = -273.1F)
<blockquote>
  <p>
<b>&gt;appletviewer http://jfod.cnam.fr/progAvancee/tp2/tp2.html</b>
  </p>
</blockquote>
</div>
<br />
<hr />

</div>
</div>

</div>
