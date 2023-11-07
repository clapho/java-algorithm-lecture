package Ch5_Stack_Queue.Q_8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    static class Person {
        public int id;
        public int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }

    public int solution(int n, int m, int[] arr) {
        int answer = 0;

        Queue<Person> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            q.offer(new Person(i, arr[i]));
        }

        while (!q.isEmpty()) {

            boolean isMax = true;

            Person p = q.poll();
            for (Person a : q) {
                if(a.priority > p.priority) {
                    isMax = false;
                    break;
                }
            }

            if(isMax) {
                if(p.id == m) {
                    answer++;
                    break;
                }
                answer++;
            }
            else q.offer(p);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        kb.nextLine();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, m, arr));
    }
}
