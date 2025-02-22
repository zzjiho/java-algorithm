package dfsbfs.수열_추측하기;

import java.util.Scanner;

// 1. 순열 구하기
// 2. 이항 계수 구하기
// 1번과 2번 곱해서 더한 값이 F 랑 같냐 ? 같으면 순열 return
public class Main {

    static int[] b, p, ch; // b:콤비네이션 값 저장, p:순열 저장, ch:순열 체크 배열
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35]; // 메모이제이션

    // 이항 계수 구하기
    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n==r || r==0){
            return 1;
        } else {
            return dy[n][r] = combi(n-1, r-1) + combi(n-1, r); // 파스칼 삼각형 공식
        }
    }

    public void DFS(int L, int sum) { // D(0,0)
        if (flag) return;
        if (L == n) {
            if (sum == f) {
                for (int x : p) System.out.print(x + " ");
                flag = true;
            }
        } else {
            for (int i = 1; i <= n; i++) { // 여기선 i자체를 순열로 봐라
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i;
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 4
        f = sc.nextInt(); // 16
        b = new int[n]; // 콤비 값 저장
        p = new int[n]; // 순열 저장
        ch = new int[n + 1]; // 1부터 n까지의 숫자가 돌아야 하니깐 체크배열도 1부터 사용해야해서 n+1로 만듬
        for (int i = 0; i < n; i++) {
            b[i] = T.combi(n-1, i); // 이항 계수를 미리 계산하여 저장한다.
        }
        T.DFS(0, 0);
    }
}
// 4 16