package Ch6_Sorting_Searching.Q_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public int solution(int n, int m, List<Integer> list) {

        int answer = 0;
        Collections.sort(list);

        for (int i = 0; i < n; i++) {
            if(list.get(i) == m) answer = i + 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(kb.nextInt());
        }

        System.out.println(T.solution(n, m, list));
    }
}
