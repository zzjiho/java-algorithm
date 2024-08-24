package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// 매출액의 종류
public class SalesType {
    public ArrayList<Integer> solution(int n, int k, int[] ar) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            map.put(ar[i], map.getOrDefault(ar[i], 0) + 1);
        }
        int lt = 0;
        for (int rt = k - 1; rt < n; rt++) {
            map.put(ar[rt], map.getOrDefault(ar[rt], 0) + 1);
            answer.add(map.size());
            map.put(ar[lt], map.get(ar[lt]) - 1);
            if (map.get(ar[lt]) == 0) {
                map.remove(ar[lt]);
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        SalesType T = new SalesType();
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

// 3 4 4 3
