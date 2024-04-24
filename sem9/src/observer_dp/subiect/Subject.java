package observer_dp.subiect;

import observer_dp.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>();
    public abstract void anuntaPlecare();
    public void abonareObserver(Observer observer){
        observers.add(observer);
    }
    public void dezabonareObservers(Observer observer){
        observers.remove(observer);
    }

    protected void notificareObservers(String mesaj){
        observers.forEach(observer -> {
            observer.primesteMesaj(mesaj);
        });
    }
}
