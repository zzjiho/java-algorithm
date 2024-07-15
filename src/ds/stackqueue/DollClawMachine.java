package ds.stackqueue;

import java.util.Scanner;
import java.util.Stack;

//크레인 인형뽑기
public class DollClawMachine {

    public int solution(int[][] board, int[] moves) {
        int answer = 0; //제거된 인형 수
        Stack<Integer> stack = new Stack<>(); //인형을 뽑아 쌓아두는 스택
        for (int pos : moves) { //8
            for (int i = 0; i < board.length; i++) {
                if (board[i][pos - 1] != 0) { //인형 만났을시, pos-1인 이유는 1부터 시작하는데 배열은 0부터 시작하기 때문
                    int tmp = board[i][pos - 1]; //뽑은 인형 임시 변수에 저장
                    board[i][pos-1] = 0;  //인형 뽑았으므로 0으로 표시
                    if (!stack.isEmpty() && tmp == stack.peek()) { //peek는 맨 위에 있는 원소를 반환
                        answer += 2;
                        stack.pop();
                    } else {
                        stack.push(tmp);
                        break; //인형 하나 뽑고 또 반복하면 안되므로 break
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        DollClawMachine T = new DollClawMachine();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }
        System.out.println(T.solution(board, moves));
    }
}
//5
//0 0 0 0 0
//0 0 1 0 3
//0 2 5 0 1
//4 2 4 4 2
//3 5 1 3 1
//8
//1 5 3 5 1 2 1 4
