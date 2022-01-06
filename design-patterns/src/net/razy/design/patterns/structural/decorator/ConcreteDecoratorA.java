package net.razy.design.patterns.structural.decorator;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public String title() {
        return this.component.title() + " add decoration A";
    }

}
