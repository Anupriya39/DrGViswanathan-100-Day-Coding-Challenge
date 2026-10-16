# Day 46 — Word Break | LeetCode #139

**Challenge:** #DrGViswanathan Challenge — Day 46/100

## Problem

Given a string `s` and a dictionary of words, determine whether the string can be segmented into one or more dictionary words. Dictionary words may be reused.

## Approach: Dynamic Programming

1. Store dictionary words in a `HashSet` for efficient average-case lookups.
2. Create a Boolean array `dp` of size `n + 1`.
3. Set `dp[0] = true` because an empty prefix is valid.
4. For each position `i`, check every previous position `j`.
5. If `dp[j]` is true and `s.substring(j, i)` exists in the dictionary, set `dp[i] = true`.
6. Return `dp[n]`.

## Example

**Input**
```text
s = "leetcode"
wordDict = ["leet", "code"]
```

**Output**
```text
true
```

**Explanation:** The string can be segmented into `"leet" + "code"`.

## Complexity

- **Time:** O(n²) average dictionary checks, excluding substring construction and hashing costs.
- **Space:** O(n + k), excluding temporary substring allocations, where `k` is the total number of characters in the dictionary.

## Key Learnings

- Dynamic Programming and overlapping subproblems
- Boolean DP arrays
- HashSet-based dictionary lookups
- Valid-prefix tracking and string segmentation

**Language:** Java

**Status:** Accepted on LeetCode

**Challenge Progress:** Day 46/100

## Tags

`Java` `LeetCode` `DynamicProgramming` `WordBreak` `DSA` `100DaysOfCode`
