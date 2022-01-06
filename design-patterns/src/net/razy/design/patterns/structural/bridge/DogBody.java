package net.razy.design.patterns.structural.bridge;

public class DogBody extends AbstractBody {

    protected DogBody(IBodyHandler handler) {
        super(handler);
    }

    @Override
    public void say() {
        handler.say("댕댕");
    }

}
