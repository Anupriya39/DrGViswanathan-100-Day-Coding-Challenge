# Day 60/100 — Dr. G. Viswanathan Coding Challenge

Solved LeetCode problem #141 using Java, focusing on linked-list traversal and cycle detection.

## Problem: Linked List Cycle

- **LeetCode:** #141
- **Difficulty:** Easy
- **Topic:** Linked List, Two Pointers
- **Language:** Java

## Approach: Floyd's Cycle Detection Algorithm

Used the Slow and Fast Pointer technique to determine whether a linked list contains a cycle.

### Algorithm

1. Initialize two pointers, `slow` and `fast`, at the head.
2. Move `slow` one step at a time.
3. Move `fast` two steps at a time.
4. If both pointers meet, a cycle exists. Return `true`.
5. If the fast pointer or its next node becomes `null`, no cycle exists. Return `false`.

### Example

**Input:**
```text
head = [3, 2, 0, -4], pos = 1
```

**Output:**
```text
true
```

**Explanation:** The last node connects back to the node at index 1, creating a cycle.

## Complexity Analysis

- **Time Complexity:** O(n) — The pointers traverse the linked list at most linearly.
- **Space Complexity:** O(1) — Only two pointers are used, with no extra data structures.

## Key Learnings

- Understanding Floyd's Cycle Detection Algorithm.
- Using slow and fast pointers for efficient traversal.
- Detecting cycles without using extra memory.
- Improving linked-list problem-solving skills.

## Challenge Progress

**Day 60/100 Completed** ✅

Consistency is the key to progress!

#DrGViswanathanChallenge #100DayCodingChallenge #LeetCode #Java #DSA #LinkedList
