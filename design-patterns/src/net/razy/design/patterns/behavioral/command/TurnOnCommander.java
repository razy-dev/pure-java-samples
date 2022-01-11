package net.razy.design.patterns.behavioral.command;

public class TurnOnCommander extends AbstractCommand {

    public TurnOnCommander(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        System.out.println("- TurnOnCommander Do something and call receiver on");
        receiver.on();
    }

}
