package Ch5_Stack_Queue.Q_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public List<String> solution(String str) {
        List<String> answer = new ArrayList<>();
        int left = 0;
        int right = 0;

        for (String s : str.split("")) {
            if(s.equals("(")) left++;
            if(s.equals(")")) right++;

            if (left == right && (!s.equals("(")) && (!s.equals(")"))) {
                answer.add(s);
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();

        for (String alp : T.solution(str)) {
            System.out.print(alp);
        }
    }
}
