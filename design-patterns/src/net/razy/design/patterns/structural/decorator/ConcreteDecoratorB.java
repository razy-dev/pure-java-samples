package net.razy.design.patterns.structural.decorator;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public String title() {
        return this.component.title() + " add decoration B";
    }

}
