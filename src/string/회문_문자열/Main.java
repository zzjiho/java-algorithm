package string.회문_문자열;

import java.util.Scanner;

// gooG
public class Main {
    public String solution(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int lt = 0, rt = str.length()-1;

        while (lt < rt) {
            if (str.charAt(lt) == str.charAt(rt)) {
                lt++;
                rt--;
            } else {
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(T.solution(a));
    }
}
