/*
1. 큰 수 출력하기

        설명

        N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.

        (첫 번째 수는 무조건 출력한다)

        입력
        첫 줄에 자연수 N(1<=N<=100)이 주어지고, 그 다음 줄에 N개의 정수가 입력된다.

        출력
        자신의 바로 앞 수보다 큰 수만 한 줄로 출력한다.
*/




package Ch2_Array.Q_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        int prev = 0;
        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {

            if(arr[i] > arr[i-1]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            int n = kb.nextInt();
            arr[i] = n;
        }

        for(int number : T.solution(arr)) {
            System.out.print(number + " ");
        }
    }
}
