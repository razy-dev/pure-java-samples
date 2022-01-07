package net.razy.design.patterns.structural.bridge;

public abstract class AbstractAbstraction {

    IActionImplementor implementor;

    protected AbstractAbstraction(IActionImplementor implementor) {
        this.implementor = implementor;
    }

    abstract public void say();

    public void eat() {
        implementor.eat();
    }

    public void run() {
        implementor.run();
    }

}
