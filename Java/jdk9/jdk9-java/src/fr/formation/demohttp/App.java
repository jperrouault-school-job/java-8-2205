package fr.formation.demohttp;

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
        HttpResponse<String> response = HttpClient
            .newHttpClient()
            .send(request, BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
