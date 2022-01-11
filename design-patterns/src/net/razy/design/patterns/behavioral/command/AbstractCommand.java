package net.razy.design.patterns.behavioral.command;

public abstract class AbstractCommand implements Command {

    protected final Receiver receiver;

    public AbstractCommand(Receiver receiver) {
        this.receiver = receiver;
    }

}
