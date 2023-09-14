package Ch1_String.Q_6;

import java.util.Scanner;

public class Sol {

    public String solution(String str) {

        String answer = "";

        for (int i = 0; i < str.length(); i++) {

            if(str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
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
