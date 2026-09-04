class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // Count frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Bucket: index = frequency
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num : map.keySet()) {
            int freq = map.get(num);

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }

            buckets[freq].add(num);
        }

        // Get k most frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int freq = buckets.length - 1; freq >= 0 && index < k; freq--) {

            if (buckets[freq] != null) {
                for (int num : buckets[freq]) {
                    result[index++] = num;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}
