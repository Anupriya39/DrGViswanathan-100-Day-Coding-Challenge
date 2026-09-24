import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.offer(num);

            // Keep only the k largest elements
            if (pq.size() > k) {
                pq.poll();
            }
        }

        // Top of min heap is the kth largest element
        return pq.peek();
    }
}
