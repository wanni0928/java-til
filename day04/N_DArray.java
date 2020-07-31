package com.company;

/**
 * N-D 배열(다차원 배열)
 * 배열의 배열을 달고 있므녀 , 다차원 배열이라 한다.
 * 수학에서 말하는 점 -> 선 -> 공간 -> 4차원 -> 5차원
 */
public class N_DArray {
    public static void main(String[] args) {
        //다차원 배열의 선언
        int [][] ints; // java-like
        int [] halfStyle []; // hybrid
        int oldStyle[][]; // old

        int [][] ints1 = new int[10][5]; // 길이가 5인 배열을 10개 담고있는 배열

        int [][] ints2 = new int[10][];
        for (int i = 0; i < ints2.length; i++){
            ints2[i] = new int[5];
        }

        int [][] ints3 = new int[5][];
        ints3[0] = new int[10];
        ints3[1] = new int[1];
        ints3[2] = new int[2];
        ints3[3] = new int[9];
        ints3[4] = new int[7];

        int [][] ints4 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // [2][3]
        int [][] ints5 = {{1, 3, 2}, {1, 2}, {4, 5, 3}};

        for(int i = 0; i < ints5.length; i++){
            System.out.printf("[%d] : ", ints5[i].length);
            for (int j = 0; j < ints5[i].length; j++){
                System.out.print(ints5[i][j]);
            }
            System.out.println("");
        }

        for (int[] value : ints5) {
            System.out.printf("[%d] : ", value.length);
            for (int i : value) {
                System.out.printf("%d ", i);
            }
            System.out.println("");
        }

    }
}
