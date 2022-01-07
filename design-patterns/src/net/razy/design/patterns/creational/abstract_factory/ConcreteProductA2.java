package net.razy.design.patterns.creational.abstract_factory;

public class ConcreteProductA2 extends AbstractProductA {

    public ConcreteProductA2(String factory) {
        System.out.println("\t- The " + this.getClass().getSimpleName() + " created in the " + factory);
    }

}
