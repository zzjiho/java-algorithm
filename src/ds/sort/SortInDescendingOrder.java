package ds.sort;

import java.util.Scanner;

//Q.17 내림차순으로 자릿수 정렬하기
public class SortInDescendingOrder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] A = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            A[i] = Integer.parseInt(str.substring(i, i + 1)); // 문자열을 숫자로 변환, 2143
        }
        for (int i = 0; i < str.length(); i++) {
            int Max = i;
            for (int j = i + 1; j < str.length(); j++) { // i+1부터 시작하는 이유는 이미 정렬된 것은 비교할 필요가 없기 때문
                if (A[j] > A[Max]) {
                    Max = j;
                }
                if (A[i] < A[Max]) {
                    int temp = A[i];
                    A[i] = A[Max];
                    A[Max] = temp;
                }
            }
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(A[i]);
        }
    }
}
//2143
