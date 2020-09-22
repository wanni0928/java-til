package lamda.expression.homework;

import lamda.expression.homework.algorithms.BestAlbum;

import java.util.Arrays;

/**
 * 람다식을 이용하여 알고리즘 정답을 테스트하는 프로그램을 작성하시오.
 *
 * 주어진 interface와 실행 메소드를 이용하여 알고리즘 정답을 테스트하는 프로그램을 작성하시오.
 * 이 테스트 방식을 이용하여 실제 알고리즘 문제를 하나 이상 풀이하시오.
 *
 */

interface Solution<T, Y, R> {
    R solve(T t, Y y);
}

class Algorithm<T, Y, R> {
    public Algorithm() {
    }

    boolean test(T input, Y input2, R groundtruth, Solution<? super T, ? super Y, ? super R> solution) {
        // TODO: solution을 실행하고, 이것이 정답(groundtruth)와 일치하는지 테스트하여 일치 여부를 출력.
        if(groundtruth.getClass().isArray()){
            return testArrayAnswer(input, input2, (int[]) groundtruth, solution);
        }
        System.out.println("답이 기본형인 경우");
        return solution.solve(input, input2).equals(groundtruth);
    }

    boolean testArrayAnswer(T input, Y input2, int[] groundtruth, Solution<? super T, ? super Y, ? super R> solution){
        System.out.println("답이 배열인 경우");
        if(solution.solve(input, input2) instanceof int[]){
            int[] answer = (int[]) solution.solve(input,input2);
            return Arrays.equals(answer, groundtruth);
        }
        return false;
    }
}

public class LamdaExpressions {
//    void solution(String a, String b){}

    // 1. crane - https://programmers.co.kr/learn/courses/30/lessons/64061
//    public static void main(String[] args) {
//        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
//        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
//
//        Algorithm<int[][], int[], Integer> algorithm = new Algorithm<>();
//        System.out.println(algorithm.test(board, moves, 4, (board1, moves1) -> new Crane().solution(board1, moves1)));
//    }

    // 2. BestAlbum - https://programmers.co.kr/learn/courses/30/lessons/42579
    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};
        int[] answer = {4, 1, 3, 0};
        System.out.println(Arrays.toString(new BestAlbum().solution(genres, plays)));
        Algorithm<String[], int[], int[]> algorithm = new Algorithm();
        System.out.println(algorithm.test(genres, plays, answer, new Solution<String[], int[], int[]>() {
            @Override
            public int[] solve(String[] strings, int[] ints) {
                return new BestAlbum().solution(genres, plays);
            }
        }));
    }

}
