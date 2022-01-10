package net.razy.design.patterns.structural.bridge;

public abstract class AbstractAbstraction {

    ActionImplementor implementor;

    protected AbstractAbstraction(ActionImplementor implementor) {
        this.implementor = implementor;
    }

    abstract public void say();

    public void move() {
        implementor.move();
    }

    public void attack() {
        implementor.attack();
    }

    public void play() {
        this.say();
        this.move();
        this.attack();
    }

}
