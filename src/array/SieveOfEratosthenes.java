package array;

import java.util.Scanner;

//에라토스테네스 체 : 2부터 시작하여 각 소수의 배수를 제거
public class SieveOfEratosthenes {

    public int solution(int n) {
        int answer = 0;
        int[] ch = new int[n + 1]; // 0이면 소수, 1이면 소수가 아님
        System.out.println(ch.length);

        for (int i = 2; i <= n; i++) { // 2부터 시작
            if (ch[i]==0) { // 소수인 경우
                answer++;
                for (int j = i; j <= n; j = j + i) { // i의 배수를 제거
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        SieveOfEratosthenes T = new SieveOfEratosthenes();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
// 20
