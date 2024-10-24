package string.숫자만_추출;

import java.util.Scanner;

// tge0a1h205er
public class Main {
    public int solution(String str) {
        String answer = "";
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }
        // Integer.parseInt() : 문자열을 파싱하여 정수로 변환. 앞에 0이 의미가 없으므로 자동으로 제거된다.
        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(T.solution(a));
    }
}
