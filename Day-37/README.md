# 🚀 100 Days Coding Challenge

## Day 37 — BFS & Linked List

### Problems Solved

1. **994. Rotting Oranges**
   - Difficulty: Medium
   - Topic: BFS / Matrix / Graph

2. **2. Add Two Numbers**
   - Difficulty: Medium
   - Topic: Linked List / Math

---

## 🍊 1. Rotting Oranges

### Approach

Used **Multi-Source BFS**.

All initially rotten oranges are added to a queue.  
Each BFS level represents one minute.

For every rotten orange, check its four adjacent cells:

- Up
- Down
- Left
- Right

If an adjacent cell contains a fresh orange, it becomes rotten and is added to the queue.

A counter keeps track of the remaining fresh oranges.

### Complexity

- Time: `O(m × n)`
- Space: `O(m × n)`

---

## ➕ 2. Add Two Numbers

### Approach

Traverse both linked lists simultaneously while maintaining a `carry`.

For every pair of digits:

```text
sum = digit1 + digit2 + carry
