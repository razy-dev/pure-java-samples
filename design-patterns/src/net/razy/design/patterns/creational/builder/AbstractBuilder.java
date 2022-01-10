package net.razy.design.patterns.creational.builder;

public abstract class AbstractBuilder {

    protected Product product;

    public Product getProduct() {
        return this.product;
    }

    public void createNewProduct() {
        this.product = new Product();
    }

    public abstract void buildTitle();

    public abstract void buildColor();

    public abstract void buildPrice();

}
