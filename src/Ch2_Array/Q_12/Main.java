package Ch2_Array.Q_12;

import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[][] arr) {
        int cnt = 0;
        int[][] tmp = new int[m][n];

        for (int i = 0; i < m; i++) {
            int num = 0;
            for (int j = 0; j < n; j++) {
                tmp[i][arr[i][j]-1] = num;
                num++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                for (int k = 0; k < m; k++) {
                    if(tmp[k][i] >= tmp[k][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();;
        int m = kb.nextInt();
        int[][] arr = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n, m, arr));
    }
}
