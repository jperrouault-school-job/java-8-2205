package fr.formation;

import java.net.http.WebSocket;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.SubmissionPublisher;

public class WebSocketListener implements WebSocket.Listener {
    private SubmissionPublisher<String> publisher;

    public WebSocketListener(SubmissionPublisher<String> publisher) {
        this.publisher = publisher;
    }

    @Override
    public CompletionStage<?> onText(WebSocket webSocket, CharSequence data, boolean last) {
        // System.out.println(webSocket);
        // System.out.println(data);
        // System.out.println(last);

        publisher.submit(data.toString());

        return WebSocket.Listener.super.onText(webSocket, data, last);
    }
}
