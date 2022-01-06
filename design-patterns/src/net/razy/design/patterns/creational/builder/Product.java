package net.razy.design.patterns.creational.builder;

public class Product {

    public static ProductBuilder builder() {
        return new ProductBuilder();
    }

}
