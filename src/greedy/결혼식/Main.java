package greedy.결혼식;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {

    public int time;
    public char state;

    Time(int time, char state) {
        this.time = time;
        this.state = state;
    }

    public int compareTo(Time ob) {
        if (this.time == ob.time) { // 시간이 같으면
            return this.state - ob.state; // state 오름차순
        } else {
            return this.time - ob.time;
        }
    }
}

public class Main {

    // 14시에는 'e', 's' 둘다 존재하는데, 'e' 우선 처리 해줘야 한다.
    // 'e' 일때는 떠나고 없으므로, 'e'를 우선 처리 해야함.
    public int solution(ArrayList<Time> ar) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(ar); // 알파벳 'e' 가 's' 보다 먼저나오게 됨
        int cnt = 0; // 현재 피로연장에 몇명이 존재하는가

        for (Time ob : ar) {
            if (ob.state == 's') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int st = sc.nextInt();
            int et = sc.nextInt();
            ar.add(new Time(st,'s'));
            ar.add(new Time(et,'e'));
        }
        System.out.println(T.solution(ar));
    }
}
// 5
// 14 18
// 12 15
// 15 20
// 20 30
// 5 14