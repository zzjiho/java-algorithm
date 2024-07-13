package ds.stackqueue;

import java.util.Scanner;
import java.util.Stack;

//괄호문자제거
public class RemoveParenthesis {

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for (char x : str.toCharArray()) { // 문자열을 문자 배열로 변환 예를들어 "ABC" -> ['A','B','C'], 변환하는 이유는 문자열을 문자로 하나씩 비교하기 위함
            if (x == ')') {
                while (stack.pop() != '(') ; // != '('가 무슨 뜻이냐면 '('가 나올때까지 pop을 계속한다는 뜻
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
        RemoveParenthesis T = new RemoveParenthesis();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

}

//(A(BC)D)EF(G(H)(IJ)K)LM(N)
