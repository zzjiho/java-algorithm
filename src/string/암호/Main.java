package string.암호;

import java.util.Scanner;

// 4
// #****###**#####**#####**##**
class Main {
    // s를 7글자씩 나눈다. (substring)
    // #는 1로, *는 0으로 replace 해준다. (replace)
    // replace한것을 10진수로 바꿔준다. (2진수 -> 10진수)
    // 10진수로 바꾼것을 문자로 바꿔준다 (아스키코드 -> 문자)
    public String solution(int n, String s) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0'); // replace 함수는 연쇄적 사용 가능
            int num = Integer.parseInt(tmp, 2); // tmp를 2진수 -> 10진수로 변환
            answer += (char) num; // num을 아스키 코드 -> 문자 변환
            s = s.substring(7); // (7 부터 문자열 끝까지 반환)
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }
}