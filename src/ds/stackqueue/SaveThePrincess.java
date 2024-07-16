package ds.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// offer() : 큐의 끝에 데이터를 넣는 메소드
// poll() : 큐의 앞에 있는 요소를 제거하고 반환
public class SaveThePrincess {

    public int solution(int n, int k) {
        int answer = 0; // 마지막 남는 사람
        Queue<Integer> Q = new LinkedList<>(); //큐 선언
        for (int i = 1; i <= n; i++) {
            Q.offer(i);
        }

        while (!Q.isEmpty()) {
            // k-1번째까지는 큐의 앞에서 꺼내어 다시 뒤로 보냄
            for (int i = 1; i < k; i++) {
                Q.offer(Q.poll()); //제거하고 반환한것을 다시 끝에 넣음
            }
            Q.poll(); // k를 외친 사람 제거
            if (Q.size() == 1) { // 마지막 남은 사람
                answer = Q.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SaveThePrincess T = new SaveThePrincess();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(T.solution(n, k));
    }
}
// 8 3