package net.razy.design.patterns.behavioral.mediator;

public class RedLight extends AbstractLight {

    public RedLight(Mediator mediator) {
        super(mediator);
        mediator.setRedLight(this);
    }

    @Override
    public void on() {
        System.out.println("\t- Red Light is On");
    }

    @Override
    public void off() {
        System.out.println("\t- Red Light is Off");
    }

    @Override
    public void turnOn() {
        System.out.println("\nRed Light Turn On");
        mediator.onRedLight();
    }

}
