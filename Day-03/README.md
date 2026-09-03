# Day 3 — Same Tree

**LeetCode:** #100  
**Difficulty:** Easy  
**Topic:** Binary Tree, Recursion

## 💡 Approach

Used recursion to compare both binary trees.

- If both nodes are `null` → same
- If one is `null` → different
- If values differ → different
- Otherwise, recursively compare the left and right subtrees.

## 📚 What I Learned

- Recursion makes tree comparison simpler.
- Tree problems often require checking both structure and node values.
- Breaking a problem into smaller subtrees makes it easier to solve.

## ⏱️ Complexity

**Time:** O(n)  
**Space:** O(h)
