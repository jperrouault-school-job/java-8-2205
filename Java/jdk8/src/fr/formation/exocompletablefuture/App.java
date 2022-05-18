package fr.formation.exocompletablefuture;

import java.time.LocalTime;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;

public class App {
    public static void main(String[] args) throws InterruptedException {
        // Premier Future
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            }

            catch (Exception e) { }

            return "Démo";
        });


        // Deuxième Future
        CompletableFuture<Optional<String>> f2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(1000);
            }

            catch (Exception e) { }

            Integer seconds = LocalTime.now().getSecond();

            return Optional.ofNullable(seconds % 2 == 0 ? null : seconds.toString());
        });

        // Action lorsqu'on tout est fini
        CompletableFuture
            .allOf(f1, f2)
            .thenRun(() -> {
                String v1 = f1.join();
                String v2 = f2.join().orElse("non défini");

                System.out.println(v1 + " " + v2);
            })
            // .join()
            ;
        
        // Simuler l'exécution du programme ....
        Thread.sleep(3000);
    }
}
