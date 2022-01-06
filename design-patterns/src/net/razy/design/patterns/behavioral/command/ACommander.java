package net.razy.design.patterns.behavioral.command;

public class ACommander implements Command {

    private final ReceiverA receiver;

    public ACommander(ReceiverA receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("Add to Queue receiverA");
        receiver.on();
    }

}
