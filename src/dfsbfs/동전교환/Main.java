package dfsbfs.동전교환;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

// 동전교환
public class Main {
    static int n, m, answer=Integer.MAX_VALUE;

    public void DFS(int L, int sum, Integer[] ar) {
        if (sum > m) return;
        if (L >= answer) return; // 거슬러줄 금액에 도달하여 answer에 최소 동전 수가 들어가있기때문에, 탐색종료
        if (sum == m) { // 거스름돈을 무조건 m 원 받아야 하기 때문에 기저조건을 이렇게 설정해도 된다.
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) {
                DFS(L + 1, sum + ar[i], ar);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
// 3
// 1 2 5
// 15