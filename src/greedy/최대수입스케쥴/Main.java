package greedy.최대수입스케쥴;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    public int money;
    public int date;

    Lecture(int money, int date) {
        this.money = money;
        this.date = date;
    }

    public int compareTo(Lecture ob) {
        return ob.date - this.date; // 날짜로 내림차순
    }
}

public class Main {

    static int n, max = Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> ar) {
        int answer = 0;
//        PriorityQueue<Integer> pQ = new PriorityQueue<> // default : 제일 작은 값을 최우선으로 꺼냄
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); // 들어간 순서에 상관없이 큰 값을 우선순위로 하는 Queue
        Collections.sort(ar);
        int j = 0;
        for (int i = max; i >= 1; i--) {
            for (; j < n; j++) { // j가 루프 외부에서 선언되고 초기화되어야 할 때 사용, 여러 개의 루프에서 j를 계속해서 사용하고자 할 때.
                if (ar.get(j).date < i) { // 현재 강의의 날짜가 i보다 작으면 루프 중단
                    break;
                }
                pQ.offer(ar.get(j).money);
            }
            if (!pQ.isEmpty()) {
                answer += pQ.poll();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        ArrayList<Lecture> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt(); // D일 안에 아무날짜나 와서 하면 된다.
            ar.add(new Lecture(m, d));
            if (d > max) { // 제일 큰 날짜 구하기 ( 거꾸로 돌기 위함 )
                max = d;
            }
        }
        System.out.println(T.solution(ar));
    }
}
