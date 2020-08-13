package com.classs.generics;

/**
 * 재네릭 (Generics)
 * - 대상 객체 타입을 입력 받아서 사용하는 형식
 * - 미리 사용할 수 있는 타입을 명시해서 컴파일 타임에 체크가능
 *      - 입력을 Object로 할 수도 있으나, 런타임 instanceof로 객체를 체크해야 함
 *      - 재네릭을 사용할 경우 이러한 과정 없이 간결하게 코드 작성을 할 수 있다.
 */

// 재네릭 클래스
class Foo {

}

// 재네릭 클래스.
// 클래스를 선언할때에는 설정되지 않은 타입이 있으며, 이것을 타입 파라미터로 표현.
class GenericFoo<T> { // T : 타입 파라미터
    String name;
    T memberVar;

    public GenericFoo(String name, T memberVar) {
        this.name = name;
        this.memberVar = memberVar;
    }
}

interface GenericInterface<T> { // 인터페이스도 재네릭이 가능

}

class HashMap<K, V> { // 여러개의 타입 파라미터도 쓸 수 있다.

}

class GenericBar<T> { // 소속이 클래스냐, 객체냐에 따라 작동여부를 확인할 수 있다.
//    static  T classVar; // not possible
//    static void method(T var); // not possible

//    문법적으로 문제는 없겠지만, 안정성 문제로 금지
//    T memberVar = new T(); // not possible -> 안정성 문제 때문에 불가능하다.
//    {
//        Object obj = new Object();
//        if(obj instanceof T){ // not possible -> 안정성 문제로 작동이 안된다.
//
//        }
//    }

}

// 재네릭 타입의 상속
class GFoo<T> {

}

interface IGFoo<T> {

}

// 타입 파라미터는 부모 재네릭의 타입 파라미터를 모두 채워 주어야 한다.
// 추가적인 타입 파라미터도 사용할 수 있다.
class GIGFoo<K, T, G> extends GFoo<T> implements IGFoo<G> {

}

// 부모 클래스 인터페이스들에 동일한 타입 파라미터를 넘길 수 있다.
class IGIFooTwo<T> extends GFoo<T> implements IGFoo<T> {

}

// 타입 제한을 하지 않으면, Object와 동일하다.
class GenericNoTypeLimit<T extends Object>{}

// extends를 이용해서 부모 클래스를 제한할 수 있음
class GenericTypeLimitation <T extends Number & Cloneable> {

}

// 재네릭 메소드
class GenericMethod {
    public static <T> T staticMethod (T t){
        return t;
    }
    public int method(int x) {
        return x;
    }
    public <T> T method(T x) {
        return x;
    }
}

// 와일드카드
class WildFoo {

}

class WildBar extends WildFoo {

}

class WildGeneric<T> {}

// 와일드카드 ?는 메소드의 입력 타입에 제네릭이 쓰일 경우.
// 재네릭의 타입 변수를 결정하지 않거나 재현할 수 있다.

class WildCard {
    public void method1(WildGeneric<?> x){ }
    public void method1_eq(WildGeneric<? extends Object> x){ } // Object가 상환
    public void method2(WildGeneric<? extends WildFoo> x){ } // WildFoo, WildBar
    public void method3(WildGeneric<? super WildBar> x){ } // Object, WildFoo, WildBar
}

public class Generics {
    public static void main(String[] args) {
        GenericFoo<String> foo = new GenericFoo<>("name", "memberVar");
        GenericFoo<String> foo1 = new GenericFoo<>("name1", "memberVar1");
        System.out.println(foo.name);
        System.out.println(foo.memberVar);

        GenericFoo<Integer> foo2 = new GenericFoo<>("name2", 9999);
        System.out.println(foo2.name);
        System.out.println(foo2.memberVar);

        GenericMethod.staticMethod("qqq");
        GenericMethod.staticMethod(12345);
        GenericMethod.staticMethod(0.00000001);
    }
}
