package dfsbfs.미로탐색_BFS;

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
    public void BFS(int x, int y) {
        Queue<Point> Q = new LinkedList<>();

    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        T.BFS(1, 1);
        if (dis[7][7] == 0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[7][7]);
        }

    }
}
