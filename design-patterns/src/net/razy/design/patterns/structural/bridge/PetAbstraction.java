package net.razy.design.patterns.structural.bridge;

public class PetAbstraction extends AbstractAbstraction {

    protected PetAbstraction(IActionImplementor handler) {
        super(handler);
    }

    @Override
    public void say() {
        implementor.say("냐옹");
    }

}
