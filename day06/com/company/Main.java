package com.company;

import java.util.Arrays;

/*
* 클래스 - 객체를 생성하기 위한 설계도 (Class)
* 객체 - 클래스를 구체화하여 값으로 생성된 것 (Object, instance)
* 클래스를 객체로 만드는 과정 -> Instanciation
*
* 클래스 이름은 PascalCase로 적는다.
*
* */
class Car{
    int speed = 0; // 속성, 멤버 변수
    // 속성 : attribute, field
    // 멤버 변수 : member variable

    void move(){ // ** 메소드(method)** (가끔 멤버 함수), (가끔 함수)
        speed = 10;
    }
}
public class Main {
    public static void main(String[] args) {
        String string = "www.google.com";
        String[] strings = string.split("[.]");
        System.out.println(strings[1].charAt(strings[1].length() - 2));

        Arrays.stream(strings).forEach(ele -> System.out.println(ele));

        Car car = new Car();
        System.out.println(car.speed);
        car.move();
        System.out.println(car.speed);

        Car car2 = new Car();
        System.out.println(car2.speed);

        Car car3 = new Car();
        System.out.println(car3.speed);

        car3 = car;
        car3.speed = 40;
        car.speed = 10;
        System.out.println(car.speed);
        System.out.println(car3.speed);
    }
}
