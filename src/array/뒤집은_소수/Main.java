package array.뒤집은_소수;

import java.util.ArrayList;
import java.util.Scanner;

// 9
// 32 55 62 20 250 370 200 30 100
public class Main {

    public boolean isPrime(int num) {
        if (num == 1) { // 1은 소수아님
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] ar) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = ar[i]; // 현재 숫자
            int res = 0; // 뒤집은 숫자 저장할 변수

            // 숫자 뒤집기
//            while (tmp > 0) {
//                int t = tmp % 10;
//                res = res * 10 + t;
//                tmp = tmp / 10;
//            }
            String reversedStr = new StringBuilder(String.valueOf(tmp)).reverse().toString();
            res = Integer.parseInt(reversedStr);

            if (isPrime(res)) {
                answer.add(res);
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
