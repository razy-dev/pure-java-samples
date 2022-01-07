package net.razy.design.patterns.creational.abstract_factory;

public class ConcreteFactory02 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2(this.getClass().getSimpleName());
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB(this.getClass().getSimpleName());
    }

}
