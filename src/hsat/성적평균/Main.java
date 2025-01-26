package hsat.성적평균;

import java.io.*;
import java.util.*;

public class Main {

    // 시간복잡도상 합배열을 이용
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 학생수 5 (1,000,000)
        int K = Integer.parseInt(st.nextToken()); // 구간수 3 (10,000)
        long[] ar = new long[N + 1];

        // 합배열 구하기
        // S[i] = S[i-1]+A[i]
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            ar[i] = ar[i - 1] + Integer.parseInt(st.nextToken());
        }

        // 구간합 구하기
        // S[b] - S[a-1]
        for (int i = 1; i <= K; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()); // 1
            int b = Integer.parseInt(st.nextToken()); // 3
            long sum = ar[b] - ar[a - 1];
            double avg = (double) sum / (b-a+1);
            System.out.printf("%.2f\n", avg);
        }
    }
}

