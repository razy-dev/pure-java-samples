package net.razy.design.patterns.behavioral.command;

public class CommanderB implements Command {

    private final Receiver receiver;

    public CommanderB(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("CommanderB do something");
        receiver.off();
    }

}
