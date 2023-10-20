package Ch5_Stack_Queue.Q_3;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(int n, int[][] arr, int m, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int num : moves) {
            int i = 0;
            while (arr[i][num - 1] == 0) {
                i++;
                if(i == n-1) break;
            }
            if (!stack.isEmpty()) {
                if (stack.peek() == arr[i][num - 1]) {
                    stack.pop();
                    answer += 2;
                    arr[i][num - 1] = 0;
                    continue;
                }
                stack.push(arr[i][num - 1]);
                arr[i][num - 1] = 0;
            }else {
                if (arr[i][num - 1] != 0) {
                    stack.push(arr[i][num - 1]);
                    arr[i][num - 1] = 0;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        int m = kb.nextInt();
        int[] moves = new int[m];

        for (int i = 0; i < m; i++) {
            moves[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, arr, m, moves));
    }
}
