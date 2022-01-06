package net.razy.design.patterns.behavioral.template_method;

public abstract class AbstractClass {

    public void run() {
        ready();
        send();
        close();
    }

    void ready() {
        System.out.println("Ready!!");
    }

    abstract void send();

    void close() {
        System.out.println("Closed!!");
    }

}
