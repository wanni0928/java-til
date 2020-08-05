package com.company;

import java.util.ArrayList;

/**
 *
 * 변수 (Variables)
 * 클래스에 쓰이는 다양한 변수
 *  - 클래스 멤버 변수 (static variable, class variable)
 *  - 인스턴스 멤버 변수 (member variable, atrtibute)
 *  - 로컬 변수 (local variable)\
 *  - 로컬 파라미터 변수 (local parameter variable)
 *                    (arguments)
 *
 */

public class Variables {
    static int calssVar; // 클래스 멤버 변수, 스태틱 변수(정적 변수)
    int instanceVar; // 인스턴스 멤버 변수, 필드, 속성

    public void method(int paramVar){ // 로컬 파라미터 변수
        int localVar; // 로컬 변수
        //System.out.println(localVar); //로컬변수는 초기화가 안된다.
        localVar = 10;
        System.out.println(instanceVar);
        System.out.println(localVar);
        {
            localVar = 30;
            int localVar2 = 20;
        }
        System.out.println(localVar);
        // localVar2 = 40; // 생명주기가 끝났다. Life-Cycle
    }
}


class VariableTest {
    public static void main(String[] args) {
        System.out.println("클래스 변수");
        System.out.println(Variables.calssVar);
        // 클래스 변수는 클래스 이름으로 바로 접근 가능.
        Variables.calssVar = 10; // 클래스이름.변수명으로 접근 가능
        System.out.println(Variables.calssVar);
        System.out.println("");

        System.out.println("인스턴스 멤버 변수");
        Variables var = new Variables();
//        System.out.println(var.instanceVar); // 0으로 초기화
//        var.instanceVar = 10;
//        System.out.println(var.instanceVar);

        Variables var2 = new Variables();
        System.out.println(var2.instanceVar);

//        System.out.println(var2.calssVar); 가능은 하지만 권장하지 않음.
        var.method(9);

//        ArrayList<Integer> a = new ArrayList<>();
//
//        a.add(5);
//        a.add(2);
//        a.add(4);
//        a.add(7);
//
//        a.sort((o1, o2) -> {return o1 - o2;});
//        for (int aa: a
//             ) {
//            System.out.println(aa);
//        }
    }
}