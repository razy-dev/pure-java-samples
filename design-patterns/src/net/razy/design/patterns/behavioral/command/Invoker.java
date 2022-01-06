package net.razy.design.patterns.behavioral.command;

public class Invoker {

    Command command;

    public Invoker(Command command) {
        this.setCommand(command);
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void exec() {
        command.execute();
    }

}
