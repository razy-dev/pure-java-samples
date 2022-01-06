package net.razy.design.patterns.structural.adapter;

public class Adapter implements ITarget {

    private final Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public String targetMethod() {
        return adaptee.otherMethod();
    }

}
