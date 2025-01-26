package hsat.징검다리;

import java.io.*;
import java.util.*;

public class Main {
    // 밟을 수 있는 돌의 최대 개수
    // LIS 알고리즘 dp로 구현하기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 돌의 개수 5
        int[] ar = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            ar[i] = Integer.parseInt(st.nextToken()); // 돌의 높이 3 2 1 4 5
        }

        // 테이블 세팅
        int[] dp = new int[N];

        // 초기값 세팅
        for(int i=0; i<N; i++) {
            dp[i] = 1;
        }

        // 점화식 구현
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                if (ar[i] > ar[j]) {
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }

        int answer = 0;
        for (int i = 0; i < N; i++) {
            if (dp[i] > answer) {
                answer = dp[i];
            }
        }

        System.out.println(answer);
    }

}