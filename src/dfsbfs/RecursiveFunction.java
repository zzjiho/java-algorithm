package dfsbfs;

// 재귀함수(스택프레임)
// 호출된 메소드의 매개변수, 지역변수, 복귀주소 정보 갖는 프레임이 생김
// DFS(3) 부터 차례대로 D(2), D(1) 이렇게 쌓이고 D(1) 부터 호출
public class RecursiveFunction {

    public void DFS(int n) {
        if (n == 0) {
            return;
        } else {
            DFS(n - 1);
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        RecursiveFunction T = new RecursiveFunction();
        T.DFS(3);
    }

}
