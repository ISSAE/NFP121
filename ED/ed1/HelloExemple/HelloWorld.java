
class HelloWorld {

    public String bonjour() {
        return "Bonjour tout le monde...";
    }

    // pour être présentée sur la sortie courante toute classe contiendra une méthode de signature  
    // public String toString(){...} qui surcharge cette même méthode de la classe "Object"
    @Override
    public String toString() {
        return bonjour();
    }
}
