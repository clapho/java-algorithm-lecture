package Ch5_Stack_Queue.Q_7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sol {

    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> q = new LinkedList<>();
        for(char x : need.toCharArray()) q.offer(x);
        for(char x : plan.toCharArray()) {
            if(q.contains(x)) {
                if(x != q.poll()) return "NO";
            }
        }
        if(!q.isEmpty()) return "NO";

        return answer;
    }

    public static void main(String[] args) {
        Sol T = new Sol();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();

        System.out.println(T.solution(a, b));
    }
}
