package net.razy.design.patterns.behavioral.state;

/**
 * GOF
 * 객체의 내부 상태에 따라 스스로 행동을 변경할 수 있게 허가하는 패턴으로, 이렇게 하면 객체는 마치 자신의 클래스를 바꾸는 것처럼 보입니다.
 * <p>
 * state 패턴을 구현한다는 것은 각 상태에 대응하는 별도의 클래스를 만들고 상태 전이 로직을 그 클래스들로 옮기는 작업을 뜻한다.
 * 이 때 원래의 호스트 객체를 [Design Patterns]에서는 컨텍스트(context)라 부르는데, 컨텍스트 객체는 상태와 관련된 기능을 스테이트 객체에 위임한다.
 * 그리고 상태 전이는 컨텍스트 객체의 대리 객체를 한 스테이트 객체에서 다른 스테이트 객체로 바꾸는 일이 된다.
 */
public class Client {

    public static void main(String[] args) {
        Context ctx = new Context();
        ctx.on();
        ctx.on();
        ctx.off();
        ctx.off();
    }

}
