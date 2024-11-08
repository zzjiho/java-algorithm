package ds.stackqueue.응급실;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 5 2
// 60 50 70 80 90
class Person {
    int id;
    int priority;

    public Person(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }
}

public class Main {
    public int solution(int n, int m, int[] ar) {
        int answer = 0; // 진료받은 환자의 수 세기
        Queue<Person> Q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, ar[i])); //0,60   1,50    2,70    3,80   4,90
        }

        while (!Q.isEmpty()) {
            Person tmp = Q.poll(); // 첫번째 환자 꺼내기
            for (Person x : Q) {
                if (x.priority > tmp.priority) {  // 위험도가 더 높은 환자가 있으면
                    Q.offer(tmp); // 현재 환자는 자격이 없으니, 뒤로 보낸다.
                    tmp = null; // 현재 환자는 진료를 받지 않음
                    break;
                }
            }
            if (tmp != null) {
                answer++; // 진료받은 환자 수 증가
                if (tmp.id == m) {
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] ar = new int[N];
        for (int i = 0; i < N; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(T.solution(N, M, ar));
    }
}
