package net.razy.design.patterns.behavioral.mediator;

public class ConcreteMediator implements Mediator {

    private RedLight redLight;

    private GreenLight greenLight;

    private YellowLight yellowLight;

    @Override
    public void onRedLight() {
        this.redLight.on();
        this.greenLight.off();
        this.yellowLight.off();
    }

    @Override
    public void onGreenLight() {
        this.redLight.off();
        this.greenLight.on();
        this.yellowLight.off();
    }

    @Override
    public void onYellowLight() {
        this.redLight.off();
        this.greenLight.off();
        this.yellowLight.on();
    }

    @Override
    public void setRedLight(RedLight redLight) {
        this.redLight = redLight;
    }

    @Override
    public void setGreenLight(GreenLight greenLight) {
        this.greenLight = greenLight;
    }

    @Override
    public void setYellowLight(YellowLight yellowLight) {
        this.yellowLight = yellowLight;
    }

}
