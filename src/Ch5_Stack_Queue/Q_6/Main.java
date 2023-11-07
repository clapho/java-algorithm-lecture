package Ch5_Stack_Queue.Q_6;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(int n, int k) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        for (int i = n; i >= 1 ; i--) {
            stack2.push(i);
        }

        int count = 0;
        while(true) {
            if(stack2.isEmpty()) {
                if(stack1.size() == 1) break;
                int size = stack1.size();
                for (int i = 0; i < size; i++) {
                    stack2.push(stack1.pop());
                }
            }
            count++;
            if(count != k) {
                stack1.push(stack2.pop());
            } else {
                stack2.pop();
                count = 0;
                continue;
            }
        }

        return stack1.get(0);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();

        System.out.println(T.solution(n, k));
    }
}
