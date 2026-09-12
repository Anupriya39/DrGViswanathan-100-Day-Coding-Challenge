# Day 12 – Diameter of Binary Tree

## LeetCode #543

### Problem
Given the root of a binary tree, return the length of the diameter of the tree.

The diameter is the length of the longest path between any two nodes in the binary tree. The path may or may not pass through the root.

---

## Approach

I used a recursive approach based on calculating the height of each subtree.

For every node:

1. Calculate the height of the left subtree.
2. Calculate the height of the right subtree.
3. The diameter passing through the current node is:
   
   `leftHeight + rightHeight`

4. Update the maximum diameter.
5. Return the height of the current node:

   `1 + max(leftHeight, rightHeight)`

This allows us to calculate the height and diameter in a single traversal.

---

## Example

### Input
```text
root = [1,2,3,4,5]
