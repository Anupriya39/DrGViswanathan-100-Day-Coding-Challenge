import java.util.*;

class LRUCache {

    class Node {
        int key, value;
        Node prev, next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final Map<Integer, Node> map;
    private final Node head, tail;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        // Dummy nodes simplify insertion and deletion
        head = new Node(0, 0);
        tail = new Node(0, 0);

        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        // Mark this key as recently used
        removeNode(node);
        addToFront(node);

        return node.value;
    }

    public void put(int key, int value) {
        // Update existing key
        if (map.containsKey(key)) {
            Node node = map.get(key);
            node.value = value;

            removeNode(node);
            addToFront(node);
            return;
        }

        // Insert new key
        Node node = new Node(key, value);
        map.put(key, node);
        addToFront(node);

        // Evict least recently used key if over capacity
        if (map.size() > capacity) {
            Node lru = tail.prev;

            removeNode(lru);
            map.remove(lru.key);
        }
    }

    // Remove a node from its current position
    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Insert a node immediately after head
    private void addToFront(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }
}
