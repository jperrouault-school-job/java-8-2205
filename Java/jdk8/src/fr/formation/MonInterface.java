package fr.formation;


@FunctionalInterface
public interface MonInterface {
    public void demo1();
    // public void demo3();

    public default void demo2() {
        System.out.println("Méthode par défaut démo 2 !");
    }
}
