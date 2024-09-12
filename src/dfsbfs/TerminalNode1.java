package dfsbfs;

class Node3{
    int data;
    Node3 lt, rt;
    public Node3(int val) {
        data=val;
        lt=rt=null;
    }
}

// Tree 말단노드까지의 가장 짧은 경로(DFS)
// 이런건 BFS로 풀어야 하지만 연습용으로.
public class TerminalNode1 {

    Node3 root;

    public int DFS(int L, Node3 root) {
        if (root.lt == null && root.rt == null) { // 말단 노드이면
            return L;
        } else {
            return Math.min(DFS(L + 1, root.lt), DFS(L + 1, root.rt)); // 왼쪽, 오른쪽 자식노드로 이동
        }
    }

    public static void main(String args[]) {
        TerminalNode1 tree = new TerminalNode1();
        tree.root=new Node3(1);
        tree.root.lt=new Node3(2);
        tree.root.rt=new Node3(3);
        tree.root.lt.lt=new Node3(4);
        tree.root.lt.rt=new Node3(5);
        System.out.println(tree.DFS(0, tree.root));
    }
}
