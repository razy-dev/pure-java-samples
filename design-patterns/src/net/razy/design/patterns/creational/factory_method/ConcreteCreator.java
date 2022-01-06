package net.razy.design.patterns.creational.factory_method;

public class ConcreteCreator extends AbstractCreator {

    @Override
    public AbstractProduct factoryMethod() {
        return new ConcreteProduct();
    }

}
