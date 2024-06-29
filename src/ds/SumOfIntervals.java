package ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//구간 합 구하기
public class SumOfIntervals {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int suNo = Integer.parseInt(stringTokenizer.nextToken()); // 5
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); // 3
        long[] S = new long[suNo + 1]; //합배열 선언
        stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 5 4 3 2 1
        for (int i = 1; i <= suNo; i++) { // 숫자 개수만큼 반복
            S[i] = S[i -1] + Integer.parseInt(stringTokenizer.nextToken()); // 합배열 공식 = S[i] = S[i-1] + A[i]
        }
        for (int q = 0; q < quizNo; q++) { //질의 개수만큼 반복
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }


    }
}

// 5 3
// 5 4 3 2 1
// 1 3
// 2 4
// 5 5
