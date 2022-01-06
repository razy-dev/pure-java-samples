package net.razy.design.patterns.behavioral.state;

public class OnState extends State {

    public OnState(Context context) {
        super(context);
    }

    @Override
    public void on() {
        System.out.println("It's already on");
    }

    @Override
    public void off() {
        System.out.println("Turn Off");
        context.setState(context.offState);
    }

}
