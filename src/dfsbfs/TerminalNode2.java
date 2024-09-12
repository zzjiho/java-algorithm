package dfsbfs;

import java.util.LinkedList;
import java.util.Queue;

class Node4{
    int data;
    Node4 lt, rt;
    public Node4(int val) {
        data=val;
        lt=rt=null;
    }
}

// Tree 말단노드까지의 가장 짧은 경로(BFS)
public class TerminalNode2 {
    Node4 root;

    public int BFS(Node4 root) {
        Queue<Node4> Q = new LinkedList<>();
        Q.offer(root); //일단 1넣어
        int L = 0; // 첫번째 레벨은 0 (레벨 탐색 해야하니까)
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node4 cur = Q.poll();
                if (cur.lt == null && cur.rt == null) { // 말단 노드이면 (최초 발견된애가 가장 짧게 갈 수 있는 애)
                    return L;
                }
                if (cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }
            L++;
        }

        return 0;
    }


    public static void main(String args[]) {
        TerminalNode2 tree = new TerminalNode2();
        tree.root=new Node4(1);
        tree.root.lt=new Node4(2);
        tree.root.rt=new Node4(3);
        tree.root.lt.lt=new Node4(4);
        tree.root.lt.rt=new Node4(5);
        System.out.println(tree.BFS(tree.root));
    }
}
