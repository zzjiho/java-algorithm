package array.보이는_학생;

import java.util.Scanner;

//8
//130 135 148 140 145 150 150 153
public class Main {

    public int solution(int n, int[] ar) {
        int max = ar[0];
        int cnt = 1; // 맨 앞에 학생은 무조건 보임

        // ar 배열에서 max 보다 큰 애들만 cnt++ 될 수 있음
        for (int i = 1; i < n; i++) {
            if (max < ar[i]) {
                cnt++;
                max = ar[i];
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, ar));
    }
}
