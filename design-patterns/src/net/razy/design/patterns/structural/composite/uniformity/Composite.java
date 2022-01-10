package net.razy.design.patterns.structural.composite.uniformity;

import java.util.ArrayList;

public class Composite extends Component {

    public ArrayList<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        this.children.add(component);
    }

    @Override
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
