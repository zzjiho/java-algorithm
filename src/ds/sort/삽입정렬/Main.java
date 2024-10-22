package ds.sort.삽입정렬;

import java.util.Scanner;

// 6
// 13 5 11 7 23 15
public class Main {
    public int[] solution(int n, int[] ar) {
        for (int i = 1; i < n; i++) {
            int tmp = ar[i]; // 배열에서 하나 선택
            int j;
            for (j = i - 1; j >= 0; j--) { // 이전 요소와 비교
                if (ar[j] > tmp) {
                    ar[j+1] = ar[j]; // for문을 계속 돌면서 한 칸씩 뒤로 밀어주기
                } else {
                    break;
                }
            }
            ar[j + 1] = tmp;
        }
        return ar;
    }

    public static void main(String[] args) {
        Main T = new Main();
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

