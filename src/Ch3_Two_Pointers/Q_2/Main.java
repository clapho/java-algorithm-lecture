package Ch3_Two_Pointers.Q_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> solution(int n, int m, List<Integer> list1, List<Integer> list2) {

        List<Integer> answer = new ArrayList<>();
        int i = 0;
        int j = 0;
        int prev = 0;

        while (i < n) {
            if(j >= m || list2.get(j) > list1.get(i)) {
                j = prev;
                i++;
                continue;
            }
            if(list1.get(i).equals(list2.get(j))){
                answer.add(list1.get(i));
                i++;
                prev = ++j;
            }else {
                j++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        List<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list1.add(kb.nextInt());
        }

        int m = kb.nextInt();
        List<Integer> list2 = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            list2.add(kb.nextInt());
        }

        Collections.sort(list1);
        Collections.sort(list2);

        for (int x : T.solution(n, m, list1, list2)) {
            System.out.print(x + " ");
        }
    }
}
