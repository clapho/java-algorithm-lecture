package Ch3_Two_Pointers.Q_5;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[] arr) {
        int answer = 0;
        int sum = 0;
        int prev = 0;

        int i = 0;
        while (i < n) {
            if (sum < n) {
                sum += arr[i];
                i++;
            } else if (sum > n) {
                sum -= arr[prev];
                prev++;
            } else {
                answer++;
                sum -= arr[prev];
                prev++;
            }
        }


        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i+1;
        }

        System.out.println(T.solution(n, arr));
    }
}
