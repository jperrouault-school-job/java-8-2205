package fr.formation;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.WebSocket;
import java.util.concurrent.SubmissionPublisher;

public class App {
    public static void main(String[] args) throws Exception {
        // Création d'un client Http
        HttpClient httpClient = HttpClient.newHttpClient();

        // Création d'un connecteur WebSocket (java.net.http)
        // Dans le client Http, possibilité de créer un nouveau "Socket"
        // Créer un socket "asynchrone" : CompletableFuture<WebSocket>
        
        // Lors de la création du WS, il faudra un "Listener" (WebSocket.Listener)
        // -> Classe qui implémente l'interface (onText à réimplementer)

        // (StreamReactive) Création d'un Publisher
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

        publisher.subscribe(new WebSocketSubscriber());

        WebSocket websocket = httpClient
            .newWebSocketBuilder()
            .buildAsync(new URI("ws://localhost:3000"), new WebSocketListener(publisher))
            .join();

        while (publisher.hasSubscribers()) {
            Thread.sleep(200);
        }

        System.out.println("Fin de l'application");
    }
}
