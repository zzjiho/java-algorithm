package twopointers.두_배열_합치기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0; // 포인터
        while (p1 < n && p2 < m) { // 둘 중 하나라도 끝까지 가면 종료
            if (a[p1] < b[p2]) { // a배열의 값이 더 작으면
                answer.add(a[p1++]); // a배열의 값을 추가하고 포인터 증가
            } else {
                answer.add(b[p2++]);
            }
        }
        while (p1 < n) { // 남은 배열 추가 (둘 중 하나는 이미 끝까지 갔으므로)
            answer.add(a[p1++]);
        }
        while (p2 < m) {
            answer.add(b[p2++]);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = kb.nextInt();
        }
        for (int x : T.solution(n, m, a, b)) {
            System.out.print(x + " ");
        }
    }
}
// 3
// 1 3 5
// 5
// 2 3 6 7 9
