package net.razy.design.patterns.behavioral.mediator;

public interface Mediator {

    void onRedLight();

    void onGreenLight();

    void onYellowLight();

    void setRedLight(RedLight redLight);

    void setGreenLight(GreenLight greenLight);

    void setYellowLight(YellowLight yellowLight);

}
