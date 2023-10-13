package Ch3_Two_Pointers.Q_6;

import java.util.Scanner;

public class Main {

    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int lt = 0;
        int count = k;

        for (int rt = 0; rt < n; rt++) {
            if(arr[rt] == 0) count--;
            while(count < 0) {
                if(arr[lt] == 0) count++;
                lt++;
            }
            answer = Math.max(rt - lt + 1, answer);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, k, arr));
    }
}
