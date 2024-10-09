package slidingwindow.최대매출;

import java.util.Scanner;

public class Main {

    public int solution(int n, int k, int[] ar) {
        int answer, sum = 0;

        for (int i = 0; i < k; i++) {
            sum += ar[i];
        }
        answer = sum;

        for (int i = k; i < n; i++) {
            sum += (ar[i] - ar[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, k, ar));
    }
}
// 10 3
// 12 15 11 20 25 10 20 19 13 15
