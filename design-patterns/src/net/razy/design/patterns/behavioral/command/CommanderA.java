package net.razy.design.patterns.behavioral.command;

public class CommanderA implements Command {

    private final Receiver receiver;

    public CommanderA(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("CommanderA do something");
        receiver.on();
    }

}
