# Day 32 - 100 Days Coding Challenge

[#DrGViswanathan Challenge] | Day 32/100

Continuing my 100-Day Coding Challenge by solving another Binary Tree problem in Java.

## Problem Solved

### Flatten Binary Tree to Linked List - LeetCode #114

Given the root of a binary tree, flatten the tree into a linked list in-place.

The linked list should follow the same order as a preorder traversal.

## Approach

1. Recursively flatten the left subtree.
2. Recursively flatten the right subtree.
3. Store the already-flattened right subtree.
4. Move the flattened left subtree to the right.
5. Set the left pointer to `null`.
6. Traverse to the end of the new right subtree.
7. Attach the original right subtree at the end.

## Key Concept

- Binary Tree
- Recursion
- Preorder Traversal
- In-place Tree Manipulation
- Pointer Re-arrangement

## Example

Input:

```text
        1
       / \
      2   5
     / \   \
    3   4   6
