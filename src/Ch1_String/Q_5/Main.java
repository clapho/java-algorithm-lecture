/*
5. 특정 문자 뒤집기

    설명

    영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고,

    특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.

    입력
    첫 줄에 길이가 100을 넘지 않는 문자열이 주어집니다.

    출력
    첫 줄에 알파벳만 뒤집힌 문자열을 출력합니다.
 */

package Ch1_String.Q_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();

        List<Integer> indexList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                indexList.add(i);
            }
        }

        String[] arr = str.split("");

        for(int i = 0; i < indexList.size()/2; i++) {
            String temp = arr[indexList.get(i)];
            arr[indexList.get(i)] = arr[indexList.get(indexList.size() - 1 - i)];
            arr[indexList.get(indexList.size() - 1 - i)] = temp;
        }

        String answer = String.join("", arr);

        System.out.println(answer);

    }
}
