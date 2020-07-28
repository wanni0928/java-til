package com.company;

public class Main {
    /**
     * 연산자(operator)
     *
     * 연산자(Operator), 피연산자(Operator) -> 연산식(Expression)
     * 사칙 연산자 : + - * /
     * 비교 연산자 : > < <= >=
     * 논리 연산자 :
     * 증감 연산자 :
     * 상황 연산자 :
     * 비트 연산자 :
     */
    public static void main(String[] args) {
        // 사칙연산
        int x = 10, y = 20, z;

        z = x + y; // + : 연산자, x : 피연산자, y : 피연산자, x + y : 연산식(Expression)
        // = : 연산자, z: 피연산자, x + y : 피연산자
        System.out.println(z);

        System.out.println("정수형 사칙연산");
        System.out.println(20 - 5);
        System.out.println(5 - 20);
        System.out.println(10 * 362);
        System.out.println(150 / 8); // 정수 나누기 -> 몫
        System.out.println(150 % 8); // modulus, 나머지
        System.out.println("실수형 사칙 연산");
        System.out.println(10.0 + 52.3);
        System.out.println(10.5f + 12.3); // float, double 같이 연산되면 double로 변환 후 연산
        System.out.println(10.4 - 50); // 실수형, 정수형을 같이 연산하면 실수형으로 변환 후 연산
        System.out.println(10.2 * 4.2);
        System.out.println(150 / 8.0);
        System.out.println(5.2 / 1.2);
        System.out.println(5.2 % 1.2);
        System.out.println("");

        System.out.println("사칙연산의 주의사항");
        System.out.println(Integer.MAX_VALUE / 2 * 3); // 계산 과정에서, 값의 범위를 넘어서서, 결과값이 뒤집어지는 현상(overflow)
        System.out.println(Integer.MAX_VALUE + 1);// 가장 큰 값에서 overflow 발생 시 가장 작은 값이 나온다.
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println((6 - 5.9) * 10);
        System.out.println(Math.floor((6 - 5.9) * 10));
        System.out.println((int) Math.ceil((6 - 5.9) * 10)); // 정밀도 문제

        System.out.println(40 / 0.0); // Infinity
        System.out.println(40 % 0.0); // Nan

        System.out.println();

        // 대입 연산자
        z = x + y;
        z += 10; // z = z + 10;
        z %= 2;
        // 논리연산자, 비트연산자 등등 다 됨

        // 비교 연산자
        System.out.println("비교 연산자");
        System.out.println(10 > 20);
        System.out.println(10 < 20);
        System.out.println(10 >= 10);

        x = 10;
        y = 10;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println("");

        // 논리연산자 - 입출력이 모두 boolean
        // a AND b : a, b 모두 참일때 만 참.
        // a OR b : a, b 둘 중 하나만 참 이라면, 참.
        // a XOR b : a, b 둘 중 하나만 참이여야만 참.
        // NOT a : a가 참이면 거짓, 거짓이면 참.
        System.out.println(10 < 20 & 40 >= 2); // AND
        System.out.println(10 < 20 && 40 >= 2);

        System.out.println(10 < 20 | 40 >= 2); // OR
        System.out.println(10 < 20 || 40 >= 2);
        System.out.println(!(10 < 20)); // NOT
        System.out.println(10 > 5 ^ 10 < 3);

        // short-circuit : 일단은 연산 속도가 좀더 빠르다. 정도로만 알자.
        System.out.println(10 < 20 && 4 < 2); // 비트 단위로 연산되기 때문에 꼭 boolean 연산이 아니어도 된다.
        System.out.println(2 < 8 || 2 < 5);

        // 증감 연산자 - 단항 연산자
        int val = 0;

        System.out.println(val++); // val = 0 으로 먼저 Expression 평가 후에 val += 1 적용.
        // sout(val)
        // val += 1;
        System.out.println(++val);
        // val += 1;
        // sout(val)
        System.out.println(val--);
        // sout(val)
        // val -= 1;
        System.out.println(--val);
        // val -= 1;
        // sout(val)

        val = 5;
        int new_val = val++ * 10 + --val;
        System.out.println(new_val);
        // 55

        // 삼항 연산자
        // ?:
        // (cond) ? (true expression) : (false expression)
        // boolean ? 값 : 값
        System.out.println(true ? 1 : 0);
        System.out.println(false ? 1 : 0);

        x = 10;
        y = 13;
        System.out.println(x > y ? x : y); // max function
        System.out.println(x < y ? x : y); // min function

        // 비트 연산자
        // 정수형 연산에 사용
        System.out.printf("b%32s\n", Integer.toBinaryString(8));
        System.out.printf("b%32s\n", Integer.toBinaryString(8 >> 1)); //shift 연산자
        System.out.printf("b%32s\n", Integer.toBinaryString(1423 >> 2)); //shift 연산자
        System.out.printf("b%32s\n", Integer.toBinaryString(1423 >> 1)); //shift 연산자
        System.out.printf("b%32s\n", Integer.toBinaryString(1423)); //shift 연산자
        System.out.printf("b%32s\n", Integer.toBinaryString(1423 << 1)); //shift 연산자
        System.out.printf("b%32s\n", Integer.toBinaryString(1423 << 2)); //shift 연산자
        System.out.printf("b%32s\n", Integer.toBinaryString(1423 << 3)); //shift 연산자

        System.out.printf("b%32s\n", Integer.toBinaryString(-1)); //shift 연산자
        System.out.printf("b%32s\n", Integer.toBinaryString(-1 >> 1));
        System.out.printf("b%32s\n", Integer.toBinaryString(-1 >>> 1)); //sign비트 연산자

        int intVal = 4123;
        intVal >>= 2; // intVal = intVal >> 2;
        intVal |= 412; // intVal = intVal | 412;

        System.out.printf("b%32s\n", Integer.toBinaryString(1252)); //sign비트 연산자
        System.out.printf("b%32s\n", Integer.toBinaryString(125234));
        System.out.printf("b%32s\n", Integer.toBinaryString(1252 & 15234));
        System.out.printf("b%32s\n", Integer.toBinaryString(1252 | 15234)); // 논리 연산자 처럼 보이 지만, 사실 비트연산자다.

        System.out.println(8 >> 1);
    }
}
