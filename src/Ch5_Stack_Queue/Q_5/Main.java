package Ch5_Stack_Queue.Q_5;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(String str) {
        int answer = 0;
        Stack<String> stack = new Stack<>();
        String[] s = str.split("");

        int line = 0;
        for (int i = 0; i < s.length; i++) {
            if(s[i].equals("(")) {
                stack.push(s[i]);
                line++;
            } else if(s[i].equals(")")) {
                line--;
                if(s[i - 1].equals("(")) {
                    answer += line;
                    stack.pop();
                } else {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        System.out.println(T.solution(input));
    }
}
