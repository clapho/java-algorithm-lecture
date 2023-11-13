package Ch6_Sorting_Searching.Q_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> solution(int n, int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n - 1; i++) {
            if(arr[i] > arr[i + 1]) answer.add(i+1);
        }

        if(answer.size() == 2) {
            answer.set(1, answer.get(1) + 1);
        } else {
            answer.add(answer.get(0) + 1);
        }

        for (int i = 0; i < n-1; i++) {
            if(arr[i] == arr[answer.get(0)-1]) {
                answer.set(0, i + 1);
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
