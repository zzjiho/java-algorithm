package array.큰_수_출력하기;

import java.util.ArrayList;
import java.util.Scanner;

// 6
// 7 3 9 5 6 12
public class Main {

    public ArrayList<Integer> solution(int n, int[] ar) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(ar[0]); // 첫번째는 무조건 받고
        for (int i = 1; i < n; i++) {
            if (ar[i] > ar[i - 1]) {
                answer.add(ar[i]);
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
        for (int x : T.solution(n, ar)) {
            System.out.print(x + " ");
        }
    }
}