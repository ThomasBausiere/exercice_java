package org.example.behavioral.observer;

public class NextObserver implements Observer{

    @Override
    public void sendNotification(String notification) {
        System.out.println("Enregistrement dans un fichier de log: "+notification);
    }
}
