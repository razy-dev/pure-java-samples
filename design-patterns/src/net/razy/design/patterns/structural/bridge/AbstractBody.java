package net.razy.design.patterns.structural.bridge;

public abstract class AbstractBody {

    IBodyHandler handler;

    protected AbstractBody(IBodyHandler handler) {
        this.handler = handler;
    }

    abstract public void say();

    public void eat() {
        handler.eat();
    }

    public void run() {
        handler.run();
    }

}
