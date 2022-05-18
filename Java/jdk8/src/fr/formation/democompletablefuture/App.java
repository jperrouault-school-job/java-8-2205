package fr.formation.democompletablefuture;

import java.util.concurrent.CompletableFuture;

public class App {
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(500);
            }

            catch (Exception e) {

            }

            return "Hello";
        })
        .thenApply(hello -> hello + " World !");
        // .thenAccept(System.out::println);

        // On simule que le programme tourne toujours ...
        Thread.sleep(2000);

        String result = future.join();
        System.out.println(result);
    }
}
