package net.razy.design.patterns.behavioral.chain_of_responsibility;

public class NegativeHandler extends Handler {

    public NegativeHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(int num) {
        if (num < 0) {
            System.out.println("It's Negative.");
        } else {
            System.out.println("Pass " + this.getClass().getSimpleName());
        }
        super.handleRequest(num);
    }

}
