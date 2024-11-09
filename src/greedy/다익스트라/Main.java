package greedy.다익스트라;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge> {
    public int vertex;
    public int cost;

    Edge(int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
    }

    // 우선순위 큐에서 비용이 낮은 간선이 먼저 오도록 설정
    public int compareTo(Edge ob) {
        return this.cost - ob.cost;
    }
}

public class Main {

    static int n, m; // n: 노드의 수, m: 간선의 수
    static ArrayList<ArrayList<Edge>> graph;  // 그래프의 인접 리스트 표현
    static int[] dis; // 시작 노드로부터 각 노드까지의 최단 거리 저장 배열

    public void solution(int v) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v, 0)); // 시작 노드를 큐에 추가
        dis[v] = 0; // 시작 노드의 거리는 0으로 설정
        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll(); // 비용이 가장 작은 간선 선택
            int now = tmp.vertex;
            int nowCost = tmp.cost;
            if (nowCost > dis[now]) {
                continue;
            }
            for (Edge ob : graph.get(now)) {
                if (dis[ob.vertex] > nowCost + ob.cost) {
                    dis[ob.vertex] = nowCost + ob.cost; // 최단 거리 갱신
                    pQ.offer(new Edge(ob.vertex, nowCost + ob.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new ArrayList<ArrayList<Edge>>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>()); // 노드 구성 및 각 노드의 인접리스트 초기화
        }
        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE);  // 최단 거리 배열을 무한대로 초기화
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(); // 출발 노드
            int b = sc.nextInt(); // 도착 노드
            int c = sc.nextInt(); // 비용
            graph.get(a).add(new Edge(b, c)); // 그래프에 간선 추가
        }
        T.solution(1); // 시작 노드를 1로 하여 다익스트라 알고리즘 실행
        for (int i = 2; i <= n; i++) {
            if (dis[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + dis[i]); // 최단 거리 출력
            } else {
                System.out.println(i + " : impossible"); // 도달 불가능한 경우
            }
        }
    }
}
// 6 9
// 1 2 12   // 1번 정점에서 2번정점으로 가는데 12의 비용이 든다.
// 1 3 4
// 2 1 2
// 2 3 5
// 2 5 5
// 3 4 5
// 4 2 2
// 4 5 5
// 6 4 5







