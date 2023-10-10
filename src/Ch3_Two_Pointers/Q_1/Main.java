package Ch3_Two_Pointers.Q_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> solution(int n, int m, int[] arr1, int[] arr2) {

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            answer.add(arr1[i]);
        }
        for (int i = 0; i < m; i++) {
            answer.add(arr2[i]);
        }

        Collections.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }

        for (int x : T.solution(n, m, arr1, arr2)) {
            System.out.print(x + " ");
        }
    }
}
