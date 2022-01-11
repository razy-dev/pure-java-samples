package net.razy.design.patterns.behavioral.observer;

public class ConcreteObserverB implements Observer {

    @Override
    public void update(Subject subject) {
        System.out.println("\t-" + this.getClass().getSimpleName() + " Update by " + subject.getState());
    }

}
