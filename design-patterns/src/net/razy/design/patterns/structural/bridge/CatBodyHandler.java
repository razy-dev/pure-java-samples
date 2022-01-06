package net.razy.design.patterns.structural.bridge;

public class CatBodyHandler implements IBodyHandler {

    @Override
    public void say(String sound) {
        System.out.println("고양이는 " + sound);
    }

    @Override
    public void eat() {
        System.out.println("고양이는 깨작깨작");
    }

    @Override
    public void run() {
        System.out.println("고양이는 우다다");
    }

}
