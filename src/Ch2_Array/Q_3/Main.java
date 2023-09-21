/*
3. 가위 바위 보

        설명

        A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.

        가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.

        두 사람의 각 회의 가위, 바위, 보 정보가 주어지면 각 회를 누가 이겼는지 출력하는 프로그램을 작성하세요.

        입력
        첫 번째 줄에 게임 횟수인 자연수 N(1<=N<=100)이 주어집니다.

        두 번째 줄에는 A가 낸 가위, 바위, 보 정보가 N개 주어집니다.

        세 번째 줄에는 B가 낸 가위, 바위, 보 정보가 N개 주어집니다.

        출력
        각 줄에 각 회의 승자를 출력합니다. 비겼을 경우는 D를 출력합니다.
 */

package Ch2_Array.Q_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public String[] solution(int n, int[] a, int[] b) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            if(a[i] == b[i]) answer[i] = "D";
            else if(a[i] == 1 && b[i] == 3) answer[i] = "A";
            else if(b[i] == 1 && a[i] == 3) answer[i] = "B";
            else if(a[i] > b[i]) answer[i] = "A";
            else if(a[i] < b[i]) answer[i] = "B";
        }

        return answer;
    }

    public static void main(String[] args) {

        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        kb.nextLine();
        int[] a = Arrays.stream(kb.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] b = Arrays.stream(kb.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < n; i++) {
            System.out.println(T.solution(n, a, b)[i]);
        }
    }
}
