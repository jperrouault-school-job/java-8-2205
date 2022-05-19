package fr.formation.reactive;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;

public class App {
    public static void main(String[] args) throws Exception {
        // Subscribers -> Publishers
        SubmissionPublisher<Integer> publisher = new SubmissionPublisher<>();

        publisher.subscribe(new Subscriber<Integer>() {
            private Subscription subscription;

            @Override
            public void onSubscribe(Subscription subscription) {
                // Ce qu'il se passe à la souscription
                this.subscription = subscription;
                subscription.request(5);
            }

            @Override
            public void onNext(Integer item) {
                // La réception d'un élément
                System.out.println("Elément reçu : " + item);
                System.out.println(Thread.currentThread().getName());
                subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
                // Quand y'a une erreur ...
            }

            @Override
            public void onComplete() {
                // Quand c'est terminé
            }
        });


        for (int i = 0; i < 10; i++) {
            publisher.submit(i);
        }

        Thread.sleep(1000);
    }
}
