package net.razy.design.patterns.behavioral.chain_of_responsibility;

public abstract class Handler {

    protected Handler next;

    public Handler(Handler next) {
        this.next = next;
    }

    public void handleRequest(int num) {
        if (this.next != null) {
            this.next.handleRequest(num);
        } else {
            System.out.println("End of Chain\n");
        }
    }

}
