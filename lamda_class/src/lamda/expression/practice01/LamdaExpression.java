package lamda.expression.practice01;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 람다식
 * - 1.8 에서 추가된 함수형 프로그래밍 기법
 * - 함수형 프로그래밍 -> 객체지향 프로그래밍과 다르게, 비즈니스 로직만 빠르게 구현하는 방식
 *
 * 비즈니스 로직 - Mission Critical한 부분 <= 돈이 되는 부분
 *
 * - 객체지향 언어인 Java에서 '메소드'를 '함수'처럼 사용하는 방식
 *      - Java에는 '함수'라는 것이 없이
 *      - 함수형 프로그래밍을 하려면 '1급 함수'라는 개념이 필요
 *      - 이것이 가능하게 하는 것이 람다식
 *          - 클래스 with 메소드 = 함수로 가정정 *
 */

//방법 1. Comparator 클래스를 만들고, 객체를 생성하여 전달.
class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.substring(1).compareTo(o2.substring(1));
    }
}

public class LamdaExpression {
    public static void main(String[] args) {
        // 람다식이 사용되는 대표적인 예
        String[] strings = {"fast", "campus", "java", "backend"};
        System.out.println(Arrays.toString(strings));

        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));

        //방법 1. Comparator 클래스를 만들고, 객체를 생성하여 전달.
        Arrays.sort(strings, new MyComparator());
        System.out.println(Arrays.toString(strings));

        //방법 2. 익명의 내부 클래스로 전달
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.substring(2).compareTo(o2.substring(2));
            }
        });
        System.out.println(Arrays.toString(strings));

        //방법 3. 람다
        Arrays.sort(strings, Comparator.comparing(o -> o.substring(3)));
        System.out.println(Arrays.toString(strings));

        //방법 4. Comparable
        class Hansol implements Comparable<Hansol>{
            String value;

            public Hansol(String value) {
                this.value = value;
            }

            @Override
            public int compareTo(Hansol o) {
                return this.value.substring(1).compareTo(o.value.substring(1));
            }

            @Override
            public String toString() {
                return value.toString();
            }
        }

        Hansol[] hansols = {new Hansol("java"), new Hansol("backend"), new Hansol("campus"), new Hansol("work")};
        Arrays.sort(hansols);
        System.out.println(Arrays.toString(hansols));
    }
}
