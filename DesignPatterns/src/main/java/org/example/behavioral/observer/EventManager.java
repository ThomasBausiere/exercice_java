package org.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class EventManager {


    private List<Observer> observers =  new ArrayList<>();

    public void addObserver(Observer observer){
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer){
        this.observers.remove(observer);
    }

    public void happyNotif(){
        for(Observer observer:observers){
            observer.sendNotification("THAT's cOOL !");
        }
    }

    public void sadNotif(){
        for(Observer observer:observers){
            observer.sendNotification("BOOO SHAME!");
        }
    }

    public void neutralNotif(){
        for(Observer observer:observers){
            observer.sendNotification("I don't care.");
        }
    }


}
