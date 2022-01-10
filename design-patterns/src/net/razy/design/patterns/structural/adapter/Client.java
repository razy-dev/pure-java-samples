package net.razy.design.patterns.structural.adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * GOF
 * 클래스의 인터페이스를 사용자가 기대하는 인터페이스 형태로 적응(변환) 시킵니다.
 * 서로 일치하지 않는 인터페이스를 갖는 클래스들을 함께 동작시킵니다.
 */
public class Client {

    public static void main(String[] args) {

        List<Target> adapters = new ArrayList<>();
        adapters.add(new AdapterA(new AdapteeA())); // AdapteeA 의 Adapter 등록
        adapters.add(new AdapterB(new AdapteeB())); // AdapteeB 의 Adapter 등록

        String message;
        for (Target a : adapters) {
            message = a.request();                  // 동일한 Method(Interface) 실행
            System.out.println(message);
        }
    }

}
