package net.razy.design.patterns.structural.composite.uniformity;

public abstract class Component {

    public String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract void printChildren(String parent);

}
