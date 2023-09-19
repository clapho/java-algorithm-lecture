package Ch1_String.Q_9;

import java.util.Scanner;

public class Sol {

    public int solution(String s) {
        int answer = 0;
        for (char x : s.toCharArray()) {
            if(x >= 48 && x <= 57) answer = answer * 10 + (x-48);
        }

        return answer;
    }
    public static void main(String[] args) {

        Sol T = new Sol();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
