package com.company;

public class Main {
    /**
     *  **********
     *  **********
     *  **********
     *  **********
     */

    /**
     * *
     * **
     * ***
     * ****
     * *****
     */

    /**
     * *
     * **
     * ***
     * ****
     * *****
     */
    public static void main(String[] args) {
//	    for (int i = 0; i < 4; i++){
//	        for(int j = 0; j < 10; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i = 0; i < 5; i++){
//            for(int j = 0; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for(int i = 0; i < 5; i++){
//            for (int j = 5; j >= 0; j--){
//                if(j > i){
//                    System.out.print(" ");
//                }else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//
//        int row = 5;
//        for (int i = 0; i < row; i++){
//            for (int j = 0; j < i + 6; j++){
//                if(row - j > i){
//                    System.out.print(" ");
//                }else {
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }
//
//        row = 5;
//        for (int i = 0; i < row; i++){
//            for (int j = 0; j < i + 6; j++){
//                if(row - j > i){
//                    System.out.print(" ");
//                }else {
//                    System.out.print(i+1);
//                }
//            }
//            System.out.println();
//        }
//
//        row = 5;
//        for (int i = 0; i < row; i++){
//            for (int j = 0; j < i + 6; j++){
//                if(row - j > i){
//                    System.out.print(" ");
//                }else {
//                    if(row - j != 0){
//                        if(row - j > 0){
//                            System.out.print(row - j + 1);
//                        }else{
//                            System.out.print(j - row + 1);
//                        }
//                    }else {
//                        System.out.print(1);
//                    }
//                }
//            }
//            System.out.println();
//        }
        /**
         * 369 게임
         * 기본형 (순서대로 다 출력, 3, 6, 9 짝!)
         */
        for (int i = 1; i <= 10; i++) {
            int num1 = i % 10;
            int num2 = i / 10;
            if (num1 % 3 == 0 || num2 != 0 && num2 % 2 == 0) {
                System.out.println("짝!");
            } else {

            }
        }
//
//        for (int i = 0; i <= 60; i += 5) {
//            int num1 = i % 30;
//            int num2 = i / 10;
//            int numClap = 0;
//            if (num1 == 3 || num1 == 6 || num1 ==) {
//            }
//        }
    }
}

