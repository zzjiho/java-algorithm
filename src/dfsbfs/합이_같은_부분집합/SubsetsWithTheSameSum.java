package dfsbfs;

import java.util.Scanner;

// 합이 같은 부분집합
public class SubsetsWithTheSameSum {

    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {
        if (flag) { // 이미 찾은 경우 넘어오는 재귀 끝내기
            return;
        }
        if (sum > total / 2) { // 합이 전체 합의 절반을 넘어가면 더이상 탐색할 필요가 없음
            return;
        }
        if (L == n) {
            if ((total - sum) == sum) { // 합이 같은 경우
                answer = "YES";
                flag = true ;
            }

        } else {
            DFS(L + 1, sum + arr[L], arr); // 사용하는경우 레벨 증가(인덱스 증가), 합계 증가
            DFS(L+1, sum, arr);
        }
    }

    public static void main(String[] args) {
        SubsetsWithTheSameSum T = new SubsetsWithTheSameSum();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            total += ar[i];
        }
        T.DFS(0, 0, ar);
        System.out.println(answer);
    }
}
// 6
// 1 3 5 6 7 10