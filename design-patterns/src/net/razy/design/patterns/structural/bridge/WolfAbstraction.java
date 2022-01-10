package net.razy.design.patterns.structural.bridge;

public class WolfAbstraction extends AbstractAbstraction {

    protected WolfAbstraction(ActionImplementor implementor) {
        super(implementor);
    }

    @Override
    public void say() {
        // 늑대에 특화된 기능 정의. 다른 기능은 포유류 공통 구현에 맞긴다.
        System.out.println("\n늑대는 워우~~~");
    }

}
