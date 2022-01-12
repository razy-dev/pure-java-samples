package net.razy.design.patterns.behavioral.state;

public class Context {

    State state = new OffState();

    public void on() {
        this.state.on(this);
    }

    public void off() {
        this.state.off(this);
    }

    public void setState(State state) {
        this.state = state;
    }

}
