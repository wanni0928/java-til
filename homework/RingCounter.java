package com.company;
/**
 * 링카운터 출력기
 *
 * 크기가 4인 링카운터는 아래와 같이 동작한다.
 *
 * 0b0001 -> 0b0010 -> 0b0100 -> 0b1000 -> 0b0001 ...
 *
 * 즉, 링카운터는 하나의 비트만 1의 값을 가지며 1의 위치가 N번마다 반복되는 형태로 동작한다.
 *
 * 링카운터의 크기 numBits와카운트된 횟수 numCount를 이용하여
 * 현재 링카운터의 값을 10진수로 출력하는 프로그램을 작성하시오.
 */

public class RingCounter {
    public static void main(String[] args) {
        int numBits = 12;
        int numCount = 19;

        // moduls는 해당 연산자의 피연산자가 더 크면 본래 값이 그대로 출력되는 성질을 이용해서
        // 아무리 피연산자가 증가해도 일정 횟수마다 순환하는 피연산자를 구현할 수 있다.
        int result = numBits << numCount % numBits;

        System.out.printf("Result : %d", result);
    }
}
