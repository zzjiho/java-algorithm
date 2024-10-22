package ds.sort.버블정렬;

import java.util.Scanner;

// 6
// 13 5 11 7 23 15
public class Main {
    public int[] solution(int n, int[] ar) {
        for (int i = 0; i < n - 1; i++) { // 마지막은 비교대상 없음
            for (int j = 0; j < n - i - 1; j++) { // 이미 정렬된 것은 비교할 필요가 없기 때문에 -i
                if (ar[j] > ar[j + 1]) {
                    int tmp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = tmp;
                }
            }
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