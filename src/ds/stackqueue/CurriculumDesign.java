package ds.stackqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//교육과정 설계
public class CurriculumDesign {

    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        // Q에 need 넣음
        for (char x : need.toCharArray()) {
            Q.offer(x);
        }

        for (char x : plan.toCharArray()) {
            if (Q.contains(x)) {
                if (x != Q.poll()) { // 필수과목이 순서대로 짜여졌는지?
                    return "NO";
                }
            }
        }

        if (!Q.isEmpty()) { // plan 다 돌았는데 Q가 비어있지 않은 경우 (필수 과목 다 수강X)
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        CurriculumDesign T = new CurriculumDesign();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.solution(a, b));
    }
}
//CBA
//CBDAGE