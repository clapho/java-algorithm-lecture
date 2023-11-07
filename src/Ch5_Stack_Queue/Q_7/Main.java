package Ch5_Stack_Queue.Q_7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public String solution(String essential, String order) {

        ArrayList<String> list = new ArrayList<>();

        String[] essentialOrder = essential.split("");
        String[] subjectOrder = order.split("");

        for (String str : subjectOrder) {
            for (String s : essentialOrder) {
                if(str.equals(s)) {
                    list.add(str);
                    break;
                }
            }
        }

        String answer = "";
        for (String alp : list) {
            answer += alp;
        }
        if(answer.equals(essential)) return "YES";
        else return "NO";
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String essential = kb.next();
        String order = kb.next();

        System.out.println(T.solution(essential, order));
    }
}
