package ds.stackqueue;

import java.util.Scanner;
import java.util.Stack;

//후위식 연산
public class Postfix {

    // stack에 숫자 전부 push
    // 숫자 아닌것을 만나면 stack에서 pop해서 lt rt로 선언
    // lt rt 계산 후 stack에 다시 push
    public int solution(String str) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                stack.push(x-48);
            } else {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') {
                    stack.push(lt + rt);
                } else if (x == '-') {
                    stack.push(lt - rt);
                } else if (x == '*') {
                    stack.push(lt * rt);
                } else if (x == '/') {
                    stack.push(lt / rt);
                }
            }
        }
        answer = stack.get(0);
        return answer;
    }


    public static void main(String[] args) {
        Postfix T = new Postfix();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

}
// 352+*9-