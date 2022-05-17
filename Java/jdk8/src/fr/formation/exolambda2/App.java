package fr.formation.exolambda2;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        // On prépare l'opération division (lambda OU référence à une méthode qui existe déjà)
        BinaryOperator<Float> division = (a, b) -> {
            if (b == 0) {
                throw new RuntimeException("Division par Zéro ...");
            }

            return a / b;
        };

        // On prépare le callback onSuccess (lambda OU référence à une méthode qui existe déjà)
        Consumer<String> onSucess = System.out::println;
        
        // On prépare le callback onError (lambda OU référence à une méthode qui existe déjà)
        Consumer<String> onError = msg -> System.err.println(msg);

        // On appelle operate()
        operate(division, onSucess, onError);
    }

    public static void operate(BinaryOperator<Float> operation, Consumer<String> onSuccess, Consumer<String> onError) {
        // déclencher l'opération peut être dangereux
        try {
            // On déclenche l'opération
            Float result = operation.apply(5f, 0f);

            // On déclenche le callback onSuccess
            onSuccess.accept("Résultat = " + result);
        }

        catch (Exception e) {
            e.printStackTrace(); // Affiche toute l'exception dans la console

            // On déclenche le callback onError
            onError.accept("Une erreur est survenue ...");
        }
    }
}
