package Ch6_Sorting_Searching.Q_5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public String solution(int n, int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr) {
            set.add(x);
        }

        if(set.size() != arr.length) return "D";
        else return "U";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(T.solution(n, arr));
    }
}
