package net.razy.design.patterns.creational.builder;

class GreenProductBuilder extends AbstractBuilder {

    @Override
    public void buildTitle() {
        this.product.setTitle("Green Product");
    }

    @Override
    public void buildColor() {
        this.product.setColor("Green");
    }

    @Override
    public void buildPrice() {
        this.product.setPrice(1100);
    }

}
