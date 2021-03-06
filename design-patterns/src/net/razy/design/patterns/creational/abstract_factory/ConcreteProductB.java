package net.razy.design.patterns.creational.abstract_factory;

public class ConcreteProductB extends AbstractProductB {

    public ConcreteProductB(String factory) {
        System.out.println("\t- The " + this.getClass().getSimpleName() + " created in the " + factory);
    }

}
