package net.razy.design.patterns.structural.bridge;

public class EagleAbstraction extends AbstractAbstraction {

    protected EagleAbstraction(ActionImplementor implementor) {
        super(implementor);
    }

    @Override
    public void say() {
        // 독수리에 특화된 기능 정의. 다른 기능은 조류 공통 구현에 맞긴다.
        System.out.println("\n독수리는 끼룩 끼룩");
    }

}
