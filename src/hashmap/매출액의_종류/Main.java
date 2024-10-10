package hashmap.매출액의_종류;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public ArrayList<Integer> solution(int n, int k, int[] ar) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int lt = 0, rt = 0;

        // 첫 번째 윈도우에서 K-1까지의 매출을 맵에 저장
        for (int i = 0; i < k - 1; i++) {
            map.put(ar[i], map.getOrDefault(ar[i], 0) + 1); // 각 매출액의 빈도수를 기록
        }

        // 슬라이딩 윈도우 시작
        for (rt = k - 1; rt < n; rt++) { // rt는 윈도우의 오른쪽 끝을 가리킴
            // 새로운 날의 매출을 추가
            map.put(ar[rt], map.getOrDefault(ar[rt], 0) + 1);

            // 현재 윈도우 내의 매출 종류의 개수를 결과 리스트에 저장
            answer.add(map.size());

            // 윈도우의 왼쪽 끝의 매출을 맵에서 제거 (카운트를 줄임)
            map.put(ar[lt], map.get(ar[lt]) - 1);

            // 만약 매출액의 빈도 수가 0이면 맵에서 제거
            if (map.get(ar[lt]) == 0) {
                map.remove(ar[lt]);
            }

            // 윈도우를 오른쪽으로 한 칸 이동 (lt 증가)
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }

        System.out.println(T.solution(n, k, ar));
    }

}
// 7 4
// 20 12 20 10 23 17 10
