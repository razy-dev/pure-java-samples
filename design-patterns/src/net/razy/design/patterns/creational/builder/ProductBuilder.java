package net.razy.design.patterns.creational.builder;

class ProductBuilder {

    private String title;

    private String color = "RED";   // with Default Value

    private int price = 0;          // with Default Value

    public ProductBuilder title(String title) {
        this.title = title;
        return this;
    }

    public ProductBuilder color(String color) {
        this.color = color;
        return this;
    }

    public ProductBuilder price(int price) {
        this.price = price;
        return this;
    }

    Product build() {
        return new Product(this.title, this.color, this.price);
    }

}
