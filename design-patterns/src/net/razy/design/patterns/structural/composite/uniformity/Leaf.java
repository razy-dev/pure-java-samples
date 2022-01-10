package net.razy.design.patterns.structural.composite.uniformity;

public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Impossible");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Impossible");
    }

    @Override
    public void printChildren(String parent) {
        System.out.println("Path = " + parent + " / " + name);
    }

}
