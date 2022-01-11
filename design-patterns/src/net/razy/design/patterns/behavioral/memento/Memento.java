package net.razy.design.patterns.behavioral.memento;

public class Memento {

    private String state;

    private String option;

    public Memento(String state, String option) {
        this.state = state;
        this.option = option;
    }

    public String getState() {
        return state;
    }

    public String getOption() {
        return option;
    }

}
