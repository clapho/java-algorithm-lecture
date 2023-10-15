package Ch4_HashMap_TreeSet.Q_1;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public String solution(int n, String s) {
        Map<String, Integer> hashMap = new HashMap<>();

        String[] arr = s.split("");

        for (String alp : arr) {
            if(hashMap.containsKey(alp)) {
                hashMap.put(alp, hashMap.get(alp)+1);
            }else {
                hashMap.put(alp, 1);
            }
        }

        String answer = hashMap.keySet().stream()
                .max(Comparator.comparing(hashMap::get))
                .orElse(null);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String s = kb.next();
        System.out.println(T.solution(n, s));
    }
}
