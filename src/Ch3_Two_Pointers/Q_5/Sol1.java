package Ch3_Two_Pointers.Q_5;

import java.util.Scanner;

public class Sol1 {

    public int solution(int n) {
        int answer = 0, sum = 0, lt = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) arr[i] = i + 1;

        for (int rt = 0; rt < m; rt++) {
            sum += arr[rt];
            if(sum == n) answer++;
            while (sum >= n) {
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Sol1 T = new Sol1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
