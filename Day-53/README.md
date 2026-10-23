# LeetCode 312 — Burst Balloons

**Difficulty:** Hard  
**Topic:** Interval Dynamic Programming  
**Language:** Java  
**Status:** Accepted

## Problem

Given an array of balloons, each with a number, burst them in an optimal order to maximize the total coins collected.

## Approach

1. Add `1` to both ends of the array to handle boundary cases.
2. Create a 2D DP table `dp[left][right]` to store the maximum coins obtainable by bursting all balloons in an interval.
3. Consider each balloon `k` as the **last balloon to burst** within the interval.
4. Calculate the coins earned from bursting `k` and combine them with the best results from the left and right intervals.
5. Take the maximum over all choices of `k`.

## Complexity

- **Time:** O(n³)
- **Space:** O(n²)

## Example

**Input:** `nums = [3,1,5,8]`  
**Output:** `167`

**Explanation:** Bursting the balloons in an optimal order gives a maximum of 167 coins.

## Key Learning

Learned how to solve interval-based optimization problems using Dynamic Programming and the technique of choosing the last operation.

## LeetCode

https://leetcode.com/problems/burst-balloons/

# LeetCode 132 — Palindrome Partitioning II

**Difficulty:** Hard  
**Topic:** Dynamic Programming  
**Language:** Java  
**Status:** Accepted

## Problem

Given a string `s`, partition it so that every substring is a palindrome. Return the minimum number of cuts required.

## Approach

1. Create a 2D boolean array `palindrome[i][j]` to determine whether the substring from index `i` to `j` is a palindrome.
2. Fill the table by checking matching characters and whether the inner substring is a palindrome.
3. Use a 1D DP array `dp[i]` to store the minimum cuts needed for the prefix ending at index `i`.
4. If the prefix is already a palindrome, no cuts are needed. Otherwise, try possible palindrome partitions and minimize the cuts.

## Complexity

- **Time:** O(n²)
- **Space:** O(n²)

## Example

**Input:** `s = "aab"`  
**Output:** `1`

**Explanation:** Partition the string into `"aa"` and `"b"`.

## Key Learning

Learned how to combine palindrome detection with Dynamic Programming to minimize partitioning operations.

## LeetCode

https://leetcode.com/problems/palindrome-partitioning-ii/
