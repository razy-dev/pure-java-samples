package net.razy.design.patterns.creational.factory_method;

public class ConcreteCreator extends AbstractCreator {

    @Override
    public AbstractProduct factoryMethod(String type) {
        switch (type.toUpperCase()) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                return new ConcreteProduct();
        }
    }

}
