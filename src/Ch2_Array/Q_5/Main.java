/*
5. 소수(에라토스테네스 체)

        설명

        자연수 N이 입력되면 1부터 N까지의 소수의 개수를 출력하는 프로그램을 작성하세요.

        만약 20이 입력되면 1부터 20까지의 소수는 2, 3, 5, 7, 11, 13, 17, 19로 총 8개입니다.

        입력
        첫 줄에 자연수의 개수 N(2<=N<=200,000)이 주어집니다.

        출력
        첫 줄에 소수의 개수를 출력합니다.
 */

package Ch2_Array.Q_5;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    int count = 0;

    public int solution(int n) {
        boolean[] answer = new boolean[n+1];
        Arrays.fill(answer, true);

        answer[0] = false;
        answer[1] = false;

        for(int i = 2; i*i <= n; i++) {
            if(answer[i]) {
                for(int j = i*i; j <= n; j+=i) {
                    answer[j] = false;
                }
            }
        }

        for (boolean b : answer) {
            if(b) count++;
        }

        return count;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        System.out.println(T.solution(n));
    }
}
