package array.등수_구하기;

import java.util.Scanner;

public class Main {

    public int[] solution(int n, int[] ar) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int rank = 1;
            for (int j = 0; j < n; j++) {
                if (ar[i] < ar[j]) { //87 < 87 89 92 100
                    rank++;
                }
            }
            answer[i] = rank;
        }
        return answer;
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
