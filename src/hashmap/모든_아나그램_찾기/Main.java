package hashmap.모든_아나그램_찾기;

import java.util.HashMap;
import java.util.Scanner;

// bacaAacba
// abc
public class Main {
    public int solution(String a, String b) {
        int answer = 0;
        int lt = 0, rt = 0;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        // b값 map에 세팅
        for (char x : b.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }
        int L = b.length() - 1;

        // a값 세팅, 슬라이딩 윈도우를 위하여(b길이 -1 만큼 세팅)
        for (int i = 0; i < L; i++) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }

        // 슬라이딩 윈도우 시작
        for (rt = L; rt < a.length(); rt++) {
            // L 부터 넣기
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);

            // am bm 비교
            if (am.equals(bm)) {
                answer++;
            }

            // lt 빼기
            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);

            if (am.get(a.charAt(lt)) == 0) {
                am.remove(a.charAt(lt));
            }
            lt++;
        }


        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        System.out.println(T.solution(str1, str2));
    }
}
// bacaAacba
// abc