package net.razy.design.patterns.structural.bridge;

/**
 * GOF
 * 구현부에서 추상층을 분리하여 각자 독립적으로 변형이 가능하고 확장이 가능하도록 한다.
 * 즉 기능 클래스 계층과 구현 클래스 계층으로 구현을 하는 패턴.
 * 전형적인 상속을 이용한 패턴으로 확장 설계에 용이.
 */
public class Client {

    public static void main(String[] args) {
        // 독수리는 조류 답게 행동 한다.
        AbstractAbstraction eagle = new EagleAbstraction(new BirdImplementor());
        eagle.play();

        // 늑대는 포유류 답게 행동 한다.
        AbstractAbstraction wolf = new WolfAbstraction(new MammalImplementor());
        wolf.play();
    }

}
