package dfsbfs.중복순열_구하기;

import java.util.Scanner;

// 중복순열 구하기
// 1부터 N까지 중복을 허락하여 M번을 뽑아 일렬로 나열
// 여태 이진트리였는데, 이거는 여러가닥이 뽑아나간다.
public class Main {

    static int[] pm;
    static int n, m;

    public void DFS(int L) {
        if (L==m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else { // DFS(1)의 모든 반복이 끝나면, 다시 22라인의 DFS(0)으로 돌아와서 for문을 돌아 i = 2로 증가한 상태에서 반복이 다시 시작
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }

        }

    }


    public static void main(String[] args){
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        n=kb.nextInt(); // 3
        m=kb.nextInt(); // 2
        pm=new int[m];
        T.DFS(0);
    }
}

// 3 2

