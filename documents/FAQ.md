# Template method, Factory method 

* En génie logiciel, le  "Template method" est un modèle de conception comportementale qui définit le squelette de programme d'un algorithme dans une opération en reportant certaines étapes aux sous-classes. Ici dans le cas de Java ce sera un `extends` d'une class vers un abstract class
* En programmation par classe, le "Factory method"  est un modèle de conception de création qui utilise les méthodes de l'usine pour résoudre le problème de la création d'objets sans avoir à spécifier la classe exacte de l'objet qui sera créé. En java ceci est une interface et la factory concrète `implements` cette interface. En fait on remplace les appels directs de construction d'objet (operateur new) par des appels à une méthode d'usine spéciale. Ne vous inquiétez pas: les objets sont toujours créés via le l'opérateur new, mais ils sont appelés depuis la méthode factory. Les objets renvoyés par une méthode d'usine sont souvent appelés «produits».

## Template method

Un exemple 

```java
/**
 * Base class of social network.
 */
public abstract class Network {
    String userName;
    String password;

    Network() {}

    /**
     * On sait faire post en se basant sur les opérations abstraite logIn, sendData et logout
     * Qui seront implémenté par une sous-classe spécifique
     */
    public boolean post(String message) {
        // Authenticate before posting. Every network uses a different
        // authentication method.
        if (logIn(this.userName, this.password)) {
            // Send the post data.
            boolean result =  sendData(message.getBytes());
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean sendData(byte[] data);
    abstract void logOut();
}
 networks/Facebook.
 ```