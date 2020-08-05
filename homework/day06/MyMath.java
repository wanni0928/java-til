package homework.day06;

import sun.misc.DoubleConsts;

/**
 * MyMath 클래스 구현하기
 * 인스턴스를 생성할 수 없는 MyMath 클래스를 구현하시오.
 *
 * MyMath 클래스는 다음 정적 변수를 가진다.
 * PI = 3.1415927;
 * E = 2.718281;
 *
 * MyMath 클래스는 다음 정적 메소드를 가진다.
 * min - 정수 또는 실수를 여러개 입력받아 최소값을 구한다.
 * max - 정수 또는 실수를 여러개 입력받아 최대값을 구한다.
 * abs - 정수 또는 실수를 입력받아 절대값을 구한다.
 * floor - 실수를 입력받아 내림 연산한 정수를 출력한다.
 * ceil - 실수를 입력받아 올림 연산한 정수를 출력한다.
 */

public class MyMath {
    static double PI = 3.1415927;
    static double E = 2.718281;

    public static int min(int... params){
        int min = params[0];
        for (int number : params) {
            min = min > number ? number : min;
        }
        return min;
    }

    public static int max(int... params){
        int max = params[0];
        for (int number : params) {
            max = max < number ? number : max;
        }
        return max;
    }

    public static int abs(int number){
        number = number > 0 ? number : (number * -1);
        return number;
    }

    public static double abs(double number){
        number = number > 0 ? number : (number * -1);
        return number;
    }
    public static double floorOrCeil(double number, double sign){
        int exponent = Math.getExponent(number); // 매개변수의 지수부 -> 매개변수의 진수가 1이상이면, 양수, 0이면 음수
        if(exponent < 0){
            // 매개변수의 진수부 크기가 1보다 작을때
            return number == 0.0 ? number : number < 0.0 ? -0.0 : 0.0;
        } else if(exponent >= 52){
            // 매개변수의 표현 범위가 integral 방식으로 입력되어야 할 경우, 혹은 Infinity, NaN 오류가 발생할 경우
            return number;
        }

        long doppel = Double.doubleToRawLongBits(number);
        long mask   = DoubleConsts.SIGNIF_BIT_MASK >> exponent;

        if ( (mask & doppel) == 0L )
            return number; // integral value
        else {
            double result = Double.longBitsToDouble(doppel & (~mask));
            if (sign*number > 0.0)
                result = result + sign;
            return result;
        }
    }

    public static double floor(double number){
        double sign = -1.0;
        return floorOrCeil(number, sign);

    }

    public static double ceil(double number){
        double sign = 1.0;
        return floorOrCeil(number, sign);
    }
}

class MyMathTest {
    public static void main(String[] args) {
        // System.out.println(MyMath()); // should fail
        System.out.println(MyMath.PI);
        System.out.println(MyMath.E);
        System.out.println(MyMath.min(2, 3, -4, 6));
        System.out.println(MyMath.max(7, 0, 6, 16, -4));
        System.out.println(MyMath.abs(-5));
        System.out.println(MyMath.abs(-2.3));
        System.out.println(MyMath.floor(-1.5232));
        System.out.println(MyMath.ceil(4.6452));

        //playground
//        System.out.println(Math.ceil(4.6452));
        //        System.out.println(Math.abs(2));
//        System.out.println(Math.abs(-2));
//        System.out.println(Math.abs(2.3));
//        System.out.println(Math.abs(-2.3));
//        System.out.println("exponent" + Math.getExponent(-0.25)); // exponet - 지수 -> 소수의 부호에 상관없이 진수부가 1이상이면 양수, 0이면 음수 리턴
//        System.out.println(Math.floor(9999999999999.99999999999999));
//        System.out.println(MyMath.abs(-5));
//        System.out.println(MyMath.abs(-2.3));
//        System.out.println(Math.floor(1.5232));
//        System.out.println(Math.floor(-1.5232));
//        System.out.println(Math.floor(-1.3232));
//        System.out.println(Double.doubleToRawLongBits(-1.5232));
//        System.out.println(Double.longBitsToDouble(Double.doubleToRawLongBits(-1.5232)));
    }
}
