package array.에라토스테네스_체;

import java.util.Scanner;

public class Main {

    // 에라토스테네스의 체는 소수를 구하는 알고리즘이다.
    // 소수의 배수들을 1로 만들어주고
    // 0의 개수를 구해주는 식으로 ..
    public int solution(int n) {
        int[] ar = new int[n+1];
        int answer = 0;

        for (int i = 2; i < n; i++) { // i=2
            if (ar[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j+i) { //j=2,4,6
                    ar[j] = 1;  // ar[2,4,6,8,10] = 1
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 4
        System.out.println(T.solution(n));
    }
}
