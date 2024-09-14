package dfsbfs;

import java.util.ArrayList;
import java.util.Scanner;

// 정점(vertex) : 위치 (node 라고도 부름)
// 간선(edge) : 위치 간의 관계, 노드를 연결하는 선

// 경로탐색(DFS)
// 1번 정점에서 시작해서 마지막 정점까지 가는 경로의 수를 인접리스트로 찾는 알고리즘
public class RouteNavigation2 {

    static int n, m;
    static int answer = 0; // 1번 정점에서 n번 정점까지 도달할 수 있는 경로의 수를 저장
    static ArrayList<ArrayList<Integer>> graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n) {
            answer++;
        } else {
            for (int nv : graph.get(v)) {  // v번 arraysList. ex) 3번 정점에서 갈 수 있는 정점들
                if (ch[nv] == 0) {
                    ch[nv] = 1;
                    DFS(nv);
                    ch[nv] = 0;
                }
            }
        }
    }

    public static void main(String[] args){
        RouteNavigation2 T = new RouteNavigation2();
        Scanner kb = new Scanner(System.in);
        n = kb.nextInt(); // 5
        m = kb.nextInt(); // 9
        graph = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        ch=new int[n+1];
        for (int i = 0; i < m; i++) {
            int a = kb.nextInt();
            int b = kb.nextInt();
            graph.get(a).add(b); // ex) 1번 정점에서 2번 정점으로 가는 경로가 있다면 graph.get(1).add(2)를 해줌,
        }
        ch[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
// 5 9
// 1 2
// 1 3
// 1 4
// 2 1
// 2 3
// 2 5
// 3 4
// 4 2
// 4 5