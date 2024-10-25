package array.격자판_최대합;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] ar) {
        int max = 0;
        int sum1,sum2;

        for (int i = 0; i < n; i++) {
            sum1 = 0; // 행
            sum2 = 0; // 열
            for (int j = 0; j < n; j++) {
                sum1 += ar[i][j];
                sum2 += ar[j][i];
            }
            max = Math.max(max, sum1); // max와 비교를해야, 이전의 최대합과 비교를 함
            max = Math.max(max, sum2);
        }

        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += ar[i][i];
            sum2 += ar[i][n - i - 1];
        }
        max = Math.max(max, sum1);
        max = Math.max(max, sum2);

        return max;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ar = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, ar));
    }
}
// 5
// 10 13 10 12 15
// 12 39 30 23 11
// 11 25 50 53 15
// 19 27 29 37 27
// 19 13 30 13 19