package fr.formation;

import java.lang.reflect.Type;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import fr.formation.model.Post;

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
            .thenApply(json -> {
                //Choix du type de conversion Json
                // Type type = Post[].class;
                Type type = new TypeToken<List<Post>>(){}.getType();

                //Retourner la liste des Posts
                // Post[] posts = new GsonBuilder().create().fromJson(json, type);
                // List<Post> posts = List.of(posts);

                List<Post> posts = new GsonBuilder().create().fromJson(json, type);

                return posts;
            })
            .thenApply(posts -> {
                // System.out.println(posts);
                posts.forEach(System.out::println);
                return posts;
            })
            .thenAccept(posts -> 
                // Chercher le post
                // S'il existe, afficher son body
                // Sinon, afficher "n'a pas été trouvé"
                
                posts.stream()
                    .filter(p -> p.getId() == 15)
                    .findFirst()
                    .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("N'a pas été trouvé...")
                    )
            )
            .join()
            ;
    }
}
