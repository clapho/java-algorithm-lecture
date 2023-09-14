package Ch1_String.Q_7;

import java.util.Scanner;

public class Sol {

    public String solution(String str) {
        String answer = "YES";

        /*

        int len = str.length();
        str = str.toUpperCase();

        for(int i = 0; i < len/2; i++) {

            if(str.charAt(i) != str.charAt(len-1-i)) {
                return "NO";
            }
        }
         */

        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) answer = "NO";

        return answer;
    }

    public static void main(String[] args) {

        Sol T = new Sol();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
