package string.중복문자_제거;

import java.util.Scanner;

// ksekkset
public class Main {
    public String solution(String a) {
        String answer = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.indexOf(a.charAt(i)) == i) { // indexOf() 는 처음으로 나오는 인덱스를 반환.
                answer += a.charAt(i);
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
