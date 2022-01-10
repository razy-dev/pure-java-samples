package net.razy.design.patterns.structural.composite.type_safety;

public abstract class AbstractComposite implements Component {

    public String name;

    public AbstractComposite(String name) {
        this.name = name;
    }

}
