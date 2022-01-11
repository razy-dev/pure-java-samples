package net.razy.design.patterns.behavioral.mediator;

public abstract class AbstractLight implements Colleague {

    protected Mediator mediator;

    public AbstractLight(Mediator mediator) {
        this.mediator = mediator;
    }

}
