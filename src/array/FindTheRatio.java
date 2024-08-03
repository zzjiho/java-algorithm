package array;

import java.util.Scanner;

//등수 구하기
public class FindTheRatio {

    // 점수값 배열
    // 등수 배열
    // 2중 포문 돌면서
    // 점수값 배열 돌면서 자기보다 큰 값 있으면 등수배열에 cnt+1
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    cnt++;
                }
            }
            answer[i] = cnt;
        }

        return answer;
    }

    public static void main(String[] args) {
        FindTheRatio T = new FindTheRatio();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.println(x+" ");
        }

    }
}
//5
//87 89 92 100 76
