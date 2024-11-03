package dfsbfs.피자_배달거리;

import java.util.ArrayList;
import java.util.Scanner;

class Point {
    public int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {

    static int n, m, len, answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point> hs, pz;

    public void DFS(int L, int s) {
        if (L == m) {
            int sum = 0;
            for (Point h : hs) { // 집 하나 결정
                // 최소 피자배달거리 구하기 시작
                int dis = Integer.MAX_VALUE;
                for (int i : combi) { // 살아남은 피자집이랑 비교
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y)); // 맨해튼 거리 계산
                }
                sum += dis;
            }
            // 도시의 최소 피자 배달거리 구하기
            answer = Math.min(answer, sum);
        } else {
            for (int i = s; i < len; i++) {
                combi[L] = i; // combi에 들어가는 값을 arrayList 인덱스 번호로 사용한다.
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt(); // 살려야 하는 피자집
        hs = new ArrayList<>();
        pz = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = sc.nextInt(); // 도시 정보 읽기 (피자집, 집)
                if (tmp == 1) {
                    hs.add(new Point(i, j));
                } else if (tmp == 2) {
                    pz.add(new Point(i, j));
                }
            }
        }
        len = pz.size(); // 피자집 개수
        combi = new int[m];
        T.DFS(0, 0);
        System.out.println(answer);
    }
}
// 4 4
// 0 1 2 0
// 1 0 2 1
// 0 2 1 2
// 2 0 1 2