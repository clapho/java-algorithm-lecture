package Ch3_Two_Pointers.Q_3;

import java.util.Scanner;

public class Main {

    public int sum(int idx, int m, int[] arr) {

        int sum = 0;
        for (int i = idx - m + 1; i <= idx; i++) {
            sum += arr[i];
        }

        return sum;
    }
    public int solution(int n, int m, int[] arr) {

        int max = 0;
        for (int i = 0; i < m; i++) {
           max += arr[i];
        }

        int sum = max;
        for (int i = m; i < n; i++) {
//            if(arr[i] < arr[i - m]) continue;

//            int sum = sum(i, m, arr);
            sum = sum + arr[i] - arr[i-m];
            if(sum > max) max = sum;
        }

        return max;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, m, arr));
    }
}
