package net.razy.design.patterns.creational.builder;

class BlueProductBuilder extends AbstractBuilder {

    @Override
    public void buildTitle() {
        this.product.setTitle("Blue Product");
    }

    @Override
    public void buildColor() {
        this.product.setColor("BLUE");
    }

    @Override
    public void buildPrice() {
        this.product.setPrice(1000);
    }

}
