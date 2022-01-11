package net.razy.design.patterns.behavioral.observer;

public interface Subject {

    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();

    String getState();

}
