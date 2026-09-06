# Day 6 – 100 Days Coding Challenge 🚀

## [#DrGViswanathan Challenge] | Day 6/100

Continuing my 100-Day Coding Challenge by solving two LeetCode problems focused on **Stack, Sorting, Intervals, and Problem-Solving**.

---

## 🧩 1. Min Stack — LeetCode #155

### Problem
Design a stack that supports:
- `push()`
- `pop()`
- `top()`
- `getMin()`

All operations should work in **O(1)** time.

### Approach
Used **two stacks**:
- `stack` → stores all elements.
- `minStack` → keeps track of the minimum element at every level.

Whenever an element is pushed, the minimum value is also updated in `minStack`.

### Complexity
- **Time:** O(1) per operation
- **Space:** O(n)

### Key Learning
Using an additional data structure can help achieve constant-time operations.

---

## 🔗 2. Merge Intervals — LeetCode #56

### Problem
Given a collection of intervals, merge all overlapping intervals.

### Approach
1. Sort intervals based on their starting value.
2. Compare the current interval with the last merged interval.
3. If they overlap, update the ending value.
4. Otherwise, add the current interval as a new interval.

### Complexity
- **Time:** O(n log n) — due to sorting
- **Space:** O(n)

### Key Learning
Sorting the input first can make interval-based problems much easier to handle.

---

## 📚 What I Learned Today

- How to use **two stacks** to maintain minimum values efficiently.
- How **sorting** simplifies interval problems.
- How to identify and handle **overlapping ranges**.
- Choosing the right data structure is often the key to an efficient solution.

---

## 💻 Problems Solved

| # | Problem | LeetCode | Topic |
|---|---------|----------|-------|
| 1 | Min Stack | #155 | Stack |
| 2 | Merge Intervals | #56 | Sorting, Intervals |

---

### 📈 Progress

**Day 6/100 ✔️**

**2 problems solved | 94 more to go! 🚀**

#DrGViswanathanChallenge #DrGViswanathan #100DayCodingChallenge #LeetCode #DSA #Java #ProblemSolving #CodingJourney
