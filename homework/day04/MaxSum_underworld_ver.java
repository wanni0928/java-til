package com.company;

/**
 * 배열의 연속합 최대 구하기
 *
 * 정수 배열에서 연속된 값의 합의 최대값을 구하시오.
 *
 * ex1) {1, 45, -2, 5, -6} => 1 + 45 + (-2) + 5 = 49
 * ex2) {-4, 5, 12, -7, 52, -5, 7} => 5 + 12 + (-7) + 52 + (-5) + 7 = 64
 *
 *
 * 인자
 * integers: 정수 배열
 */

public class MaxSum_underworld_ver {
    public static void main(String[] args) {
        int [] integers = {-4, 7, 14, 9, -5, 4, 16, -22, 31};
        // write codes here
        int max = 0;
        int maxSum = integers[0];

        for (int i = 0; i < integers.length; i++) {
            for (int j = i + 1; j < integers.length; j++) {
                int sum = 0;
                for (int k = i; k < j; k++) {
                    sum += integers[k];
                }
                max = max > sum ? max : sum;
            }
        }

        System.out.println(max);
    }
}