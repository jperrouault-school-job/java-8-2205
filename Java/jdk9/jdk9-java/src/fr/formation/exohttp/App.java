package fr.formation.exohttp;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {
        // Requête HTTP
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI("https://jsonplaceholder.typicode.com/posts"))
            .GET()
            .build();
        
        // Client HTTP pour exploiter la requête HTTP
        HttpClient
            .newHttpClient()
            .sendAsync(request, BodyHandlers.ofString())
            .thenApply(HttpResponse::body)
            .thenAccept(System.out::println)
            .join() // Permet au thread d'attendre la résolution de ce CompletableFuture
            ;
    }
}
