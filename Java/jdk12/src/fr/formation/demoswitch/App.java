package fr.formation.demoswitch;

public class App {
    public static void main(String[] args) {
        // Version switch "classique"
        int a = 1;
        String valeur = "";
        System.out.println(System.getProperty("java.version"));

        switch (a) {
            case 0: valeur = "VALEUR 0"; break;
            case 1:
            case 2: valeur = "VALEUR 1 OU 2"; break;
            case 3: valeur = "VALEUR 3"; break;

            default: valeur = "VALEUR PAS CONNUE";
        }

        System.out.println(valeur);

        // Switch JDK 12
        valeur = switch (a) {
            case 0      -> "VALEUR 0 (12)";
            case 1, 2   -> "VALEUR 1 OU 2 (12)";
            case 3      -> "VALEUR 3 (12)";
            default     -> "VALEUR PAS CONNUE";
        };

        System.out.println(valeur);

        // Switch JDK 12
        switch (a) {
            case 0      -> System.out.println("0");
            case 1, 2   -> {
                System.out.println("TRUC COMPLEXE");
                System.out.println("TRUC COMPLEXE ...");
            }
            default     -> System.out.println("Autre chose");
        }

        
    }
}
