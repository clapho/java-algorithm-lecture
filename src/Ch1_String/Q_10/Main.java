/*
10. 가장 짧은 문자거리

        설명

        한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

        입력
        첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어집니다.

        문자열의 길이는 100을 넘지 않는다.

        출력
        첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
 */


package Ch1_String.Q_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<Integer> solution(String str, char alp) {

        List<Integer> answer = new ArrayList<>();
        List<Integer> idxList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == alp) {
                idxList.add(i);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            int min = str.length()+1;

            for (int index : idxList) {
                if(i == index) {
                    min = 0;
                    break;
                }

                if(Math.abs(i - index) < min) {
                    min = Math.abs(i - index);
                }
            }

            answer.add(min);
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String input = kb.nextLine();
        String[] arr = input.split(" ");
        String str = arr[0];
        char alp = arr[1].charAt(0);

        List<Integer> answer = T.solution(str, alp);

        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}
