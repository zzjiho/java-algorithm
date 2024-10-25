package array.가위바위보;

import java.util.Scanner;

// 5
// 2 3 3 1 3
// 1 1 2 2 3
public class Main {

     // 1:가위, 2:바위, 3:보
    // 1 > 3
    // 2 > 1
    // 3 > 2
    public String solution(int n, int[] a, int[] b) {
        // 전부다 A가 이겼다고 가정을 한다.
        String answer = "";
        // B가 이겼을때는 "B" 를 return 하면 됨. 비겼을때는 "D";

        for (int i = 0; i < n; i++) {
            if (a[i] == b[i]) {
                answer += "D";
            } else if (a[i] == 1 && b[i] == 3) {
                answer += "A";
            } else if (a[i] == 2 && b[i] == 1) {
                answer += "A";
            } else if (a[i] == 3 && b[i] == 2) {
                answer += "A";
            } else {
                answer += "B";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, a, b));
    }
}