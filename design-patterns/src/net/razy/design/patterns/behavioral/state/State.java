package net.razy.design.patterns.behavioral.state;

public interface State {

    void on(Context context);

    void off(Context context);

}
