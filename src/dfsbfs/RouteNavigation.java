package dfsbfs;

import java.util.Scanner;

// 정점(vertex) : 위치 (node 라고도 부름)
// 간선(edge) : 위치 간의 관계, 노드를 연결하는 선

// 경로탐색(DFS)
// 1번 정점에서 시작해서 마지막 정점까지 가는 경로의 수를 인접행렬로 찾는 알고리즘
public class RouteNavigation {

    static int n, m;
    static int answer = 0; // 1번 정점에서 n번 정점까지 도달할 수 있는 경로의 수를 저장
    static int[][] graph;
    static int[] ch;

    public void DFS(int v) {
        if (v == n) { // n번 정점에 도착 (하나의 경로를 찾았다는 의미)
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (graph[v][i] == 1 && ch[i] == 0) {
                    ch[i] = 1; // 방문했다고 체크
                    DFS(i); // 다음 정점으로 이동
                    ch[i] = 0; // 다시 원상복구
                }
            }
        }
    }

    public static void main(String[] args){
        RouteNavigation T = new RouteNavigation();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt(); // 노드개수 5
        m=kb.nextInt(); // 에지개수 9
        graph=new int[n+1][n+1];
        ch=new int[n+1];
        for(int i=0; i<m; i++){
            int a=kb.nextInt();
            int b=kb.nextInt();
            graph[a][b]=1; // graph[a][b]가 1이면 정점 a에서 b로 가는 경로가 있다는 뜻
        }
        ch[1]=1; // ch[i]가 1이면 해당 정점을 이미 방문했다는 뜻
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