package org.example.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        Observer observer1= new MyObserver("observer 1");
        Observer observer2= new MyObserver("observer 2");

        eventManager.addObserver(observer1);
        eventManager.addObserver(observer2);

        eventManager.neutralNotif();
        eventManager.sadNotif();
        eventManager.happyNotif();
    }
}
