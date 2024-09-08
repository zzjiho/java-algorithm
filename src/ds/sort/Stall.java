package ds.sort;

import java.util.Arrays;
import java.util.Scanner;
// 마구간 정하기
// 5 3
// 1 2 8 4 9
public class Stall {

    // 들어갈 수 있는 말 수 구하는 메소드
    public int count(int[] ar, int mid) {
        int cnt = 1;
        int ep = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if ((ar[i] - ep) >= mid) {
                cnt ++;
                ep = ar[i];
            }
        }
        return cnt;
    }

    public int solution(int n, int c, int[] ar) {
        Arrays.sort(ar);
        int answer = 0;
        int lt = 1, rt = ar[n - 1]; // 1,9
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (count(ar, mid) >= c) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Stall T = new Stall();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, c, ar));
    }
}
