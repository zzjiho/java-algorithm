package dfsbfs.순열_구하기;

import java.util.Scanner;

// 중복없는 순열 구하기
public class Main {

    static int[] pm, ch, ar;
    static int n, m;

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) System.out.print(x+" ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) { // 0이 아니면 이미 사용한 것이므로 넘어간다.
                    ch[i] = 1;
                    pm[L] = ar[i];
                    DFS(L+1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 3
        m = sc.nextInt(); // 2
        ar = new int[n]; // 3 6 9
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        ch = new int[n];
        pm = new int[m];
        T.DFS(0);
    }
}
// 3 2
// 3 6 9

// 3 6
// 3 9
// 6 3
// 6 9