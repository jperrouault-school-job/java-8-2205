package fr.formation.exolambda1;

public class App {
    public static void main(String[] args) {
        // Math math = (int a, int b) -> a + b; // Le type est possible
        Math math = (a, b) -> a + b;

        System.out.println(math.operation(5, 10));
    }
}
