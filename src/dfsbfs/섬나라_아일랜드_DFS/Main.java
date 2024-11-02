package dfsbfs.섬나라_아일랜드_DFS;

import java.util.Scanner;

public class Main {

    static int answer = 0, n;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1}; // 시계방향
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};

    public void DFS(int x, int y, int[][] board) {
        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                board[nx][ny] = 0;
                DFS(nx, ny, board);
            }
        }
    }

    public void solution(int[][] board) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) { //섬 만났을때
                    answer++; // 섬 개수 증가
                    board[i][j] = 0;
                    DFS(i, j, board);
                    // DFS 탐색 후 이 위치로 돌아옴
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] ar = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        T.solution(ar);
        System.out.println(answer);
    }
}
