package dfsbfs;

public class FindingSubset {

    static int n;
    static int[] ch;

    public void DFS(int L) { // 부분집합으로 사용하냐 안하냐
        if (L == n + 1) { // 부분집합 경우가 하나 만들어짐
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {
                    tmp += (i + " ");
                }
            }
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        } else {
            ch[L] = 1; // 사용O
            DFS(L + 1); // 왼쪽 (사용한다) 이라 생각해라

            ch[L] = 0; // 사용X
            DFS(L + 1); // 오른쪽 (사용하지 않는다)
        }
    }

    public static void main(String[] args) {
        FindingSubset T = new FindingSubset();
        n = 3;
        ch = new int[n + 1];
        T.DFS(1);
    }
}
