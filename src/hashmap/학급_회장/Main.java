package hashmap.학급_회장;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public char solution(int n, String s) {
        char answer = ' ';
        int max = Integer.MIN_VALUE;

        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }
}
// 15
// BACBACCACCBDEDE
