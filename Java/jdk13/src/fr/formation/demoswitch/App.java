package fr.formation.demoswitch;

public class App {
    public static void main(String[] args) {
        int a = 1;

        String valeur = switch (a) {
            case 0      -> "VALEUR 0 (12)";
            case 1, 2   -> {
                System.out.println("Oh c'est compliqué ça");
                yield "VALEUR 1 OU 2 (13)";
            }
            case 3      -> "VALEUR 3 (12)";
            default     -> "VALEUR PAS CONNUE";
        };

        System.out.println(valeur);
    }
}
