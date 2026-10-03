import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        // prefixSum -> number of times it has appeared
        Map<Integer, Integer> map = new HashMap<>();

        // Empty prefix before the array
        map.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            // We need an earlier prefixSum such that:
            // prefixSum - earlierSum = k
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            // Store current prefix sum
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}
