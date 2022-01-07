package net.razy.design.patterns.creational.abstract_factory;

public class ConcreteFactory01 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA1(this.getClass().getSimpleName());
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB(this.getClass().getSimpleName());
    }

}
