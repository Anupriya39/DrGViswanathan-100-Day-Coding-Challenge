# Day 30 – 100 Days Coding Challenge

## #DrGViswanathan Challenge

Continuing my **100-Day Coding Challenge** by solving problems consistently and strengthening my DSA and problem-solving skills.

---

## 🟢 Problem: Binary Tree Right Side View

**Platform:** LeetCode  
**Problem:** #199  
**Difficulty:** Medium

### Problem
Given the root of a binary tree, return the values of the nodes that can be seen from the right side of the tree, ordered from top to bottom.

### Approach

Used **Breadth-First Search (BFS)** / Level Order Traversal.

1. Add the root node to a queue.
2. Process the tree level by level.
3. Store the size of the current level.
4. Traverse all nodes of that level.
5. Add the last node of the level to the answer because it is visible from the right side.
6. Add the left and right children to the queue for the next level.

### Key Idea

The **last node processed at every level** is the node visible from the right side.

### What I Learned

- How BFS works on binary trees.
- How to perform level-order traversal using a queue.
- How to identify the rightmost node at every level.
- Strengthened my understanding of binary trees and queues.

### Complexity

- **Time:** O(n)
- **Space:** O(n)

---

## 📌 Day 30 Progress

**Problems Solved:** 1  
**Challenge Progress:** 30/100  
**Remaining:** 70 problems

> One problem, one concept, and another step forward.

Continuing to learn, practice, and improve every day. 🚀

#DrGViswanathanChallenge #100DayCodingChallenge #LeetCode #DSA #Java #BinaryTree #BFS #Queue #ProblemSolving #CodingJourney
