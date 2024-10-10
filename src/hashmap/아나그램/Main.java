package hashmap.아나그램;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public String solution(String a, String b) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        for (char x : a.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for (char x : b.toCharArray()) {
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            }
            map.put(x, map.get(x) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(T.solution(a, b));
    }

}
