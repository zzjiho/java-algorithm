package array.봉우리;

import java.util.Scanner;

public class Main {

    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, -1, 0, 1};

    public int solution(int n, int[][] ar) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true; // 일단 전부 true로 만듬
                for (int k = 0; k < 4; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];
                    if (x >= 0 && x < n && y >= 0 && y < n && ar[x][y] >= ar[i][j]) { // 봉우리 조건
                        flag = false; // 봉우리 아닌것은 false로
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
// 5
// 5 3 7 2 3
// 3 7 1 6 1
// 7 2 5 3 4
// 4 3 6 4 1
// 8 7 3 5 2