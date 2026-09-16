# Day- 16 - 100 Days of Code 🚀

## LeetCode #235 - Lowest Common Ancestor of a Binary Search Tree

**Difficulty:** Medium

### Problem

Given a Binary Search Tree (BST), find the lowest common ancestor (LCA) of two given nodes.

### Approach

Used the **Binary Search Tree property** to find the LCA efficiently.

- If both `p` and `q` are smaller than the current node, move to the left subtree.
- If both `p` and `q` are larger than the current node, move to the right subtree.
- Otherwise, the current node is the Lowest Common Ancestor.
- The same logic also handles the case where the current node is equal to `p` or `q`.

### Complexity

- Time: **O(h)**, where `h` is the height of the BST.
- Space: **O(1)** using iterative traversal.

### Key Learnings 📚

- Practiced Binary Search Tree traversal.
- Learned how BST ordering can reduce unnecessary searching.
- Strengthened understanding of Lowest Common Ancestor problems.
- Learned to use iterative logic to achieve constant extra space.
- Improved problem-solving using the properties of data structures.

## Language

- Java ☕

## Progress

**Day 16 / 100** ✅

1 problem solved today.

Consistency over perfection. 💪

#100DaysOfCode #LeetCode #DSA #Java #ProblemSolving
