package ds.sort;

import java.util.Arrays;
import java.util.Scanner;

//이분검색(암기)
public class BinarySearch {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Arrays.sort(arr); // 이분검색은 정렬되어 있는 상황에서만 통한다.
        int lt = 0, rt = n-1;
        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                answer = mid + 1; //인덱스니깐 +1
                break;
            }
            if (arr[mid] > m) { // 중간값이 찾는 값보다 크면
                rt = mid - 1; // 오른쪽을 줄인다
            } else {
                lt = mid + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        BinarySearch T = new BinarySearch();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println(T.solution(n, m, arr));
    }
}
// 8 32
// 23 87 65 12 57 32 99 81
