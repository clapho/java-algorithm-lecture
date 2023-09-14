/*
7. 회문 문자열

        설명

        앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.

        문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.

        단 회문을 검사할 때 대소문자를 구분하지 않습니다.

        입력
        첫 줄에 길이 100을 넘지 않는 공백이 없는 문자열이 주어집니다.

        출력
        첫 번째 줄에 회문 문자열인지의 결과를 YES 또는 NO로 출력합니다.
 */




package Ch1_String.Q_7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String answer = "";

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine().toUpperCase();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.length()-1; i >= 0; i--) {

            char c = str.charAt(i);
            String s = "";

            if(c > 90) {
                s = String.valueOf(c).toUpperCase();
            }

            s = String.valueOf(c);

            stringBuilder.append(s);
        }

        if(str.equals(stringBuilder.toString())) {
            answer = "YES";
        }else {
            answer = "NO";
        }

        System.out.println(answer);

    }
}
