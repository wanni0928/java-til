package lamda.expression.homework;

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
    boolean test(T input, Y input2, R groundtruth, Solution<? super T, ? super Y, ? super R> solution) {
        // TODO: solution을 실행하고, 이것이 정답(groundtruth)와 일치하는지 테스트하여 일치 여부를 출력.
        return solution.solve(input, input2) == groundtruth;
    }
}

public class LamdaExpressions {
//    void solution(String a, String b){}

    public static void main(String[] args) {
        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

        Algorithm<int[][], int[], Integer> algorithm = new Algorithm<>();
        System.out.println(algorithm.test(board, moves, 4, new Solution<int[][], int[], Integer>() {
            @Override
            public Integer solve(int[][] board, int[] moves) {
                return new Crane().solution(board, moves);
            }
        }));
    }

}
