package fr.formation;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.util.concurrent.CompletableFuture;

public class App {
    public static void main(String[] args) throws Exception {
        // Création d'un client Http
        HttpClient httpClient = HttpClient.newHttpClient();

        // Création d'un connecteur WebSocket (java.net.http)
        // Dans le client Http, possibilité de créer un nouveau "Socket"
        // Créer un socket "asynchrone" : CompletableFuture<WebSocket>
        
        // Lors de la création du WS, il faudra un "Listener" (WebSocket.Listener)
        // -> Classe qui implémente l'interface (onText à réimplementer)

        WebSocket websocket = httpClient
            .newWebSocketBuilder()
            .buildAsync(new URI("ws://localhost:3000"), new WebSocketListener())
            .join();

        Thread.sleep(5000);
    }
}
