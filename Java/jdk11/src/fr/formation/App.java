package fr.formation;

public class App {
    private static int x = 5;

    public static void main(String[] args) {
        // App.DemoImbrique demo = new App.DemoImbrique();

        App.DemoImbrique.demo();
    }

    // public static int internalX() {
    //     return x;
    // }

    public static class DemoImbrique {
        public static void demo() {
            System.out.println("Démonstration imbriquée ..");
            System.out.println(x);
            // System.out.println(internalX());
        }
    }
}
