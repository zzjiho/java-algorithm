package ds;

import java.util.Scanner;
import java.util.Stack;

//Q.11 스택으로 오름차순 수열 만들기
public class AscendingSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();
        int num = 1; // 오름차순 수
        boolean result = true;

        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < A.length; i++) {
            int su = A[i]; // 현재 수열의 수
            if (su >= num) { // 현재 수열 값 >= 오름차순 자연수 ( 값이 같아질 때까지 push())
                while (su >= num) {
                    stack.push(num++);
                    bf.append("+\n");
                }
                stack.pop();
                bf.append("-\n");
            } else {
                int n = stack.pop();
                if (n > su) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    bf.append("-\n");
                }
            }
        }
        if (result) System.out.println(bf.toString());
    }
}

// 8
// 4
// 3
// 6
// 8
// 7
// 5
// 2
// 1

