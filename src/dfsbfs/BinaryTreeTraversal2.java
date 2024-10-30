package dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

// 이진트리순회(DFS)
class Node2 {
    int data;
    Node2 lt, rt;

    public Node2(int val) {
        data=val;
        lt = rt = null;
    }
}

public class BinaryTreeTraversal2 {
    Node2 root;

    public void BFS(Node2 root) {
        Queue<Node2> Q = new LinkedList<>();
        Q.add(root);
        int L = 0; // 첫번째 레벨은 0
        while (!Q.isEmpty()) { // 큐가 비어있지 않을 때까지
            int len = Q.size();
            System.out.print(L + " : ");
            for (int i = 0; i < len; i++) {
                Node2 cur = Q.poll();
                System.out.print(cur.data + " ");
                if (cur.lt != null){
                    Q.add(cur.lt);
                }
                if (cur.rt != null){
                    Q.add(cur.rt);
                }
            } // 레벨 끝
            L++; // 다음 레벨로 넘어가기
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BinaryTreeTraversal2 tree = new BinaryTreeTraversal2();
        tree.root=new Node2(1);
        tree.root.lt=new Node2(2);
        tree.root.rt=new Node2(3);
        tree.root.lt.lt=new Node2(4);
        tree.root.lt.rt=new Node2(5);
        tree.root.rt.lt=new Node2(6);
        tree.root.rt.rt=new Node2(7);
        tree.BFS(tree.root);
    }
}