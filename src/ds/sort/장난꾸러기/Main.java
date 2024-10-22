package ds.sort.장난꾸러기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// 9
// 120 125 152 130 135 135 143 127 160

// 120 125 127 130 135 135 143 152 160
public class Main {

    public ArrayList<Integer> solution(int n, int[] ar) {
        int[] clone = ar.clone();
        Arrays.sort(clone);
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (ar[i] != clone[i]) {
                answer.add(i+1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        for (int x : T.solution(n,arr)) System.out.print(x+" ");
    }
}
//9
//120 125 152 130 135 135 143 127 160
