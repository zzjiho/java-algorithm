package dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 송아지 찾기 (BFS)
public class FindTheCalf1 {

    int answer = 0;
    int[] dis = {1, -1, 5};
    int[] ch;
    Queue<Integer> Q = new LinkedList<>();

    public int BFS(int s, int e) { // 5, 14
        ch = new int[10001]; // 좌표
        ch[s] = 1;
        Q.offer(s);
        int L = 0; // 레벨 값 처음에 0
        while (!Q.isEmpty()) {
            int len = Q.size(); // 레벨에 있는 원소 개수
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j]; // 자식노드
                    if (nx == e) {
                        return L+1; // x까지 가는 최소 이동 횟수가 L , L은 현재 탐색 중인 레벨을 나타내고, 그 레벨에서 목표 지점에 도달한 것은 아직 이동을 완료한 것이 아니기 때문에, 그 순간의 이동까지 합쳐서 L + 1번의 이동이 필요
                    }
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) { // 좌표 범위 안에 있고 방문하지 않았다면
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++; // 레벨 증가
        }
        return 0;
    }

    public static void main(String[] args) {
        FindTheCalf1 T = new FindTheCalf1();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(T.BFS(s, e));
    }

}
