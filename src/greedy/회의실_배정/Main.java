package greedy.회의실_배정;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    public int s, e;

    Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    public int compareTo(Time o) { // 정렬의 기준을 제공
        if (this.e == o.e) { // 끝나는 시간이 같으면
            return this.s - o.s; // 시작 시간을 오름차순
        } else {
            return this.e - o.e;
        }
    }
}

public class Main {

    public int solution(ArrayList<Time> ar, int n) {
        int cnt = 0;
        Collections.sort(ar); // compareTo() 메소드에서 기준해놓은것에 따라 리스트를 정렬
        int et = 0;
        for (Time ob : ar) {
            if (ob.s >= et) {
                cnt++;
//                System.out.println(ob.s + " " + ob.e); // 선택된 회의 출력
                et = ob.e;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 5
        ArrayList<Time> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            ar.add(new Time(x, y));
        }
        System.out.println(T.solution(ar, n));
    }
}
// 5
// 1 4
// 2 3
// 3 5
// 4 6
// 5 7