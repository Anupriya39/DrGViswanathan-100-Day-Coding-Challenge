# 🚀 Day 33 - 100 Days of Code

## #DrGviswanathan Challenge

Continuing my **100 Days of Code Challenge** with two LeetCode Medium problems.

---

## 🧩 Problems Solved

### 1. 560. Subarray Sum Equals K

**Difficulty:** Medium  
**Platform:** LeetCode  
**Language:** Java

### Approach

Used **Prefix Sum + HashMap**.

- Maintain the current prefix sum.
- For every element, check whether `prefixSum - k` has appeared before.
- If it exists, those previous prefix sums represent subarrays whose sum is `k`.
- Store the frequency of each prefix sum in a HashMap.
- Initialize the map with `(0, 1)` to handle subarrays starting from index `0`.

### Complexity

- Time: `O(n)`
- Space: `O(n)`

---

## 🌊 2. 200. Number of Islands

**Difficulty:** Medium  
**Platform:** LeetCode  
**Language:** Java

### Approach

Used **Depth First Search (DFS)** with grid traversal.

- Traverse every cell of the grid.
- When an unvisited land cell `'1'` is found, a new island is counted.
- DFS explores all horizontally and vertically connected land cells.
- Mark visited land cells as `'0'` to avoid counting the same island again.

### Complexity

- Time: `O(m × n)`
- Space: `O(m × n)` in the worst case due to DFS recursion.

---

## 📚 What I Learned

- Prefix Sum technique
- HashMap for frequency tracking
- DFS and grid traversal
- Connected components in a grid
- Converting brute-force ideas into efficient solutions
- Choosing the right data structure for optimization

---

## 💻 Key Concepts

`Prefix Sum` `HashMap` `DFS` `Grid Traversal` `Arrays` `Recursion` `Problem Solving`

---

### 🎯 Progress

**Day 33 / 100 ✅**

Consistency > Perfection 🚀

#DrGviswanathanChallenge #100DaysOfCode #LeetCode #Java #DSA #CodingChallenge
