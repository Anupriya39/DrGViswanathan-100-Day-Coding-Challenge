# Day 68 – Delete the Middle Node of a Linked List

**LeetCode Problem:** [2095. Delete the Middle Node of a Linked List](https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/)

**Difficulty:** Medium  
**Language:** Java  
**Topic:** Linked List, Two Pointers

## Problem Description

Given the head of a linked list, delete the middle node and return the modified linked list.

The middle node is determined using 0-based indexing.

## Approach – Slow and Fast Pointers

1. Handle edge cases: if the list is empty or contains only one node, return `null`.
2. Initialize three pointers: `slow`, `fast`, and `prev`.
3. Move `slow` one step and `fast` two steps at a time.
4. Track the previous node of `slow`.
5. When `fast` reaches the end, `slow` points to the middle node.
6. Delete the middle node by updating `prev.next = slow.next`.

## Java Solution

```java
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = slow.next;

        return head;
    }
}
```

## Complexity Analysis

- **Time Complexity:** O(n) – Traverses the linked list once.
- **Space Complexity:** O(1) – Uses only three pointers.

## Key Learnings

- Understanding the Slow and Fast Pointer technique.
- Finding the middle node in a linked list.
- Deleting nodes through pointer manipulation.
- Handling edge cases efficiently.

## Submission Status

- Accepted: 70/70 test cases
- Runtime: 3 ms

**Day 68/100 – Consistency is the key to progress!** 🚀
