package array;

import java.util.ArrayList;
import java.util.Scanner;

//뒤집은 소수
public class FlippedDecimal {

    // 소수 확인
    public boolean isPrime(int num) {
        // 1이면 소수가 아니다.
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            // i로 나누어 떨어지면 소수가 아님
            if (num % i == 0) {
                return false;
            }
        }
        // 위 조건 통과시 소수
        return true;
    }

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int tmp = arr[i]; //현재 숫자
            int res = 0; //뒤집은 숫자 저장할 변수

            //숫자 뒤집는 과정
            while (tmp > 0) { // 123
                int t = tmp % 10; // 3
                res = res * 10 + t;  // 3
                tmp = tmp / 10; // 12
            }
            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        FlippedDecimal T = new FlippedDecimal();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
//9
//32 55 62 20 250 370 200 30 100
