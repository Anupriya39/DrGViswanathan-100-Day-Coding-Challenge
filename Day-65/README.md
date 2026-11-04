# Day 65 – 100 Days of Coding Challenge

## LeetCode Problems

| Problem | LeetCode | Difficulty | Topic |
|---|---|---|---|
| Plus One | [#66](https://leetcode.com/problems/plus-one/) | Easy | Array |
| Odd Even Linked List | [#328](https://leetcode.com/problems/odd-even-linked-list/) | Medium | Linked List |

## Approaches

### 1. Plus One

**Approach:** Right-to-left traversal with carry handling.

- Start from the last digit.
- If the digit is less than 9, increment it and return.
- Otherwise, set it to 0 and continue.
- If all digits are 9, create a new array with an additional leading 1.

**Time Complexity:** O(n)  
**Space Complexity:** O(n) in the all-9s case; O(1) auxiliary space otherwise.

### 2. Odd Even Linked List

**Approach:** In-place pointer manipulation.

- Maintain separate pointers for odd-indexed and even-indexed nodes.
- Rearrange the nodes while preserving their relative order.
- Connect the last odd node to the head of the even-indexed nodes.

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

## What I Learned

- Carry propagation in arrays.
- Efficient pointer manipulation in linked lists.
- Preserving relative order during linked list rearrangement.
- Solving problems with constant auxiliary space.

## Language

Java

## Challenge Progress

Day 65 / 100 ✔️

Consistency is the key to mastering DSA! 🚀
