package ds.sort.이진탐색;

import java.util.Arrays;
import java.util.Scanner;

// 8 32
// 23 87 65 12 57 32 99 81
public class Main {
    public int solution(int n, int m, int[] ar) {
        Arrays.sort(ar);
        int answer = 0;
        int lt = 0, rt = n-1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2; //중간 인덱스 구하기
            if (ar[mid] == m) { // 탐색 완료시
                answer = mid+1;
                break;
            }
            if (ar[mid] > m) {
                rt = mid-1; // 중간값이 찾는 값보다 크면 찾고자 하는 요소는 배열 왼쪽에 있으므로 오른쪽 범위를 줄여야함
            } else if (ar[mid] < m) {
                lt = mid+1; // 중간값이 찾는 값보다 작으면 찾고자 하는 요소는 배열 오른쪽에 있으므로 왼쪽 범위를 줄여야함
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}
