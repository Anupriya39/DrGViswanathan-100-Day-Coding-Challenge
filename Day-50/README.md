# Day 50/100 — Merge k Sorted Lists

**[#DrGViswanathan Challenge] | 100 Days of Coding**

## Problem Details
- **Platform:** LeetCode
- **Problem:** 23. Merge k Sorted Lists
- **Difficulty:** Hard
- **Language:** Java
- **Topic:** Linked List, Priority Queue, Min-Heap

## Problem Statement
Given an array of `k` sorted linked lists, merge them into one sorted linked list and return its head.

## Approach
Used a **Priority Queue (Min-Heap)** to efficiently retrieve the smallest available node across all lists.

1. Insert the first node of every non-empty list into the priority queue.
2. Remove the smallest node and append it to the result list.
3. Insert the removed node's next node into the queue, if it exists.
4. Repeat until the queue becomes empty.
5. Return the merged list starting at `dummy.next`.

## Complexity Analysis
Let `N` be the total number of nodes across all lists and `k` be the number of lists.

- **Time Complexity:** `O(N log k)`
- **Auxiliary Space Complexity:** `O(k)` for the priority queue.

## Key Learnings
- Using a Min-Heap to efficiently merge sorted data.
- Combining linked lists with Java's `PriorityQueue`.
- Optimizing repeated minimum-element selection.
- Understanding time and space complexity.

## Progress
**Day 50/100 completed! 🎯**

Halfway through the challenge — continuing to build consistency, improve DSA fundamentals, and strengthen problem-solving skills.

**One problem, one concept, and another step forward.** 🚀

#DrGViswanathanChallenge #100DayCodingChallenge #LeetCode #Java #DSA #MergeKSortedLists
