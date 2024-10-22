package ds.sort.중복확인;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // ar[] 요소에 같은 값이 존재하면 D
    // 같은 값이 없으면 U
    public String solution(int n, int[] ar) {
        String answer = "U";
        Arrays.sort(ar);
        for (int i = 0; i < n - 1; i++) {
            if (ar[i] == ar[i + 1]) {
                return "D";
            }
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

        System.out.println(T.solution(n, ar));
    }
}
