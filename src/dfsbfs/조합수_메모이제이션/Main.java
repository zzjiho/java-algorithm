package dfsbfs.조합수_메모이제이션;

import java.util.Scanner;
// 5 3
public class Main {
    int[][] dy = new int[35][35]; // 35까지의 조합수를 구하기 위함

    public int DFS(int n, int r) {
        // 현재 n과 r 값을 출력하여 재귀 호출을 추적합니다.
        System.out.println("DFS called with n = " + n + ", r = " + r);

        if (dy[n][r] > 0) { // 메모이제이션된 값이 있을 경우
            System.out.println("Returning memoized value dy[" + n + "][" + r + "] = " + dy[n][r]);
            return dy[n][r];
        }
        if (n == r || r == 0) { // 기저 조건
            System.out.println("Base case met at n = " + n + ", r = " + r + " => return 1");
            return 1;
        } else {
            dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
            System.out.println("Computed dy[" + n + "][" + r + "] = " + dy[n][r]);
            return dy[n][r];
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n,r));
    }
}
