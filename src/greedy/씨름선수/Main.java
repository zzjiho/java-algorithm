package greedy.씨름선수;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    public int h, w;

    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h; // 키 내림차순 하겠다.
    }
}

public class Main {

    public int solution(ArrayList<Body> ar, int n) {
        int cnt = 0;
        Collections.sort(ar);
        int max = Integer.MIN_VALUE;
        for (Body ob : ar) {
            if (ob.w > max) {
                max = ob.w;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body> ar = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            ar.add(new Body(h, w));
        }
        System.out.println(T.solution(ar, n));
    }
}
