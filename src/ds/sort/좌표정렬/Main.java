package ds.sort.좌표정렬;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//좌표 정렬
class Point implements Comparable<Point> {

    public int x, y; //점 x,y 좌표

    // 새로운 점을 생성하고 좌표 초기화
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 두 점을 비교하여 정렬 기준 정의
    @Override
    public int compareTo(Point o) {
        if (this.x==o.x) {
            // x좌표가 같다면 y 좌표를 기준으로 오름차순 정렬
            // this.y가 o.y보다 작으면 음수 값이 반환되므로,
            // 현재 점이 비교 대상 점보다 작다고 판단되어 오름차순 정렬에서 앞에 위치
            return this.y - o.y;
        } else {
            // x좌표가 다르다면 x 좌표를 기준으로 오름차순 정렬
            return this.x - o.x;
        }
    }
}

// 좌표 정렬을 수행하는 클래스
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //점의 개수
        ArrayList<Point> arr = new ArrayList<>(); //점의 좌표를 저장할 리스트
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x, y)); //리스트에 새로운 점 추가
        }

        Collections.sort(arr); //리스트 정렬 후

        for (Point o : arr) { // 정렬된 점들 출력
            System.out.println(o.x + " " + o.y);
        }
    }
}
// 5
// 2 7
// 1 3
// 1 2
// 2 5
// 3 6