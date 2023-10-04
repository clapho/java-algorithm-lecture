package Ch2_Array.Q_10;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(arr[i][j] > arr[i-1][j]
                        && arr[i][j] > arr[i+1][j]
                        && arr[i][j] > arr[i][j-1]
                        && arr[i][j] > arr[i][j+1]
                ) {
                   result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n+2][n+2];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
}
