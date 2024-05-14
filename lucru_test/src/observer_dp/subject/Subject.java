package observer_dp.subject;

import observer_dp.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();
    public void notificaObservers(String mesaj){
        for(Observer obs: observers){
            obs.primesteMesaj(mesaj);
        }
    }

    public void adaugaObs(Observer observer){
        observers.add(observer);
    }
    public abstract void anunta();
}
