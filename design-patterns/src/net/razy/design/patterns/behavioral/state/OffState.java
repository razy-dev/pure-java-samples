package net.razy.design.patterns.behavioral.state;

public class OffState extends State {

    public OffState(Context context) {
        super(context);
    }

    @Override
    public void on() {
        System.out.println("Turn On");
        context.setState(context.onState);
    }

    @Override
    public void off() {
        System.out.println("It's already off");
    }

}
