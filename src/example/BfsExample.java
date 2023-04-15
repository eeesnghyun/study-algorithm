package example;

import java.util.LinkedList;
import java.util.Queue;

public class BfsExample {
    Node root;

    public void BFS(Node root) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while (!queue.isEmpty()) {
            int length = queue.size();
            System.out.println("Level : " + level);

            for (int i = 0; i < length; i++) {
                Node node = queue.poll();
                System.out.print("Data : " + node.data + " ");

                if (node.lt != null) queue.add(node.lt);
                if (node.rt != null) queue.add(node.rt);
            }
            level++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        BfsExample tree = new BfsExample();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.BFS(tree.root);
    }
}
