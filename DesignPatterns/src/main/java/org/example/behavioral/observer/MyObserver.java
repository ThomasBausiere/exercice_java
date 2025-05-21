package org.example.behavioral.observer;

public class MyObserver implements Observer{
    private  String name;
    public MyObserver(String name){
        this.name= name;
    }

    @Override
    public void sendNotification(String notification) {
        System.out.println(name +"a reçu la notification:"+notification);
    }
}
