# Day 47 — DrGViswanathan Challenge

**100 Days Coding Challenge | Java | LeetCode**

## Problems Solved

### 1. Binary Tree Maximum Path Sum — LeetCode #124

**Difficulty:** Hard

**Approach:** Recursion and postorder traversal.

- Calculate the maximum gain from the left and right subtrees.
- Ignore negative subtree contributions using `Math.max(0, gain)`.
- Update the global maximum using the path passing through the current node.
- Return the best one-sided path to the parent.

**Complexity:**
- Time: O(n)
- Auxiliary space: O(h), where h is the tree height.

### 2. Longest Increasing Subsequence — LeetCode #300

**Difficulty:** Medium

**Approach:** Dynamic Programming.

- Initialize each DP position to 1 because every element forms a subsequence of length 1.
- Compare each element with all previous elements.
- Extend the subsequence when the previous element is smaller.
- Track the maximum subsequence length.

**Complexity:**
- Time: O(n²)
- Auxiliary space: O(n)

## Key Learnings

- Binary tree recursion and postorder traversal.
- Maximum path calculations with negative node values.
- Dynamic Programming for subsequence problems.
- Breaking complex problems into smaller subproblems.

## Progress

- Challenge: Day 47/100
- Problems solved today: 2
- Language: Java
- Status: Accepted on LeetCode

**Consistency over perfection — one day at a time!**
