package ds.sort;

import java.util.Scanner;

// 삽입 정렬
public class InsertionSort {

    public int[] solution(int n, int[] ar) {
        for (int i = 1; i < n; i++) {
            int tmp = ar[i], j;
            for (j = i - 1; j >= 0; j--) {
                if (ar[j] > tmp) {
                    ar[j + 1] = ar[j];
                } else {
                    break;
                }
            }
            ar[j + 1] = tmp;
        }
        return ar;
    }

    public static void main(String[] args) {
        InsertionSort T = new InsertionSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        for (int x : T.solution(n, ar)) {
            System.out.print(x + " ");
        }
    }
}
// 6
// 13 5 11 7 23 15