package ds.stackqueue;

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

//응급실
public class EmergencyRoom {
    public int solution(int n, int m, int[] arr) {
        int answer = 0;
        Queue<Person> Q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            Q.offer(new Person(i, arr[i]));
        }

        while (!Q.isEmpty()) {
            Person tmp = Q.poll();
            for (Person x : Q) {
                // tmp 환자가 진료를 받을 수 있는지 ?
                if (x.priority > tmp.priority) {
                    Q.offer(tmp); // 못받으면 다시 맨 뒤로
                    tmp = null;
                    break;
                }
            }
            if (tmp != null) {
                answer ++;
                if (tmp.id == m) {
                    return answer;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        EmergencyRoom T = new EmergencyRoom();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}
// 5 2
// 60 50 70 80 90
