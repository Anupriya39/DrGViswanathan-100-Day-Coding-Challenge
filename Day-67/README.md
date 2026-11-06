# Day 67 – 100 Days of Coding Challenge

## LeetCode Problems

| Problem | LeetCode | Difficulty | Topics |
|---|---|---|---|
| Swapping Nodes in a Linked List | [#1721](https://leetcode.com/problems/swapping-nodes-in-a-linked-list/) | Medium | Linked List, Two Pointers |
| Nth Digit | [#400](https://leetcode.com/problems/nth-digit/) | Medium | Math, Number Theory |

## 1. Swapping Nodes in a Linked List

**Approach: Two Pointers**

- Find the kth node from the beginning.
- Use two pointers to locate the kth node from the end.
- Swap the values of these two nodes.
- Return the original head.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

## 2. Nth Digit

**Approach: Mathematical Grouping**

- Divide the sequence into groups based on the number of digits.
- Each group contains numbers with the same digit length.
- Subtract the digit count of previous groups until the target group is found.
- Calculate the actual number containing the required digit.
- Extract and return the digit at the required position.

**Time Complexity:** O(log n)  
**Space Complexity:** O(1)

## What I Learned

- Two-pointer technique in linked lists.
- Finding kth positions from both ends.
- Mathematical grouping of consecutive integers.
- Efficient digit extraction without generating the entire sequence.
- Improving time and space efficiency.

## Language

Java

## Challenge Progress

**Day 67 / 100 ✔️**

Consistency is the key to mastering DSA! 🚀
