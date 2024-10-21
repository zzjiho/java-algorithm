package ds.stackqueue.응급실;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

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
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, ar[i]));
        }

        while (!Q.isEmpty()) {
            Person tmp = Q.poll();
            for (Person x : Q) {
                if (x.priority > tmp.priority) {
                    Q.offer(tmp);
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer++;
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
