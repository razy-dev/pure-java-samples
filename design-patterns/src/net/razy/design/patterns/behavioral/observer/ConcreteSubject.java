package net.razy.design.patterns.behavioral.observer;

import java.util.Collection;
import java.util.HashSet;

public class ConcreteSubject implements Subject {

    private String state;

    public Collection<Observer> observers = new HashSet<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);
        }
    }

    @Override
    public String getState() {
        return state;
    }

    public void setState(String state) {
        System.out.println("\nSet Subject State = " + state);
        this.state = state;
        this.notifyObservers();
    }

}
