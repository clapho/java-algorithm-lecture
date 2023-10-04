package Ch2_Array.Q_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr) {

        int result = 0;
        List<Integer> list = new ArrayList<>();

        int widthSum = 0;
        int lengthSum = 0;
        int sameIndexSum = 0;
        int reverseSum = 0;


        //가로, 대각선
        for (int i = 0; i < n; i++) {
            reverseSum += arr[i][Math.abs(n - 1 - i)];

            for (int j = 0; j < n; j++) {
                widthSum += arr[i][j];
                lengthSum += arr[j][i];
                if(i == j) sameIndexSum += arr[i][j];
            }
            list.add(widthSum);
            list.add(lengthSum);
            widthSum = 0;
            lengthSum = 0;
        }
        list.add(sameIndexSum);
        list.add(reverseSum);


        result = Collections.max(list);
        return result;
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

        System.out.println(T.solution(n, arr));
    }
}
