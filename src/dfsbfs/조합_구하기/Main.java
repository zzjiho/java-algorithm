package dfsbfs.조합_구하기;

import java.util.Scanner;

// 조합은 응용해서 많이쓰이니 이해 후, 그냥 외우기
public class Main {
    static int[] combi;
    static int n, m;

    public void DFS(int L, int s) { // 4 2
        if (L == m) { // 조합 완성
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = s; i <= n; i++) {
                combi[L] = i;
                DFS(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 4
        m = sc.nextInt(); // 2
        combi = new int[m];
        T.DFS(0, 1);
    }

}
