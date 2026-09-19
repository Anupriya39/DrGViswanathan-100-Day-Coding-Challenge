# 💻 [#DrGViswanathan Challenge] | Day 19/100

Continuing my 100-Day Coding Challenge by solving two LeetCode problems in Java, focusing on DFS and Dynamic Programming.

## 🚀 Problems Solved

### 1. Flood Fill — LeetCode #733

**Difficulty:** Easy

**Topic:** DFS, Recursion, Matrix

**Approach:**

* Used Depth-First Search (DFS) to explore adjacent pixels.
* Changed the color of connected pixels matching the original color.
* Added boundary and color checks to prevent invalid traversal and infinite recursion.

**Time Complexity:** O(m × n) — In the worst case, every pixel is visited.

**Space Complexity:** O(m × n) — Recursion stack in the worst case.

### 2. Unique Paths — LeetCode #62

**Difficulty:** Medium

**Topic:** Dynamic Programming (DP)

**Approach:**

* Used a 2D DP array to store the number of ways to reach each cell.
* Initialized the first row and column with 1, as there is only one way to reach them.
* Calculated each cell using `dp[i][j] = dp[i-1][j] + dp[i][j-1]`.

**Time Complexity:** O(m × n) — Each cell is calculated once.

**Space Complexity:** O(m × n) — Used a 2D DP array.

## 🧠 Key Learnings

* Applying DFS to explore connected pixels in a grid.
* Using recursion with boundary conditions.
* Understanding Dynamic Programming and state transitions.
* Solving grid problems by breaking them into smaller subproblems.

## 🛠️ Language & Tools

* Java
* LeetCode

## 📈 Challenge Progress

* Day: 19/100
* Problems Solved Today: 2
* Total Challenge Days Completed: 19

One problem, one concept, and another step forward! 💪

#100DaysOfCode #DrGViswanathanChallenge #LeetCode #Java #DSA #DFS #DynamicProgramming #CodingJourney
