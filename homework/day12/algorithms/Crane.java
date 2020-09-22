package lamda.expression.homework.algorithms;
import java.util.Stack;

public class Crane {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (Integer move : moves) {
            int moveIdx = move - 1;
            for (int i = 0; i < board.length; i++) {
                int crane = board[i][moveIdx];
                if(crane == 0) continue;
                if(!stack.empty() && stack.peek() == crane){
                    stack.pop();
                    answer++;
                } else {
                    stack.push(crane);
                }
                board[i][moveIdx] = 0;
                break;
            }
        }
        return answer * 2;
    }
}

