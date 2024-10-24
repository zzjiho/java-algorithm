package string.문장_속_단어;

import java.util.Scanner;

public class Main {

    public String solution(String a) {
        String answer = "";
        int max = Integer.MIN_VALUE;
        String[] ar = a.split(" ");

        for (String x : ar) {
            int length = x.length();
            if (length > max) {
                max = length;
                answer = x;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(T.solution(str));
    }
}