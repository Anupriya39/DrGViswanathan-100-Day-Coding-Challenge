# 💻 [#DrGViswanathan Challenge] | Day 20/100

Continuing my 100-Day Coding Challenge by solving LeetCode problems in Java and strengthening my Data Structures and Algorithms (DSA) skills.

## 🚀 Problem Solved

### 112. Path Sum — LeetCode

* **Difficulty:** Easy
* **Topic:** Binary Tree, DFS, Recursion

### 📝 Problem Description

Given the root of a binary tree and an integer `targetSum`, determine whether the tree has a root-to-leaf path such that the sum of all node values equals `targetSum`.

### 💡 Approach

* Used recursive Depth-First Search (DFS) to traverse the binary tree.
* Subtracted the current node's value from the target sum.
* At each leaf node, checked whether its value equals the remaining target sum.
* Returned `true` if either the left or right subtree contains a valid path.

### ⏱️ Complexity Analysis

* **Time Complexity:** O(n) — Each node is visited at most once.
* **Space Complexity:** O(h) — Recursion stack, where h is the height of the tree (O(n) in the worst case).

### 🧠 Key Learnings

* Applying DFS to binary tree problems.
* Tracking the remaining sum through recursion.
* Understanding base cases and root-to-leaf path validation.

### 🛠️ Language & Tools

* Java
* LeetCode

### 📈 Challenge Progress

* Day: 20/100
* Problems Solved Today: 1
* Total Challenge Days Completed: 20

One problem, one concept, and another step forward! 💪

#100DaysOfCode #DrGViswanathanChallenge #LeetCode #Java #DSA #BinaryTree #DFS #Recursion
