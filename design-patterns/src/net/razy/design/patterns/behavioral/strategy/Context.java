package net.razy.design.patterns.behavioral.strategy;

public class Context {

    DiscountStrategy strategy;

    public Context(DiscountStrategy strategy) {
        this.setStrategy(strategy);
    }

    public void setStrategy(DiscountStrategy strategy) {
        System.out.println("\nApply the " + strategy.getClass().getSimpleName());
        this.strategy = strategy;
    }

    public void calculate(int price, int quantity) {
        System.out.println(String.format("\tPrice : %d and Quantity : %d => Amount : %8.2f",
                price,
                quantity,
                this.strategy.calculate(price, quantity)
        ));
    }

}
