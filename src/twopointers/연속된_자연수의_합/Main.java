package twopointers.연속된_자연수의_합;

import java.util.*;

class Main {
    public int solution(int n) {
        int answer = 0, sum = 0;
        int m = n / 2 + 1;
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }
        int lt = 0;
        for (int rt = 0; rt < m; rt++) { // 8
            sum += arr[rt];
            if (sum == n) {
                answer++;
            }
            while (sum >= n) {
                sum -= arr[lt++];
                if (sum == n) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.print(T.solution(n));
    }
}
// 15
