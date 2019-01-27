# Objets et classes
Les objets sont les éléments principaux d'un langage de programmation orientée objet (OOP). Un objet contient à la fois l'état et le comportement.

Si nous considérons les classes comme un modèle, les objets sont l’implémentation du modèle. Par exemple, si l’humain est une classe qui définit le comportement et les propriétés qu’un être humain peut avoir, vous et moi sommes des objets de cette classe humaine, car nous avons rempli toutes les conditions pour être humain. Ou, si nous considérons la voiture comme une classe, une voiture particulière de la _Renault Capture_ sera un objet de cette classe. Il remplit toutes les propriétés et tous les comportements d’une voiture, comme son moteur, son volant, ses phares, etc., et il a le comportement d’avancer, de reculer, etc. Nous pouvons voir comment le paradigme orienté objet peut être relié au monde réel. Presque tout dans le monde réel peut être pensé en termes de classes et d'objets, ce qui rend la POO sans effort et populaire.

La programmation orientée objet repose sur quatre principes fondamentaux:

* Encapsulation
* Abstraction
* Héritage
* Polymorphisme (polymorphisme de sous-typage).

## Encapsulation
L'encapsulation signifie essentiellement la liaison d'attributs et de comportements. L'idée est de conserver les propriétés et le comportement d'un objet au même endroit, afin qu'il soit facile à maintenir et à étendre. Encapsulation fournit également un mécanisme permettant de masquer les détails inutiles à l'utilisateur. En Java, nous pouvons fournir des spécificateurs d'accès aux méthodes et attributs pour gérer ce qui est visible par un utilisateur de la classe et ce qui est caché.

L'encapsulation est l'un des principes fondamentaux des langages orientés objet. Cela aide au découplage de différents modules. Les modules découplés peuvent être développés et maintenus plus ou moins indépendamment. La technique par laquelle les modules / classes / codes découplés sont modifiés en interne sans affecter leur comportement exposé externe est appelée refactoring de code.

## Abstraction
L'abstraction est étroitement liée à l'encapsulation et, dans une certaine mesure, elle la chevauche. En bref, l'abstraction fournit un mécanisme qui expose ce que fait un objet et cache comment il fait ce qu'il est censé faire.

Un exemple concret d'abstraction est une voiture. Pour conduire une voiture, nous n'avons pas vraiment besoin de savoir ce que la voiture a sous le capot, mais nous devons connaître les données et le comportement qu'elle nous expose. Les données sont exposées sur le tableau de bord de la voiture et le comportement est représenté par les commandes que nous pouvons utiliser pour conduire une voiture.

## Héritage
L'héritage est la capacité de baser un objet ou une classe sur un autre. Il existe une classe parent ou de base qui fournit le comportement de niveau supérieur pour une entité. Toute entité de sous-classe ou classe enfant qui remplit les critères pour faire partie de la classe parent peut hériter de la classe parent et ajouter un comportement supplémentaire, le cas échéant.

Prenons un exemple concret. Si nous considérons un véhicule comme une classe parente, nous savons qu'un véhicule peut avoir certaines propriétés et certains comportements. Par exemple, il a un moteur, des portes, etc., et son comportement peut changer. Désormais, toutes les entités répondant à ces critères (voiture, camion, vélo, etc.) peuvent hériter de Véhicule et ajouter des propriétés et un comportement donnés. En d'autres termes, on peut dire qu'une voiture _**est un type de**_ véhicule.

## Polymorphisme
En termes généraux, le polymorphisme nous donne la possibilité d’utiliser la même interface pour des entités de types différents. Il existe deux types principaux de polymorphisme, à _compilation (statique)_ et à d'_exécution (dynamique)_. Supposons que vous ayez une classe `Forme` comportant deux méthodes `aire`. On retourne l'aire d'un cercle par exemple et il accepte un entier simple; c'est-à-dire que le rayon est entré et qu'il renvoie la surface. Une autre méthode calcule l'aire d'un rectangle et prend deux entrées, longueur et largeur. Le compilateur peut décider, en fonction du nombre d'arguments de l'appel, quelle méthode `aire` doit être appelée. C'est le type de polymorphisme à la compilation statique.

Il existe un groupe de techniciens qui considèrent uniquement le polymorphisme à l'exécution comme un véritable polymorphisme. Le polymorphisme d'exécution, également parfois appelé polymorphisme de sous-typage ou dynamique, entre en jeu lorsqu'une sous-classe hérite d'une super-classe et remplace ses méthodes. Dans ce cas, le compilateur ne peut pas décider si l'implémentation de la sous-classe ou de la superclasse sera finalement exécutée. Par conséquent, une décision est prise au moment de l'exécution.