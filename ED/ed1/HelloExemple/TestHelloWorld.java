
public class TestHelloWorld {

    // application
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();

        System.out.println(hello.toString());  // justifier cette écriture

        System.out.println(hello);  // justifier cette écriture

        System.out.println(new HelloWorld().toString());  // justifier cette écriture
// les trois instructions retourne le même résultat...
    }
}
