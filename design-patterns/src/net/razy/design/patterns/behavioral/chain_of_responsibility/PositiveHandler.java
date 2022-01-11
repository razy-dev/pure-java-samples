package net.razy.design.patterns.behavioral.chain_of_responsibility;

public class PositiveHandler extends Handler {

    public PositiveHandler(Handler next) {
        super(next);
    }

    @Override
    public void handleRequest(int num) {
        if (num > 0) {
            System.out.println("It's Positive.");
        } else {
            System.out.println("Pass " + this.getClass().getSimpleName());
        }
        super.handleRequest(num);
    }

}
