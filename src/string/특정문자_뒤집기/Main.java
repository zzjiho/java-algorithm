package string.특정문자_뒤집기;

import java.util.Scanner;

// a#b!GE*T@S
public class Main {

    public String solution(String str) {
        String answer;
        char[] s = str.toCharArray(); // 인덱스를 사용해 개별 문자에 직접 접근하기 위해 char[] 배열 생성
        int lt = 0, rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) { // 알파벳이 아니면
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(s); // 문자 배열 s를 문자열로 변환하여 answer에 저장
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(T.solution(a));
    }
}
