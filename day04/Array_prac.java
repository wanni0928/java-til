package com.company;

/**
 * 배열(Array)
 * -배열의 특성
 * -하나의 변수로 여러 개의 값을 다룰 수 있다.
 * -동일 자료 형만 다룰 수 있다.
 * -한번 생성한 배열의 크기는 변하지 않는다.
 * -배열에 속한 값은 메모리에 연속으로 위치한다.
 */

public class Array_prac {

    public static void main(String[] args) {
        int[] integers = {2, 3, 4, 23, 54, -1, -99, 99};
        int maxVal = integers[0];
        int secondVal = 0;
//        for (int i = 0; i < integers.length; i++){
//            for (int j = 0; j < integers.length; j++){
//                maxVal = integers[i] > integers[j] ? integers[i] : integers[j];
//            }
//        }

//        for(int i = 0; i < integers.length; i++){
//            maxVal = maxVal > integers[i] ? maxVal : integers[i];
//        }

//        for (int val : integers) {
//            maxVal = maxVal > val ? maxVal : val;
//        }
//
//        for (int integer : integers) {
//            if (integer < maxVal) {
//                if (secondVal < integer) {
//                    secondVal = integer;
//                }
//            }
//        }

        int[] maxVals = new int[2];
        maxVals[0] = integers[0] > integers[1] ? integers[0] : integers[1];
        maxVals[1] = integers[0] < integers[1] ? integers[0] : integers[1];
        System.out.println(maxVals[0]);
        System.out.println(maxVals[1]);
        for (int val : integers) {
            if(maxVals[0] < val){
                maxVals[1] = maxVals[0];
                maxVals[0] = val;
            } else if(maxVals[1] < val){
                maxVals[1] = val;
            }
        }

//        System.out.println(maxVal);
//        System.out.println(secondVal);
        System.out.println(maxVals[0]);
        System.out.println(maxVals[1]);

    }
}
