package array.임시반장_정하기;

import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] ar) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) { // 학생
            int cnt = 0;
            for (int j = 1; j <= n; j++) { // 학생
                for (int k = 1; k <= 5; k++) { // 학년
                    if (ar[i][k] == ar[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n + 1][6];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }

}
// 5
// 2 3 1 7 3
// 4 1 9 6 8
// 5 5 2 4 4
// 6 5 2 6 7
// 8 4 2 2 2