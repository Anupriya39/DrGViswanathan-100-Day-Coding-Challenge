# LeetCode 84 — Largest Rectangle in Histogram

**Difficulty:** Hard  
**Topic:** Stack, Monotonic Stack  
**Language:** Java  
**Status:** Accepted

## Problem

Given an array of integers representing histogram bar heights, find the area of the largest rectangle that can be formed.

## Approach

1. Use a stack to store indices of histogram bars in increasing order of height.
2. Traverse the array and process bars whenever the current height is smaller than the height at the stack's top.
3. Pop the bar and calculate the rectangle's height using that bar's height.
4. Calculate the width using the current index and the new stack top.
5. Update the maximum area.
6. Add a virtual bar of height `0` at the end to process all remaining bars.

## Complexity

- **Time:** O(n), because each index is pushed and popped at most once.
- **Space:** O(n), for the stack.

## Example

**Input:** `heights = [2,1,5,6,2,3]`

**Output:** `10`

**Explanation:** The largest rectangle has height `5` and width `2`, giving an area of `10`.

## Key Learning

Learned how a monotonic stack helps identify rectangle boundaries and solve an optimization problem efficiently in linear time.

## LeetCode

https://leetcode.com/problems/largest-rectangle-in-histogram/
