---
titre: TP 1 - L'environnement de programmation BlueJ, git et github
---

<div class="question">
<img src="images/prerequis.png" width="101" height="80" />
<span>Avoir installer la dernière version de BlueJ</span>
</div>
<div class="question">
<img src="images/prerequis.png" width="101" height="80" />
<span>Avoir installer la dernière de git pour windows (ou git pour linux)</span>
</div>
<hr />
<div class="question">
<img src="images/introduction.png" width="111" height="80" />
<span>Utilisation de BlueJ et récupération/soumission de vos travaux dans votre projet github dédié à
ce cours</span>
</div>

<div class="paragraphe">
<ol>
<li>Créer votre compte github avec vos adresse email de l'@isae.edu.lb et le nom d'utilisateur
identifiant Cnam Liban [Voir la vidéo](https://youtu.be/UShoAaZihRU)</li>
<li>Créer un fork du projet github https://github.com/ISSAE/NFP121</li>
<li>cloner en local votre projet issue du fork par exemple dans c:\sharing\mesgit\</li>
<li>Lancer Bluej, puis ouvrir le projet qui se trouve c:\sharing\mesgit\NFP121\tp1</li>
</ol>
<br />
Vous obtenez :
</div>
<p align="center">
<img border="0" src="images/tp1.ht1.jpg" width="800" height="600">
</p>

<div class="paragraphe">
Les 3 questions correspondent aux 3 paquetages
<ul>
<li>si vous avez cloner dans c:\sharing\mesgit\ Votre projet tp1 se trouve maintenant dans le
répertoire : 'c:\sharing\mesgit\NFP121\tp1'</li>
<li>L'énoncé du TP/TD ('tp1') est dans ce répertoire en 'c:\sharing\mesgit\NFP121\tp1\tp1.html'. ou
encore https://issae.github.io/NFP121/tp1/tp1.html</li>
</ul>
</div>


<div class="question">
<img src="images/question1.png" width="101" height="80" />
<span>Introduction</span>
</div>

<div class="paragraphe">
Champs, constructeurs, méthodes et instances d'une classe (introduction extraite du livre Objects First
de M .Kölling,
<a target="_blank" href="http://jfod.cnam.fr/progAvancee/objects-first-ch1.pdf">chapitre 1 de
Objects-First</a>).
<ol>
<li>Allez dans le paquetage question1</li>
<li>Puis créer plusieurs instances,</li>
<li>Déclenchez les méthodes d'instance,</li>
<li>Vérifier les champs d'instance des classes "Circle, Square et Triangle"</li>
<li>Une première <a href="./doc/index.html" target="_blank">documentation</a> , ( générée par Bluej
Menu Outils en fait javadoc)</li>
</ol>
</div>
<br />
<hr />

