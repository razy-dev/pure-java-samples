package net.razy.design.patterns.structural.proxy;

public class Proxy extends AbstractSubject {

    private Subject subject;

    public Proxy(String name) {
        super(name);
        this.subject = new RealSubject(name);
    }

    @Override
    public void printInfo() {
        System.out.println("Call Proxy Method");
        this.subject.printInfo();
    }

}
