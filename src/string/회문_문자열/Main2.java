package string.회문_문자열;

import java.util.Scanner;

// gooG
public class Main2 {
    public String solution(String str) {
        String answer = "NO";
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(tmp)) {
            answer = "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(T.solution(a));
    }
}
