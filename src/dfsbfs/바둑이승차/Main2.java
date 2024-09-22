package dfsbfs.바둑이승차;

import java.util.Scanner;
// 답
public class Main2 {

    static int c, n;
    static int answer = Integer.MIN_VALUE;

    public void DFS(int L, int sum, int[] ar) {
        if (sum > c) return;
        if (L == n) {
            answer = Math.max(sum, answer);
        } else {
            DFS(L + 1, sum + ar[L], ar);
            DFS(L + 1, sum, ar);
        }
    }

    public static void main(String[] args){
        Main2 T = new Main2();
        Scanner kb = new Scanner(System.in);
        c=kb.nextInt();
        n=kb.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=kb.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
// 259 5
// 81
// 58
// 42
// 33
// 61
