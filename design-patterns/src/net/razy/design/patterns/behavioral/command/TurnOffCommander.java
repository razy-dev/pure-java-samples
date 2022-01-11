package net.razy.design.patterns.behavioral.command;

public class TurnOffCommander extends AbstractCommand {

    public TurnOffCommander(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("- TurnOffCommander Do something and call receiver off");
        receiver.off();
    }

}
