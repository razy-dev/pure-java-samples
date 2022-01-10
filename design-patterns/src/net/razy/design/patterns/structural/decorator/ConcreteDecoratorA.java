package net.razy.design.patterns.structural.decorator;

public class ConcreteDecoratorA extends AbstractDecorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public String title() {
        return this.component.title() + "\n\t add decoration A";
    }

}
