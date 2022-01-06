package net.razy.design.patterns.behavioral.command;

public class BCommander implements Command {

    private final ReceiverB receiver;

    public BCommander(ReceiverB receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.run();
    }

}
