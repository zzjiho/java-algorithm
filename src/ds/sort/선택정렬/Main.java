package ds.sort.선택정렬;

import java.util.Scanner;

// 6
// 13 5 11 7 23 15
public class Main {
    public int[] solution(int n, int[] ar) {
        for (int i = 0; i < n-1; i++) {
            int idx = i; // 현재위치를 가장 작은 값으로 초기화
            for (int j = i+1; j < n; j++) {
                if (ar[idx] > ar[j]) {
                    idx = j; // 더 작은 값이 있으면 그 값의 인덱스를 저장합니다.
                }
            }
            int tmp = ar[i];
            ar[i] = ar[idx];
            ar[idx] = tmp;
        }
        return ar;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
