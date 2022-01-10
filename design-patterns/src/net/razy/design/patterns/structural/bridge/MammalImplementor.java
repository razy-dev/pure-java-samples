package net.razy.design.patterns.structural.bridge;

public class MammalImplementor implements ActionImplementor {

    @Override
    public void move() {
        System.out.println("\t- 포유류는 기어간다.");
    }

    @Override
    public void attack() {
        System.out.println("\t- 포유류는 물어뜯는다.");
    }

}
