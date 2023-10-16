package Ch4_HashMap_TreeSet.Q_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public boolean solution(String s1, String s2) {

        Map<String, Integer> hm1 = new HashMap<>();
        Map<String, Integer> hm2 = new HashMap<>();

        String[] arr1 = s1.split("");
        String[] arr2 = s2.split("");

        for (String s : arr1) {
            if (hm1.containsKey(s)) {
                hm1.put(s, hm1.get(s) + 1);
            } else {
                hm1.put(s, 1);
            }
        }

        for (String s : arr2) {
            if (hm2.containsKey(s)) {
                hm2.put(s, hm2.get(s) + 1);
            } else {
                hm2.put(s, 1);
            }
        }

        for (String key : hm1.keySet()) {
            if(!hm2.containsKey(key)) return false;
            if (!hm1.get(key).equals(hm2.get(key))) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s1 = kb.next();
        String s2 = kb.next();

        boolean result = T.solution(s1, s2);

        if (result) System.out.println("YES");
        else System.out.println("NO");
    }
}
