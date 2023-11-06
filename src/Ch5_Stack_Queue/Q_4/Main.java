package Ch5_Stack_Queue.Q_4;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(String str) {
        Stack<String> stack = new Stack<>();
        String[] s = str.split("");

        for (int i = 0; i < s.length; i++) {
            int oper1 = 0;
            int oper2 = 0;
            if(s[i].equals("*")) {
                oper2 = Integer.parseInt(stack.pop());
                oper1 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(oper1 * oper2));
            } else if(s[i].equals("/")) {
                oper2 = Integer.parseInt(stack.pop());
                oper1 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(oper1 / oper2));
            } else if(s[i].equals("+")) {
                oper2 = Integer.parseInt(stack.pop());
                oper1 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(oper1 + oper2));
            } else if(s[i].equals("-")) {
                oper2 = Integer.parseInt(stack.pop());
                oper1 = Integer.parseInt(stack.pop());
                stack.push(String.valueOf(oper1 - oper2));
            } else {
                stack.push(s[i]);
            }
        }

        return Integer.parseInt(stack.get(0));
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
