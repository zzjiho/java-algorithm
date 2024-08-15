package array;

import java.util.Scanner;

//보이는 학생
public class VisibleStudent {

    public int solution(int n, int[] arr) {
        int answer = 1, max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                answer ++;
                max = arr[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        VisibleStudent T = new VisibleStudent();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
//8
//130 135 148 140 145 150 150 153
