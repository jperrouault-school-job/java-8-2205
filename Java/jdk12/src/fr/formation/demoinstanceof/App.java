package fr.formation.demoinstanceof;

public class App {
    public static void main(String[] args) {
        // Instanceof < 12
        Object fruit = "Pomme";

        if (fruit instanceof String) {
            String f = (String)fruit;

            f = f.toUpperCase();
            System.out.println(f);
        }

        // Instanceof 12
        if (fruit instanceof String f) {
            f = f.toLowerCase();
            System.out.println(f);
        }
    }
}
