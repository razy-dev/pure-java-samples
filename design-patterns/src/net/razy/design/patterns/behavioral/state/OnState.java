package net.razy.design.patterns.behavioral.state;

public class OnState implements State {

    @Override
    public void on(Context context) {
        System.out.println("It's already on");
    }

    @Override
    public void off(Context context) {
        System.out.println("Turn Off");
        context.setState(new OffState());
    }

}
