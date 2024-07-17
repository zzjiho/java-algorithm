package ds.stackqueue;

import java.util.Scanner;
import java.util.Stack;

//쇠막대기
public class IronBar {

    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push('('); // '('는 다 push
            } else {
                stack.pop(); // ')' 이면 레이저, 막대기의 마지막 이던간에 pop 해야함
                if (str.charAt(i-1) == '(') { // ')' 바로 앞에 '('이면 레이저를 의미
                    answer += stack.size(); // 레이저로 자르면 stack size만큼 쇠막대기가 생김
                } else {
                    answer += 1; // 막대기의 끝이므로 +1
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        IronBar T = new IronBar();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }



}
