class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];

        // Count each task
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        // Find maximum frequency
        int maxFreq = 0;

        for (int count : freq) {
            maxFreq = Math.max(maxFreq, count);
        }

        // Count how many tasks have the maximum frequency
        int maxCount = 0;

        for (int count : freq) {
            if (count == maxFreq) {
                maxCount++;
            }
        }

        // Construct the minimum required frame
        int result = (maxFreq - 1) * (n + 1) + maxCount;

        // We can never need fewer intervals than the number of tasks
        return Math.max(result, tasks.length);
    }
}
