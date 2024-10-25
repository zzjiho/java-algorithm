package string.문자열_압축;

import java.util.Scanner;

// KKHSSSSSSSE
public class Main {

    public String solution(String s) {
        String answer = "";
        s = s + " "; // 마지막 문자와 다음 문자 " " 를 비교해서 else 블록으로 떨구기 위해 공백 추가
        int cnt = 1;

        for (int i = 0; i < s.length()-1; i++) { // i = 1
            if (s.charAt(i) == s.charAt(i + 1)) {  // K == K
                cnt++;
            } else { // k == H
                answer += s.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                }
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(T.solution(a));
    }
}
