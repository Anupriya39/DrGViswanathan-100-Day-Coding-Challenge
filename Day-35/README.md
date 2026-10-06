# 🚀 Day 35 - 100 Days of Code

## #DrGViswanathan Challenge

Continuing my **100 Days of Code Challenge** with two LeetCode Medium problems focused on **DFS, Grid Traversal, Graphs, and Sliding Window**.

---

## 🧩 Problems Solved

### 1. 417. Pacific Atlantic Water Flow

**Difficulty:** Medium  
**Language:** Java  
**Concept:** DFS / Graph Traversal / Matrix

### Approach

Instead of starting from every cell and checking whether water can reach both oceans, I used a **reverse DFS approach**.

- Start DFS from all cells bordering the Pacific Ocean.
- Start another DFS from all cells bordering the Atlantic Ocean.
- While moving inward, only visit a neighboring cell whose height is **greater than or equal to** the current cell.
- A cell that is reachable from both oceans can flow to both oceans.
- Add all such cells to the result.

### Complexity

- Time: `O(m × n)`
- Space: `O(m × n)`

---

## 🧩 2. 438. Find All Anagrams in a String

**Difficulty:** Medium  
**Language:** Java  
**Concept:** Sliding Window / Frequency Array

### Approach

Used the **Sliding Window technique** with character frequency counts.

- Store the frequency of characters in `p`.
- Maintain a window of size `p.length()` in `s`.
- Add the new character entering the window.
- Remove the character leaving the window.
- When the frequency counts match, the current window is an anagram of `p`.
- Store the starting index of that window.

### Complexity

- Time: `O(n)`
- Space: `O(1)` because only 26 lowercase English letters are used.

---

## 📚 What I Learned

- Reverse DFS for grid and graph problems
- Boundary-based traversal
- Managing visited states efficiently
- Sliding Window technique
- Character frequency counting
- Optimizing brute-force solutions

---

## 🎯 Progress

**Day 35 / 100 ✅**

Consistency > Perfection 🚀

#DrGViswanathanChallenge #100DaysOfCode #LeetCode #Java #DSA #DFS #Graph #SlidingWindow #ProblemSolving
