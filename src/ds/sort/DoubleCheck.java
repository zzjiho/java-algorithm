package ds.sort;

import java.util.Arrays;
import java.util.Scanner;

//중복확인
public class DoubleCheck {

    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return "D";
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        DoubleCheck T = new DoubleCheck();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, arr));
    }
}

//8
//20 25 52 30 39 33 43 33
