package Ch6_Sorting_Searching.Q_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> solution(int s, int n, int[] arr) {

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if(answer.contains(arr[i])) {
                Integer value = arr[i];
                answer.remove(value);
                answer.add(value);
            }else {
                if(answer.size() == s) {
                    answer.remove(0);
                }
                answer.add(arr[i]);
            }
        }

        Collections.reverse(answer);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(s, n, arr)) {
            System.out.print(x + " ");
        }
    }
}
