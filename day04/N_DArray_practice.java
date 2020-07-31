package com.company;

/**
 * N-D 배열 연습
 *
 */
public class N_DArray_practice {
    public static void main(String[] args) {
        int[][] matA = {{1, 2, 3}, {3, 4, 5}};
        int[][] matB = {{3, 4, 5}, {1, 4, 2}};

        // 1.  matA + matB 를 구하고, 출력하시오
        // 2.  matA를 Transpose하고 출력하시오

        // 1 2 3
        // 4 5 6

        // 1 4
        // 2 5
        // 3 6

        //1번 문제
        for (int i = 0; i < matA.length; i++){
            for (int j = 0; j < matA[i].length; j++) {
                System.out.printf("%d ", matA[i][j] + matB[i][j]);
            }
            System.out.println();
        }

        //2번 문제
        int[][] matC = new int[matA[0].length][matA.length];
        for(int i = 0; i < matC.length; i++){
            for (int j = 0; j < matC[i].length; j++){
                matC[i][j] = matA[j][i];
                System.out.print(matC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
