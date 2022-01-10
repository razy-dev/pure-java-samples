package net.razy.design.patterns.structural.composite.type_safety;

import java.util.ArrayList;

public class Composite extends AbstractComposite {

    public ArrayList<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    public void add(Component component) {
        this.children.add(component);
    }

    public void remove(Component component) {
        this.children.remove(component);
    }

    @Override
    public void printChildren(String parent) {
        for (Component c : this.children) {
            c.printChildren(parent + " / " + name);
        }
    }

}
