package net.razy.design.patterns.behavioral.strategy;

public class NormalDiscountStrategy implements DiscountStrategy {

    @Override
    public float calculate(int price, int quantity) {
        return (float) (price * quantity * 0.9);
    }

}
