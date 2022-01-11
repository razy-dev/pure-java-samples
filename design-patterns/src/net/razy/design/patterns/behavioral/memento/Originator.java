package net.razy.design.patterns.behavioral.memento;

public class Originator {

    private String state;

    private String option;

    public void setState(String state) {
        this.state = state;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public void printInfo() {
        System.out.println("\t- Current State is " + state);
        System.out.println("\t- Current Option is " + option);
    }

    public Memento createMemento() {
        return new Memento(state, option);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
        this.option = memento.getOption();
    }

}
