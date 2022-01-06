package net.razy.design.patterns.behavioral.strategy;

public class Context {

    BarkBehavior barkBehavior;

    public Context(BarkBehavior barkBehavior) {
        this.setBarkBehavior(barkBehavior);
    }

    public void setBarkBehavior(BarkBehavior barkBehavior) {
        this.barkBehavior = barkBehavior;
    }

    public void bark() {
        this.barkBehavior.bark();
    }

}
