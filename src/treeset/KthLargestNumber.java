package treeset;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

// k번째 가장 큰 수 구하기
public class KthLargestNumber {

    public int solution(int[] ar, int n, int k) {
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(ar[i] + ar[j] + ar[l]);
                }
            }
        }
        int cnt = 0;
        for (int x : Tset) {
            cnt++;
            if (cnt == k) {
                return x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        KthLargestNumber T = new KthLargestNumber();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.solution(ar, n, k));
    }
}
// 10 3
// 13 15 34 23 45 65 33 11 26 42

// 143