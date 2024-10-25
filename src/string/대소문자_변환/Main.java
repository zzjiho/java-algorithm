package string.대소문자_변환;

import java.util.Scanner;

public class Main {

    public String solution(String a) {
        String answer = "";

        for (char x : a.toCharArray()) {
            if (Character.isUpperCase(x)) {
                answer += Character.toLowerCase(x);
            } else {
                answer += Character.toUpperCase(x);
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
