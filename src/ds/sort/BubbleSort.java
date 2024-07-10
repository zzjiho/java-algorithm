package ds.sort;

import java.util.Scanner;

public class BubbleSort {

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) { // n-1인 이유는 마지막은 비교할 대상이 없기 때문
            for (int j = 0; j < n - i - 1; j++) { // 이미 정렬된 것은 비교할 필요가 없기 때문에 -i
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort T = new BubbleSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.println(x + " ");

        }
    }
}

//6
//13 5 11 7 23 15
