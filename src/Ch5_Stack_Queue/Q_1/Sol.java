package Ch5_Stack_Queue.Q_1;

import java.util.Scanner;
import java.util.Stack;

public class Sol {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if(x == '(') stack.push(x);
            else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return "NO";
        return answer;
    }

    public static void main(String[] args) {
        Sol T = new Sol();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
