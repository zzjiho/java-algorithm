package ds.sort;

import java.util.Scanner;

/**
 * Cache Miss : 23167 -> 52316
 * Cache Hit : 52316 -> 35216
 */
public class LeastRecentlyUsed {

    public int[] solution(int size, int n, int[] arr) {
        int[] cache = new int[size]; // int[5]
        for (int x : arr) {
            int pos = -1;
            for (int i = 0; i < size; i++) {
                if (x == cache[i]) { // 캐시히트 (x가 캐시에 존재하면, 캐시에서 x를 제거하고, 맨 앞에 x를 삽입)
                    pos = i; // 히트된 지점의 인덱스를 저장
                }
            }
            if (pos == -1) { // 캐시미스 (캐시의 모든 항목을 오른쪽으로 한 칸씩 이동시키고, 캐시의 맨 앞에 x를 삽입)
                for (int i = size - 1; i >= 1; i--) {
                    cache[i] = cache[i - 1];
                }
            } else { // 캐시히트 (x의 위치 pos부터 맨 앞까지의 항목들을 오른쪽으로 한 칸씩 이동시키고, 캐시의 맨 앞에 x를 삽입)
                for (int i = pos; i >= 1; i--) { // 히트난 지점부터 땡기기
                    cache[i] = cache[i - 1];
                }
            }
            cache[0] = x;
        }
        return cache;
    }

    public static void main(String[] args) {
        LeastRecentlyUsed T = new LeastRecentlyUsed();
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : T.solution(s, n, arr)) System.out.print(x + " ");
    }
}
// 5 9
// 1 2 3 2 6 2 3 5 7
