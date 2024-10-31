package dfsbfs.토마토_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;
    static int m, n;
    static Queue<Point> Q = new LinkedList<>();

    public void BFS() {
        while (!Q.isEmpty()) {
            Point tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    // 익지않은 토마토(0) 를 익은 토마토(1) 로 변경
                    board[nx][ny] = 1;
                    // 해당 위치를 큐에 추가
                    Q.offer(new Point(nx, ny));
                    // 날짜설정 (이전 위치의 날짜 + 1)
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt(); // 6
        n = sc.nextInt(); // 4
        board = new int[n][m];
        dis = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
                // 초기상태 설정 : 익은 토마토(1) 의 위치를 모두 찾아 큐에 저장, BFS의 시작점이 된다.
                if (board[i][j] == 1) {
                    Q.offer(new Point(i, j));
                }
            }
        }
        T.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;

        // 모든 토마토가 익었는지 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    flag = false;
                }
            }
        }

        // 날짜 최대값 찾기
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}
