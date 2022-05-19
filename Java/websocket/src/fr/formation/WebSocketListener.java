package fr.formation;

import java.net.http.WebSocket;
import java.net.http.WebSocket.Listener;
import java.util.concurrent.CompletionStage;

public class WebSocketListener implements WebSocket.Listener {
    @Override
    public CompletionStage<?> onText(WebSocket webSocket, CharSequence data, boolean last) {
        System.out.println(webSocket);
        System.out.println(data);
        System.out.println(last);
        
        return Listener.super.onText(webSocket, data, last);
    }
}
