package net.razy.design.patterns.creational.builder;

public class Director {

    private AbstractBuilder builder;

    public void setBuilder(AbstractBuilder builder) {
        this.builder = builder;
    }

    public void constructProduct() {
        this.builder.createNewProduct();
        this.builder.buildTitle();
        this.builder.buildColor();
        this.builder.buildPrice();
    }

    public Product getProduct() {
        return this.builder.getProduct();
    }

}
