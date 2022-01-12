package net.razy.design.patterns.behavioral.visitor;

public class ReportVisitor implements Visitor {

    @Override
    public void visit(Sensor sensor) {
        System.out.println("\t- Sensor OK");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("\t- Wheel OK");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("\t- Engine OK");
    }

}
