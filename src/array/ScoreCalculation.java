package array;

import java.util.Scanner;

//점수계산
public class ScoreCalculation {

    public int solution(int n, int[] arr) {
        int cnt = 0;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                sum += cnt;
            } else {
                cnt = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ScoreCalculation T = new ScoreCalculation();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
// 10
// 1 0 1 1 1 0 0 1 1 0