package ds.sort;

import java.util.Scanner;

public class SelectionSort {

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n - 1; i++) { //마지막은 비교할 필요없음
            int idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) {
                    idx = j; //가장 작은 값의 인덱스를 저장
                }
            }
            //찾은 가장 작은 값과 현재 위치의 값을 교환
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort T = new SelectionSort();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x+" ");
        }
    }
}

//6
//13 5 11 7 23 15