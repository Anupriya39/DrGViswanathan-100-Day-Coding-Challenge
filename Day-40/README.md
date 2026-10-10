# Day 40 — Serialize and Deserialize Binary Tree

**LeetCode:** #297 — Hard  
**Language:** Java  
**Topic:** Binary Trees, Recursion, Serialization and Deserialization

## Problem

Design an algorithm to convert a binary tree into a string and reconstruct the original tree from that string.

## Approach

1. **Serialization:** Traverse the tree and store each node's value in a string. Include null markers to preserve the original structure.
2. **Deserialization:** Read the serialized data and rebuild the tree, restoring each node's left and right children.
3. Ensure the reconstructed tree matches the original tree.

## Complexity

For a traversal-based solution that processes every node once:

- **Time:** O(n) for serialization and O(n) for deserialization.
- **Space:** O(n) for the serialized data and the reconstructed tree, excluding implementation-dependent auxiliary space.

Here, `n` is the number of nodes in the tree.

## Key Learnings

- Converting a binary tree into a storable string representation.
- Reconstructing a tree while preserving its structure.
- Handling null nodes correctly.
- Applying recursion and tree traversal to data representation problems.

## Challenge Progress

**Day 40/100 — Completed**

Consistency, one problem at a time!
