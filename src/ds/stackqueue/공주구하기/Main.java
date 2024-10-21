package ds.stackqueue.공주구하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main {
    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> Q = new LinkedList<>();

        for (int i = 1; i < n+1; i++) {
            Q.offer(i);
        }

        while (!Q.isEmpty()) {
            // 앞에 2명은 뒤로 보내
            for (int i = 0; i < k-1; i++) {
                Q.offer(Q.poll());
            }
            // k번째 왕자 없애기
            Q.poll();
            if (Q.size() == 1) {
                answer = Q.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(T.solution(n,k));
    }
}
// 8 3
