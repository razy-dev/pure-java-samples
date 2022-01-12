package net.razy.design.patterns.behavioral.visitor;

public class RepairVisitor implements Visitor {

    @Override
    public void visit(Sensor sensor) {
        System.out.println("\t- Sensor Fixed");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("\t- Wheel Upgrade");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("\t- Engine Tune");
    }

}
