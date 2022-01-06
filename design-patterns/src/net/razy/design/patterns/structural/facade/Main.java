package net.razy.design.patterns.structural.facade;

/**
 * GOF
 * 커다란 코드 부분에 대하여 간략화된 인터페이스를 제공해주는 디자인 패턴을 의미합니다.
 * 퍼사드 객체는 복잡한 소프트웨어 바깥쪽의 코드가 라이브러리의 안쪽 코드에 의존하는 일을 감소시켜 주고,
 * 복잡한 소프트웨어 및 절차를 사용 할 수 있게 간단한 인터페이스를 제공해줍니다.
 */
public class Main {

    public static void main(String[] args) {
        TheaterFacade facade = new TheaterFacade(
                new Amp(), new Projector(), new CDPlayer()
        );

        facade.play();
        facade.stop();
    }

}
