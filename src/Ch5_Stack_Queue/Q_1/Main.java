package Ch5_Stack_Queue.Q_1;

import java.util.Scanner;

public class Main {

    public String solution(String s) {
        String[] strArr = s.split("");
        int left = 0;
        int right = 0;
        for (int i = 0; i < strArr.length; i++) {
            if(i == 0 && strArr[i].equals(")")) return "NO";
            if(i == strArr.length-1 && strArr[i].equals("(")) return "NO";

            if(strArr[i].equals("(")) left++;
            else if(strArr[i].equals(")")) right++;
        }

        if(left != right) return "NO";
        else return "YES";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();

        System.out.println(T.solution(s));
    }
}
