package net.razy.design.patterns.behavioral.state;

public class Context {

    final State onState;

    final State offState;

    State state;

    public Context() {
        this.onState = new OnState(this);
        this.offState = new OffState(this);
        this.state = offState;
    }

    public void on() {
        this.state.on();
    }

    public void off() {
        this.state.off();
    }

    public void setState(State state) {
        this.state = state;
    }

}
