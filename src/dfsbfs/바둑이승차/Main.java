package dfsbfs.바둑이승차;

import java.util.Scanner;
// 내 코드
public class Main {

    static int c, n;
    static int answer = Integer.MIN_VALUE;

    public int DFS(int L, int sum, int[] ar) {
        if (sum < c) {
            if (sum > answer) {
                answer = sum;
            }
        }

        if (L == n) {
            return answer;
        } else {
            DFS(L + 1, sum + ar[L], ar);
            DFS(L + 1, sum, ar);
        }
        return answer;
    }

    public static void main(String[] args){
        Main T = new Main();
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