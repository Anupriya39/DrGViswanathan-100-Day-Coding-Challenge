# Day 64 – Rotate List

**LeetCode Problem:** [61. Rotate List](https://leetcode.com/problems/rotate-list/)  
**Difficulty:** Medium  
**Language:** Java  
**Topic:** Linked List

## Problem
Given the head of a linked list, rotate the list to the right by `k` places.

## Approach: Length + Pointer Manipulation

1. Handle edge cases: empty list, single-node list, or `k = 0`.
2. Traverse the list to calculate its length and find the tail.
3. Reduce unnecessary rotations using `k = k % length`.
4. If `k = 0`, return the original list.
5. Connect the tail to the head to form a circular list.
6. Find the new tail at position `length - k`.
7. Set the new head as `newTail.next` and break the circular connection.

## Complexity Analysis

- **Time Complexity:** O(n)
- **Space Complexity:** O(1)

## What I Learned
- Efficient linked list pointer manipulation.
- Using modular arithmetic to minimize rotations.
- Rotating a linked list without creating additional nodes.

## Submission
Accepted on LeetCode: All 232 test cases passed.

**Day 64/100 – Keep learning, keep improving!**
