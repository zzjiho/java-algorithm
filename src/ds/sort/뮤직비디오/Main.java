package ds.sort.뮤직비디오;


import java.util.Arrays;
import java.util.Scanner;

// 뮤직비디오 (결정알고리즘)
// 9 3
// 1 2 3 4 5 6 7 8 9
public class Main {

    public int count(int[] ar, int capacity) {
        int cnt=1, sum=0;
        for (int x : ar) {
            if (sum + x > capacity) {
                cnt++;
                sum=x;
            } else {
                sum += x;
            }
        }
        return cnt;
    }

    public int solution(int n, int m, int[] ar) {
        int answer = 0;
        Arrays.sort(ar);
        int lt = Arrays.stream(ar).max().getAsInt(); // 배열의 모든 요소 중 가장 큰 값
        int rt = Arrays.stream(ar).sum();
        while (lt <= rt) {
            int mid = (lt + rt) / 2; // mid = dvd 1장 용량
            if (count(ar, mid) <= m) {
                answer = mid;
                rt = mid-1;
            } else {
                lt = mid+1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, ar));
    }

}
