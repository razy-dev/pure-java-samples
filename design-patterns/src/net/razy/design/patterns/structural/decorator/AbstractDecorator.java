package net.razy.design.patterns.structural.decorator;

public abstract class AbstractDecorator implements Component {

    protected Component component;

    AbstractDecorator(Component component) {
        this.component = component;
    }

}
