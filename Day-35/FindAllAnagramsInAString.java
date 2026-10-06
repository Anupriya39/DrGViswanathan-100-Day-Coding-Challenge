import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        int n = s.length();
        int m = p.length();

        if (m > n) {
            return ans;
        }

        int[] pFreq = new int[26];
        int[] windowFreq = new int[26];

        // Frequency of characters in p
        for (char ch : p.toCharArray()) {
            pFreq[ch - 'a']++;
        }

        // Sliding window of size p.length()
        for (int i = 0; i < n; i++) {
            windowFreq[s.charAt(i) - 'a']++;

            // Remove character that goes out of the window
            if (i >= m) {
                windowFreq[s.charAt(i - m) - 'a']--;
            }

            // Compare frequencies
            if (i >= m - 1 && Arrays.equals(pFreq, windowFreq)) {
                ans.add(i - m + 1);
            }
        }

        return ans;
    }
}
