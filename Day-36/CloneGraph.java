import java.util.*;

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }

        // Original node -> Cloned node
        Map<Node, Node> map = new HashMap<>();

        Queue<Node> queue = new LinkedList<>();

        // Clone the starting node
        Node clone = new Node(node.val);
        map.put(node, clone);
        queue.offer(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (Node neighbor : current.neighbors) {

                // If neighbor is not cloned yet
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val));
                    queue.offer(neighbor);
                }

                // Connect cloned current node to cloned neighbor
                map.get(current).neighbors.add(map.get(neighbor));
            }
        }

        return clone;
    }
}
