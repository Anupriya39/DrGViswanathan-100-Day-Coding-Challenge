# Day 39 — 100 Days Coding Challenge

## Problems Solved

### 1. LRU Cache — LeetCode #146

**Problem:** Design a Least Recently Used (LRU) cache supporting `get` and `put` operations in O(1) average time.

**Approach:**
- Use a HashMap to locate cache nodes efficiently.
- Use a Doubly Linked List to track usage order.
- Move recently accessed or updated nodes to the front.
- Evict the least recently used node when capacity is exceeded.

**Complexity:**
- `get`: O(1) average
- `put`: O(1) average
- Space: O(capacity)

### 2. Coin Change — LeetCode #322

**Problem:** Find the minimum number of coins required to make a given amount. Return `-1` if the amount cannot be formed.

**Approach:**
- Create a DP array where `dp[i]` stores the minimum coins needed for amount `i`.
- Initialize unreachable amounts with `amount + 1`.
- Set `dp[0] = 0`.
- For every amount and coin, update the minimum using `dp[i] = min(dp[i], dp[i - coin] + 1)` when the coin is usable.

**Complexity:**
- Time: O(amount × number of coin denominations)
- Space: O(amount)

## Key Learnings

- Combining HashMaps and Doubly Linked Lists.
- Implementing LRU eviction efficiently.
- Understanding bottom-up Dynamic Programming.
- Solving minimum-cost and optimization problems.

**Language:** Java

**Challenge Progress:** Day 39/100  
**Status:** Both solutions accepted on LeetCode.
