package array.피보나치_수열;

import java.util.Scanner;

// 10
public class Main {

    public int[] solution(int n) {
        int[] ar = new int[n];
        ar[0] = 1;
        ar[1] = 1;

        for (int i = 2; i < n; i++) {
            ar[i] = ar[i - 2] + ar[i - 1];
        }
        return ar;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : T.solution(n)) {
            System.out.print(x + " ");
        }
    }
}
