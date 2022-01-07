package net.razy.design.patterns.creational.abstract_factory;

public class ConcreteProductA1 extends AbstractProductA {

    public ConcreteProductA1(String factory) {
        System.out.println("\t- The " + this.getClass().getSimpleName() + " created in the " + factory);
    }

}
