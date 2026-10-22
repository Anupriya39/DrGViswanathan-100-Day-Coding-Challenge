# Day 52/100 — Maximum Profit in Job Scheduling

**[#DrGViswanathan Challenge]**

## Problem Details
- **Platform:** LeetCode
- **Problem:** 1235. Maximum Profit in Job Scheduling
- **Difficulty:** Hard
- **Language:** Java
- **Topics:** Dynamic Programming, Binary Search, Sorting

## Problem Statement
Given jobs with start times, end times, and profits, find the maximum total profit by selecting jobs that do not overlap. A job can start exactly when another job ends.

## Approach
1. Combine the start time, end time, and profit of each job.
2. Sort jobs by their ending times.
3. Use binary search to find the number of previously completed jobs compatible with the current job.
4. Use Dynamic Programming to choose between taking the current job and skipping it.
5. Return the maximum profit stored in the DP array.

## DP Transition
`dp[i]` represents the maximum profit obtainable from the first `i` jobs in sorted order.

`dp[i] = max(dp[i-1], profit + dp[compatible])`

## Complexity Analysis
- **Time Complexity:** `O(n log n)`
- **Space Complexity:** `O(n)`

## Key Learnings
- Combining Dynamic Programming with Binary Search.
- Finding compatible jobs efficiently.
- Making optimal take-or-skip decisions.
- Applying sorting to optimize scheduling problems.

## Progress
**Day 52/100 completed! ✔️**

Every problem builds stronger fundamentals. Continuing to learn, practice, and improve one day at a time. 🚀

#DrGViswanathanChallenge #100DayCodingChallenge #LeetCode #Java #DSA #DynamicProgramming #BinarySearch
