package com.company;

public class Main {
    /*
    * 변수(variable)
    * 변하는 수, 수학의 변수와 유사함.
    * 변수의 타입, 변수명, 값 할당
    * 변수의 선언
    * 변수에 값 할당 (리터럴)
    * 변수명 규칙
    * */
    static int STATIC_VARIABLE = 10;

    public static void main(String[] args) {
	    int x;
	    x = 10; // 10 -> 리터럴
        System.out.println(x);

        int y, z, value;

        int valueOne = 10;
        int valuTwo = 20;
        int valueThree = 100, valueFour = 40;
//        int int;
//        int 4th;
        int intOne;
        int 한글도_가능; //웬만하면 쓰지말자
//        int fwel%de; //$는 사용사능(하지만, 라이브러리, lowlevel 단에서 사용되기 때문에 웬만하면 쓰지말자)

        // code convention
        int valueOfComputer;
        int camelCase;
        int lowerCamelCase;
        int UpperCalmelCase;

        //int PascalCase; -> class name
        int _8thWord;
    }
}
