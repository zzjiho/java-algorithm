package array;

import java.util.Scanner;

public class Mentoring {

    public int solution(int n, int m, int[][] arr) { //n:4, m:3
        int answer = 0;
        for (int i = 1; i <= n; i++) { // 멘토가 될 학생 선택
            for (int j = 1; j <= n; j++) { // 멘티가 될 학생 선택
                int cnt = 0;
                for (int k = 0; k < m; k++) { // 시험
                    int mento = 0, menti = 0;
                    for (int s = 0; s < n; s++) { // i가 j의 멘토가 될 수 있는지 확인
                        if (arr[k][s] == i) {
                            mento = s;
                        }
                        if (arr[k][s] == j) {
                            menti = s;
                        }
                    }
                    if (mento < menti) { // 멘토가 성적이 더 좋아야 함 (앞의 인덱스여야함)
                        cnt++;
                    }
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Mentoring T = new Mentoring();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }
}
// 4 3
// 3 4 1 2
// 4 3 2 1
// 3 1 4 2