<div class="question">
<img src="images/question2.png" width="101" height="80" />
<span>Introduction suite</span>
</div>
<div class="paragraphe">
<ol>
<li>Créer une instance de la classe Picture, Modifier le source "Picture.java" afin que le soleil
soit bleu,</li>
<li>Ajouter une nouvelle donnée d'instance : un nouveau soleil (jaune...),</li>
<li>Ajouter une nouvelle méthode à la classe Picture permettant au soleil ( bleu) de se coucher (si
la terre est fixe...), voir la méthode slowMoveVertical de la classe "Circle"</li>
</ol>
<br />
Répondre aux autres exercices du
<a target="_blank" href="http://jfod.cnam.fr/progAvancee/objects-first-ch1.pdf">chapitre 1 de
Objects-First</a>
</div>
<br />
<hr />
<div class="question">
<img src="images/question3.png" width="101" height="80" />
<span>Introduction, tests, mise en oeuvre</span>
</div>
<div class="paragraphe">
<ol>
<li>Le paquetage question3 contient la classe AuditeurCnam fondée sur le squelette de programme
suivant :</li>
<li>
<div class="codesource">
<code>
<font color="#7f0055"><b>public&nbsp;class&nbsp;</b></font><font color="#000000">AuditeurCNAM&nbsp;</font><font color="#000000">{</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">/**&nbsp;l'attribut&nbsp;nom&nbsp;de&nbsp;chaque&nbsp;auditeur.&nbsp;*/</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>private&nbsp;</b></font><font color="#000000">String&nbsp;nom;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">/**&nbsp;l'attribut&nbsp;prenom&nbsp;de&nbsp;chaque&nbsp;auditeur.&nbsp;*/</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>private&nbsp;</b></font><font color="#000000">String&nbsp;prenom;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">/**&nbsp;l'attribut&nbsp;matricule&nbsp;de&nbsp;chaque&nbsp;auditeur.&nbsp;*/</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>private&nbsp;</b></font><font color="#000000">String&nbsp;matricule;</font>
<br />
<font color="#ffffff"></font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">/**</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;&#34;Cr&eacute;ation&#34;,&nbsp;le&nbsp;constructeur&nbsp;d'un&nbsp;auditeur&nbsp;avec&nbsp;son&nbsp;nom,&nbsp;son&nbsp;pr&eacute;nom&nbsp;et&nbsp;son</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;matricule.</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font><font color="#7f9fbf">@param&nbsp;</font><font color="#3f5fbf">nom</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;le&nbsp;nom&nbsp;de&nbsp;l'auditeur</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font><font color="#7f9fbf">@param&nbsp;</font><font color="#3f5fbf">prenom</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;son&nbsp;pr&eacute;nom</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font><font color="#7f9fbf">@param&nbsp;</font><font color="#3f5fbf">matricule</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;sur&nbsp;la&nbsp;carte&nbsp;d'inscription,&nbsp;pr&egrave;s&nbsp;de&nbsp;la&nbsp;photo</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*/</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>public&nbsp;</b></font><font color="#000000">AuditeurCNAM</font><font color="#000000">(</font><font color="#000000">String&nbsp;nom,&nbsp;String&nbsp;prenom,&nbsp;String&nbsp;matricule</font><font color="#000000">)&nbsp;{</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>this</b></font><font color="#000000">.nom&nbsp;=&nbsp;nom;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>this</b></font><font color="#000000">.prenom&nbsp;=&nbsp;prenom;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>this</b></font><font color="#000000">.matricule&nbsp;=&nbsp;matricule;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#000000">}</font>
<br />
<font color="#ffffff"></font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">/**</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;le&nbsp;login&nbsp;au&nbsp;Cnam&nbsp;:&nbsp;6&nbsp;premi&egrave;res&nbsp;lettres&nbsp;du&nbsp;nom&nbsp;suivies&nbsp;de&nbsp;la&nbsp;premi&egrave;re</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;lettre&nbsp;du&nbsp;pr&eacute;nom&nbsp;s&eacute;par&eacute;es&nbsp;de&nbsp;'_'&nbsp;.&nbsp;le&nbsp;login&nbsp;retourn&eacute;&nbsp;est&nbsp;en&nbsp;minuscules,</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;le&nbsp;trait&nbsp;d'union,&nbsp;ou&nbsp;sp&eacute;ciaux&nbsp;</font><font color="#7f7f9f">&lt;i&gt;</font><font color="#3f5fbf">(pour&nbsp;unix)</font><font color="#7f7f9f">&lt;/i&gt;&nbsp;</font><font color="#3f5fbf">sont&nbsp;remplac&eacute;s&nbsp;par&nbsp;des</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;'_'&nbsp;pas&nbsp;de&nbsp;caract&egrave;res&nbsp;accentu&eacute;s&nbsp;pour&nbsp;le&nbsp;login&nbsp;voir&nbsp;les&nbsp;classes</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;pr&eacute;d&eacute;fines,&nbsp;java.lang.String&nbsp;:&nbsp;les&nbsp;m&eacute;thodes&nbsp;replaceAll,&nbsp;toLowerCase&nbsp;et</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;substring&nbsp;java.lang.Math&nbsp;:&nbsp;la&nbsp;m&eacute;thode&nbsp;min</font><font color="#7f7f9f">&lt;br&gt;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font><font color="#7f7f9f">&lt;b&gt;</font><font color="#3f5fbf">BlueJ&nbsp;:&nbsp;Menu&nbsp;Aide</font><font color="#7f7f9f">&lt;/b&gt;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font><font color="#7f9fbf">@return&nbsp;</font><font color="#3f5fbf">le&nbsp;login&nbsp;du&nbsp;Cnam&nbsp;simplifi&eacute;,&nbsp;sans&nbsp;les&nbsp;adaptations&nbsp;dues&nbsp;aux</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;homonymes...</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*/</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>public&nbsp;</b></font><font color="#000000">String&nbsp;login</font><font color="#000000">()&nbsp;{</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>return&nbsp;</b></font><font color="#2a00ff">&#34;&#34;</font><font color="#000000">;</font><font color="#3f7f5f">//&nbsp;&agrave;&nbsp;compl&eacute;ter</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#000000">}</font>
<br />
<font color="#ffffff"></font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">/**</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;Lecture&nbsp;du&nbsp;nom&nbsp;de&nbsp;l'auditeur.</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font><font color="#7f9fbf">@return&nbsp;</font><font color="#3f5fbf">son&nbsp;nom</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*/</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>public&nbsp;</b></font><font color="#000000">String&nbsp;nom</font><font color="#000000">()&nbsp;{</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>return&nbsp;null</b></font><font color="#000000">;</font><font color="#3f7f5f">//&nbsp;&agrave;&nbsp;compl&eacute;ter</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#000000">}</font>
<br />
<font color="#ffffff"></font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">/**</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;Lecture&nbsp;du&nbsp;pr&eacute;nom&nbsp;de&nbsp;l'auditeur.</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font><font color="#7f9fbf">@return&nbsp;</font><font color="#3f5fbf">son&nbsp;pr&eacute;nom</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*/</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>public&nbsp;</b></font><font color="#000000">String&nbsp;prenom</font><font color="#000000">()&nbsp;{</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>return&nbsp;null</b></font><font color="#000000">;</font><font color="#3f7f5f">//&nbsp;&agrave;&nbsp;compl&eacute;ter</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#000000">}</font>
<br />
<font color="#ffffff"></font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">/**</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;Lecture&nbsp;du&nbsp;matricule&nbsp;de&nbsp;l'auditeur.</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font><font color="#7f9fbf">@return&nbsp;</font><font color="#3f5fbf">son&nbsp;matricule</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*/</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>public&nbsp;</b></font><font color="#000000">String&nbsp;matricule</font><font color="#000000">()&nbsp;{</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>return&nbsp;null</b></font><font color="#000000">;</font><font color="#3f7f5f">//&nbsp;&agrave;&nbsp;compl&eacute;ter</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#000000">}</font>
<br />
<font color="#ffffff"></font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">/**</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;m&eacute;thode&nbsp;toString&nbsp;(&nbsp;m&eacute;thode&nbsp;red&eacute;finie&nbsp;de&nbsp;la&nbsp;classe&nbsp;Object).</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;</font><font color="#7f9fbf">@return&nbsp;</font><font color="#3f5fbf">la&nbsp;concat&eacute;nation&nbsp;du&nbsp;nom,&nbsp;du&nbsp;pr&eacute;nom&nbsp;et&nbsp;du&nbsp;login,&nbsp;selon&nbsp;cette</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;syntaxe</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f7f9f">&lt;code&gt;</font><font color="#3f5fbf">nom()&nbsp;+&nbsp;&#34;&nbsp;&#34;&nbsp;+&nbsp;prenom()&nbsp;+&nbsp;&nbsp;&#34;&nbsp;login&nbsp;:&nbsp;&#34;&nbsp;+&nbsp;login()</font><font color="#7f7f9f">&lt;/code&gt;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#3f5fbf">*/</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#646464">@Override</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#7f0055"><b>public&nbsp;</b></font><font color="#000000">String&nbsp;toString</font><font color="#000000">()&nbsp;{</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</font><font fcolor="#7f0055"><b>return&nbsp;</b></font><font color="#000000">nom</font><font color="#000000">()&nbsp;</font><font color="#000000">+&nbsp;</font><font color="#2a00ff">&#34;&nbsp;&#34;&nbsp;</font><font color="#000000">+&nbsp;prenom</font><font color="#000000">()&nbsp;</font><font color="#000000">+&nbsp;</font><font color="#2a00ff">&#34;&nbsp;login&nbsp;:&nbsp;&#34;&nbsp;</font><font color="#000000">+&nbsp;login</font><font color="#000000">()</font><font color="#000000">;</font>
<br />
<font color="#ffffff">&nbsp;&nbsp;&nbsp;&nbsp;</font><font color="#000000">}</font>
<br />
<font color="#000000">}</font>
</code>
</div>
</li>
<li>Lire la <a href="./doc/index.html" target="_blank">documentation</a> de cette classe</li>
<li>Complétez cette classe</li>
<li>Créer plusieurs instances (clic droit sur la classe), vérifiez la valeur des données
d'instances avec l'inspecteur d'objets </li>
<li>Exécutez les tests unitaires proposés, ceux-ci sont minimaux</li>
<li>Ajoutez vos propres tests, voir le tutoriel "<a href="http://www.bluej.org/doc/documentation.html" target="_blank">Unit Testing in BlueJ</a>"</li>
</ol>
Envoyer votre projet sur le github
</div>
</div>