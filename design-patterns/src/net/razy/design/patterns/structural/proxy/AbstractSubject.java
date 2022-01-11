package net.razy.design.patterns.structural.proxy;

public abstract class AbstractSubject implements Subject {

    protected String name;

    public AbstractSubject(String name) {
        this.name = name;
    }

}
