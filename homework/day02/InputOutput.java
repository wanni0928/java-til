package com.company;

import java.util.Scanner;

public class InputOutput {
    /**
     * 입력받아 처리하기
     *
     * 3개의 정수를 입력받아, 그 중 최대값을 출력하고자 한다.
     * 이를 수행하는 프로그램을 작성하시오.
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int max = 0;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        /* Solution 1 : 연속적인 삼항연산자로 최대값을 뽑는다. */
        max = a > b ? a > c ? a : c : b > c ?  b : c;

        /* Solution 2 : Math 라이브러리로 서로 비교한다. */
//        max = Math.max(a, b) == a ? Math.max(a, c) == a ? a : c : Math.max(b, c) == b ? b : c;
        System.out.println("MAX : " + max);
    }
}
