package net.razy.design.patterns.behavioral.visitor;

public interface Visitor {

    void visit(Sensor sensor);

    void visit(Wheel wheel);

    void visit(Engine engine);

}
