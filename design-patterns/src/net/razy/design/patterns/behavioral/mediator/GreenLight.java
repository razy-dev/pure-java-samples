package net.razy.design.patterns.behavioral.mediator;

public class GreenLight extends AbstractLight {

    public GreenLight(Mediator mediator) {
        super(mediator);
        mediator.setGreenLight(this);
    }

    @Override
    public void on() {
        System.out.println("\t- Green Light is On");
    }

    @Override
    public void off() {
        System.out.println("\t- Green Light is Off");
    }

    @Override
    public void turnOn() {
        System.out.println("\nGreen Light Turn On");
        mediator.onGreenLight();
    }

}
