package fr.formation;

import java.util.concurrent.Flow;
import java.util.concurrent.Flow.Subscription;

public class WebSocketSubscriber implements Flow.Subscriber<String> {
    private Subscription subscription;
    private int compteur = 0;

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;

         // On demande le message suivant (à venir ou qui est déjà là)
        subscription.request(1);
    }

    @Override
    public void onNext(String message) {
        System.out.println("Message reçu [" + message + "]");

        this.compteur++;

        if (this.compteur >= 4) {
            subscription.cancel(); // On se désabonne
        }

         // On demande le message suivant (à venir ou qui est déjà là)
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onComplete() {
        // TODO Auto-generated method stub
    }
}
