package twopointers.공통원소_구하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int m, int[] ar1, int[] ar2) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (ar1[p1] == ar2[p2]) {
                answer.add(ar1[p1++]);
                p2++;
            } else if (ar1[p1] < ar2[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar1 = new int[n];
        for (int i = 0; i < n; i++) {
            ar1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] ar2 = new int[m];
        for (int i = 0; i < m; i++) {
            ar2[i] = sc.nextInt();
        }

        for (int x : T.solution(n, m, ar1, ar2)) {
            System.out.print(x + " ");
        }
    }

}
// 5
// 1 3 9 5 2
// 5
// 3 2 5 7 8