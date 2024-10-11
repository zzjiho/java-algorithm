package ds.stackqueue.괄호문자_제거;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (x == ')') {
                while (stack.pop() != '(') ; // '('가 나올때까지 pop을 계속한다는 뜻
            } else {
                stack.push(x);
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            answer += stack.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

}
// (A(BC)D)EF(G(H)(IJ)K)LM(N)
