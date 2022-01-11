package net.razy.design.patterns.behavioral.chain_of_responsibility;

/**
 * GOF
 * 요청 처리가 들어오게 되면 그것을 수신하는 객체가 자신이 처리할 수 없는 경우에는
 * 다음 객체에게 문제를 넘김으로써 최종적으로 요청을 처리할 수 있는 객체의 의해 처리가 가능하도록 하는 패턴입니다.
 * eg> Spring Security Filter Chain
 */
public class Client {

    public static void main(String[] args) {
        Handler chain = new NegativeHandler(
                new ZeroHandler(
                        new PositiveHandler(null)
                )
        );
        chain.handleRequest(-1);
        chain.handleRequest(0);
        chain.handleRequest(1);
    }

}
