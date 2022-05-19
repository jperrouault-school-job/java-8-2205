package fr.formation.demohttp;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;

public class App {
    public static void main(String[] args) throws Exception {
        // Requête HTTP
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI("https://jsonplaceholder.typicode.com/posts"))
            .GET()
            .build();

        BodyHandler<String> body = BodyHandlers.ofString();
        
        // Client HTTP pour exploiter la requête HTTP
        HttpResponse<String> response = HttpClient
            .newHttpClient()
            .send(request, body);

        System.out.println(response.body());
    }
}
