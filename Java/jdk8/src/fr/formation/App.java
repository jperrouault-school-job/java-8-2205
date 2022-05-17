package fr.formation;

public class App {
    public static void main(String[] args) {
        // Création d'une classe "anonyme"
        MonInterface monIface = new MonInterface() {
            @Override
            public void demo1() {
                // TODO Auto-generated method stub
            }
        };

        MonInterface monIface2 = new MonImplementation();

        monIface.demo1();
        monIface.demo2();
        monIface2.demo2();


        MonInterface monIfaceFonctionnelle = App::methode;
        monIfaceFonctionnelle.demo1();

        MonInterface monIfaceLambda = () -> System.out.println("Démonstration Lambda !");
        monIfaceLambda.demo1();
    }

    public static void methode() {
        System.out.println("Méthode !");
    }
}
