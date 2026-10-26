
# Day 56 – Reverse Linked List

Part of my **#DrGViswanathan Challenge** — 100 Days of Coding.

## Problem Details

- **LeetCode:** [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
- **Difficulty:** Easy
- **Language:** Java
- **Topic:** Linked List
- **Approach:** Iterative Three-Pointer Technique

## Problem Statement

Given the head of a singly linked list, reverse the list and return its new head.

**Example:**

Input: `1 -> 2 -> 3 -> 4 -> 5`

Output: `5 -> 4 -> 3 -> 2 -> 1`

## Approach

1. Initialize `prev` as `null` and `curr` as `head`.
2. Store `curr.next` in `nextNode` to avoid losing the remaining list.
3. Reverse the current link using `curr.next = prev`.
4. Move `prev` to `curr` and `curr` to `nextNode`.
5. Repeat until `curr` becomes `null`.
6. Return `prev` as the new head.

## Complexity Analysis

- **Time Complexity:** O(n), where n is the number of nodes.
- **Space Complexity:** O(1) auxiliary space.

## Key Learnings

- Understanding linked-list pointer manipulation.
- Reversing node connections iteratively.
- Preserving references while modifying links.
- Solving problems efficiently without extra data structures.

## Challenge Progress

**Day 56 / 100** — 56 days completed, 44 days to go!

One problem at a time. Keep learning and keep growing. 🚀

#Java #LeetCode #DSA #LinkedList #100DaysOfCode

