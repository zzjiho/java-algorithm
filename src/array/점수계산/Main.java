package array.점수계산;

import java.util.Scanner;

// 10
// 1 0 1 1 1 0 0 1 1 0
public class Main {
    public int solution(int n, int[] ar) {
        int answer = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (ar[i] == 1) {
                cnt++;
                answer += cnt;
            } else {
                cnt = 0;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, ar));
    }
}
