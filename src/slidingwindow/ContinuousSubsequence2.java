package slidingwindow;

import java.util.Scanner;

// 최대 길이 연속된 부분수열
public class ContinuousSubsequence2 {
    public int solution(int n, int k, int[] ar) {
        int answer = 0, cnt = 0, lt = 0;

        for (int rt = 0; rt < n; rt++) {
            if (ar[rt] == 0) {
                cnt++;
            }
            while (cnt > k) {
                if (ar[lt] == 0) {
                    cnt--;
                }
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        ContinuousSubsequence2 T = new ContinuousSubsequence2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, k, ar));
    }

}
// 14 2
// 1 1 0 0 1 1 0 1 1 0 1 1 0 1
