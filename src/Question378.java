import java.util.Comparator;
import java.util.PriorityQueue;

public class Question378 {
    private class Node {
        int value;
        int row;
        int col;
        private Node(int value, int row, int col) {
            this.value = value;
            this.row = row;
            this.col = col;
        }
    }
    public int kthSmallest(int[][] matrix, int k) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return 0;
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(n -> n.value));
        for (int i = 0; i < matrix[0].length; i += 1)
            pq.add(new Node(matrix[0][i], 0, i));
        while (k > 1) {
            Node node = pq.poll();
            k -= 1;
            if (node.row + 1 < matrix.length) {
                pq.add(new Node(matrix[node.row + 1][node.col], node.row + 1, node.col));
            }
        }
        return pq.poll().value;
    }
}
