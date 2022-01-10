package net.razy.design.patterns.structural.composite.type_safety;

public class Leaf extends AbstractComposite {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void printChildren(String parent) {
        System.out.println("Path = " + parent + " / " + name);
    }

}
