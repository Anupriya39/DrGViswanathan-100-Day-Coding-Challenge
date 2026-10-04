class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        // dp[i] = number of ways to decode first i characters
        int[] dp = new int[n + 1];

        dp[0] = 1; // Empty string
        dp[1] = (s.charAt(0) == '0') ? 0 : 1;

        for (int i = 2; i <= n; i++) {

            // Take one digit
            char one = s.charAt(i - 1);

            if (one != '0') {
                dp[i] += dp[i - 1];
            }

            // Take two digits
            int two = Integer.parseInt(s.substring(i - 2, i));

            if (two >= 10 && two <= 26) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}
