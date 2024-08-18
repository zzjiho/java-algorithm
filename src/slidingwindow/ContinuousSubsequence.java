package slidingwindow;

import java.util.Scanner;
// 연속된 부분수열
public class ContinuousSubsequence {

    public int solution(int n, int m, int[] ar) {
        int answer=0,  lt=0, sum = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += ar[rt];
            if (sum == m) {
                answer++;
            }
            while (sum >= m) {
                sum -= ar[lt++];
                if (sum == m) {
                    answer++;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ContinuousSubsequence T = new ContinuousSubsequence();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, ar));
    }
}
// 8 6
// 1 2 1 3 1 1 1 2
