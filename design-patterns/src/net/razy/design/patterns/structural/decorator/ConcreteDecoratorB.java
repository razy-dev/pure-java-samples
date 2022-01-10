package net.razy.design.patterns.structural.decorator;

public class ConcreteDecoratorB extends AbstractDecorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public String title() {
        return this.component.title() + "\n\t add decoration B";
    }

}
