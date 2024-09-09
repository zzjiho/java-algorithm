package dfsbfs;

// 많이 나옴
public class Fibonacci {

    static int[] fibo; // 메모이제이션

    public int DFS(int n) {
        if (fibo[n] > 0) { // 메모이제이션 활용 (이미 구한 값은 다시 구하지 않음)
            return fibo[n];
        }
        if (n == 1) {
            return fibo[n] = 1;
        } else if (n == 2) {
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1);
        }
    }


    public static void main(String[] args) {
        Fibonacci T = new Fibonacci();
        int n = 45;
        fibo = new int[n + 1];
        T.DFS(n);
        for (int i = 1; i < n; i++) {
            System.out.println(fibo[i] + " ");
        }
    }

}
