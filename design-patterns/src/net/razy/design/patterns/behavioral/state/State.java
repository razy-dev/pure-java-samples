package net.razy.design.patterns.behavioral.state;

public abstract class State {

    Context context;

    public State(Context context) {
        this.context = context;
    }

    abstract void on();

    abstract void off();

}
