package Ch3_Two_Pointers.Q_5;

import java.util.Scanner;

public class Sol2 {

    public int solution(int n) {
        int answer = 0, cnt = 1;
        n--;
        while (n > 0) {
            cnt++;
            n = n - cnt;
            if(n % cnt == 0) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Sol2 T = new Sol2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
