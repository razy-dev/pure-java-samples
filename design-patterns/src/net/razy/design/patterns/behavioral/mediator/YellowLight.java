package net.razy.design.patterns.behavioral.mediator;

public class YellowLight extends AbstractLight {

    public YellowLight(Mediator mediator) {
        super(mediator);
        mediator.setYellowLight(this);
    }

    @Override
    public void on() {
        System.out.println("\t- Yellow Light is On");
    }

    @Override
    public void off() {
        System.out.println("\t- Yellow Light is Off");
    }

    @Override
    public void turnOn() {
        System.out.println("\nYellow Light Turn On");
        mediator.onYellowLight();
    }

}
