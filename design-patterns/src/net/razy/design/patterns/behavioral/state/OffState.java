package net.razy.design.patterns.behavioral.state;

public class OffState implements State {

    @Override
    public void on(Context context) {
        System.out.println("Turn On");
        context.setState(new OnState());
    }

    @Override
    public void off(Context context) {
        System.out.println("It's already off");
    }

}
