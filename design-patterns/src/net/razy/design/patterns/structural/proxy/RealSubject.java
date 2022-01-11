package net.razy.design.patterns.structural.proxy;

public class RealSubject extends AbstractSubject {

    public RealSubject(String name) {
        super(name);
    }

    @Override
    public void printInfo() {
        System.out.println("\t- My Name is " + name);
    }

}
