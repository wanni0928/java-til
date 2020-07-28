package com.company;

import java.util.Scanner;

/**
 * 자료 입출력
 * 출력 - print, println, printf, 포맷팅 방법
 * 입력 - 키보드 입력 받기
 */
public class Main {

    public static void main(String[] args) {
	    // 출력 메소드
        System.out.println("String can be printed.");
        System.out.println('C');
        System.out.println(44234);
        System.out.println(1.423f);
        System.out.println(134.234);

        System.out.print("12345678\r\n");
        System.out.println("");

        System.out.printf("%s is for string\n", "STRING");
        System.out.printf("%s %s %s\n", "123", "456", "789");
        System.out.printf("%b\n", true);
        System.out.printf("%d 0x%x 0x%X 0%o\n", 15, 15, 15, 15);
        System.out.printf("%f\n", 14.23);
        System.out.printf("%f\n", 14.23f);
        System.out.printf("%e\n", 14.423);
        System.out.printf("%c %c\n", 'U', '\u0042');
        System.out.printf("%n");
        
        // 정수 자릿수 표현
        System.out.printf("%5d.\n", 10); // 10진수를 출력하기 전에 최소 5칸을 확보해라(좌측으로)
        System.out.printf("%-5d.\n", 10); // 10진수를 출력하기 전에 최소 5칸을 확보해라(우측으로)
        System.out.printf("%05d\n", 234);
        System.out.printf("%3d\n", 104294); // '최소한' 3칸을 확보하라는 뜻으로, 사용되기 때문에, 출력 값의 길이가 더 길 경우 별문제 없이 그대로 출력된다.

        // 실수 자릿수 표현
        System.out.printf("%5.4f\n", 1343.23456);
        System.out.printf("%5.2f\n", 1.425);
        System.out.printf("");

        // 입력 메소드
        System.out.println("Input method");
        Scanner scanner = new Scanner(System.in);

//        String s1 = scanner.next(); // 공백으로 구분된 String을 입력 받는다.
//        System.out.println(s);

        // this is string
        // next() 메소드는 입력을 내용이 있을 때 까지 기다린다.
        // Blocking 메소드라고 부른다. (<-> non-blocking 메소드)
//        System.out.println(scanner.next()); // "this"
//        System.out.println(scanner.next()); // "is"
//        System.out.println(scanner.next()); // "string"

//        System.out.println(scanner.nextInt());
//        System.out.println(scanner.nextInt());
//        System.out.println(scanner.nextInt());
//        System.out.println(scanner.nextInt());

        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());

    }
}
