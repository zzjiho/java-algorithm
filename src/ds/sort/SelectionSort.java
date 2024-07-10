package ds.sort;

import java.util.Scanner;

public class SelectionSort {

    public int[] solution(int n, int[] arr) {
        // 배열의 길이 n만큼 반복합니다.
        for (int i = 0; i < n - 1; i++) { // 마지막 요소는 비교할 필요가 없으므로 n-1까지 반복
            int idx = i; // 현재 위치를 가장 작은 값의 인덱스로 초기화
            // 현재 위치 이후의 요소들에 대해 반복합니다.
            for (int j = i + 1; j < n; j++) {
                // 현재 위치 이후의 요소와 현재 최소값을 비교합니다.
                if (arr[j] < arr[idx]) {
                    idx = j; // 더 작은 값이 있으면 그 값의 인덱스를 저장합니다.
                }
            }
            // 가장 작은 값이 현재 위치의 값과 다르면 교환합니다.
            // 이 부분은 현재 위치의 값과 가장 작은 값의 위치를 바꿉니다.
            int tmp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = tmp;
        }
        // 정렬된 배열을 반환합니다.
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort T = new SelectionSort(); // SelectionSort 클래스의 인스턴스를 생성합니다.
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위해 Scanner 객체를 생성합니다.
        int n = sc.nextInt(); // 사용자로부터 정렬할 배열의 크기를 입력받습니다.
        int[] arr = new int[n]; // 입력받은 크기만큼의 배열을 생성합니다.
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // 배열의 요소들을 입력받습니다.
        }
        // 정렬된 배열을 출력합니다.
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}


//6
//13 5 11 7 23 15