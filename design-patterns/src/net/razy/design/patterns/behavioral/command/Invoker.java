package net.razy.design.patterns.behavioral.command;

public class Invoker {

    Command commandA;

    Command commandB;

    public Invoker(Command commandA, Command commandB) {
        this.commandA = commandA;
        this.commandB = commandB;
    }

    public void commandA() {
        commandA.execute();
    }

    public void commandB() {
        commandB.execute();
    }

}
