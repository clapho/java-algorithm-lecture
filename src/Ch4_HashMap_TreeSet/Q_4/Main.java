package Ch4_HashMap_TreeSet.Q_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public int solution(String s1, String s2) {
        
        int answer = 0;
        Map<Character, Integer> s1Map = new HashMap<>();
        Map<Character, Integer> s2Map = new HashMap<>();

        // 초기값
        for (int i = 0; i < s2.length(); i++) {
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0) + 1);
            s2Map.put(s2.charAt(i), s2Map.getOrDefault(s2.charAt(i), 0) + 1);
        }

        // 초기값 확인
        boolean check = true;
        for (int i = 0; i < s2.length(); i++) {
            if (!s1Map.containsKey(s2.charAt(i))) {
                check = false;
                break;
            } else {
                  if(!s1Map.get(s2.charAt(i)).equals(s2Map.get(s2.charAt(i)))) {
                      check =false;
                      break;
                  }
            }
        }
        if(check) answer += 1;

        int k = s2.length();
        for (int i = k; i < s1.length(); i++) {
            s1Map.put(s1.charAt(i), s1Map.getOrDefault(s1.charAt(i), 0) + 1);
            s1Map.put(s1.charAt(i - k), s1Map.get(s1.charAt(i - k)) - 1);
            if(s1Map.get(s1.charAt(i - k)) == 0) s1Map.remove(s1.charAt(i - k));

            if(s1Map.equals(s2Map)) answer++;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String s1 = kb.next();
        String s2 = kb.next();

        System.out.println(T.solution(s1, s2));
    }
}
