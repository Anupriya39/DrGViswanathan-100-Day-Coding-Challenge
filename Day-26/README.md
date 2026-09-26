# Day 26 - Construct Binary Tree from Preorder and Inorder Traversal

**LeetCode Problem:** #105  
**Difficulty:** Medium  
**Language:** Java

## Approach

Used a HashMap to store the index of each element in the inorder traversal.

- The first element of preorder is the root.
- Find the root's position in inorder using the HashMap.
- Elements on the left form the left subtree.
- Elements on the right form the right subtree.
- Recursively construct both subtrees.

## Complexity

- Time Complexity: O(n)
- Space Complexity: O(n)

## Key Learnings

- Learned how preorder and inorder traversals can reconstruct a binary tree.
- Practiced recursion for tree construction.
- Learned how HashMap can optimize index searching.

## Status

Accepted on LeetCode ✅

**Day 26/100 ✔️**

#DrGViswanathanChallenge #LeetCode #DSA #Java #BinaryTree #Recursion
