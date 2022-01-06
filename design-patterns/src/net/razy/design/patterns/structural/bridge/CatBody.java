package net.razy.design.patterns.structural.bridge;

public class CatBody extends AbstractBody {

    protected CatBody(IBodyHandler handler) {
        super(handler);
    }

    @Override
    public void say() {
        handler.say("냐옹");
    }

}
