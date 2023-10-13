package Ch3_Two_Pointers.Q_4;

import java.util.Scanner;

public class Main {

    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        int sum = 0;
        int prev = 0;

        int i = 0;
        while(i < n) {
            if(sum == m) {
                answer++;
                sum -= arr[prev];
                prev++;
            } else if(sum > m) {
                sum -= arr[prev];
                prev++;
            } else {
                sum += arr[i];
                if(i == n-1 && sum == m) {
                    answer++;
                }
                i++;
            }
        }

        return answer;
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
