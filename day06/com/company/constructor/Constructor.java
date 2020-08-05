package com.company.constructor;

/**
 * 생성자(Contructor)
 * 클래스에 인스턴스를 생성할 때 사용하는 메소드
 * new 키워드를 사용할 때 호출되는 메소드
 *
 * 기본 생성자 (Default constructor)
 * 파라미터 생성자(Parameter constructor)
 * -> 여러개의 생성자를 오버로딩할 수 있음
 */
public class Constructor {
    int x;
    int y;
    String z;

//    public Constructor(){} // 기본 생성자, 구현하지 않아도 알아서 생긴다.
    public Constructor(){
       this(0, 0, "");
    }

//    public Constructor(int a, int b, String c){
//        x = a;
//        y = b;
//        z = c;
//    }

    public Constructor(int a, int b, String c){
        this.x = a;
        this.y = b;
        this.z = c;
    }

//    public Constructor(int a, int b){
//        x = a;
//        y = b;
//        z = "";
//    }
//    private Constructor(){
//
//    }

    public Constructor(int a, int b){
        this(a, b, ""); // this는 무조건 첫 줄에만 쓰일 수 있다.
    }
}

class ConstructorTest {
    public static void main(String[] args) {
//        Constructor c = new Constructor();
//        System.out.println(c.x + "," + c.y + "," + c.z);
        // z의 경우,클래스이기 때문에 null로 초기화가 된다.
        // null -> 아무것도 참조하고 있지 않다.

        Constructor c1 = new Constructor(1, 2, "파라미터생성자");
        Constructor c2 = new Constructor(10, 20);
    }
}
