
# Day 55 – Sudoku Solver & N-Queens

Part of my **#DrGViswanathan Challenge** — 100 Days of Coding.

## Problems Solved

### 1. Sudoku Solver – LeetCode #37

- **Difficulty:** Hard
- **Language:** Java
- **Approach:** Backtracking

**Problem:** Fill the empty cells of a 9×9 Sudoku board so that each row, column, and 3×3 sub-box contains the digits 1–9 exactly once.

**Approach:**
1. Traverse the board to find an empty cell.
2. Try digits from `'1'` to `'9'`.
3. Check whether each digit is valid in the row, column, and 3×3 box.
4. Place a valid digit and recursively solve the remaining board.
5. If the choice fails, undo it and try another digit.

**Complexity:**
- Time: Exponential in the worst case.
- Auxiliary space: O(1) for the fixed-size board, excluding the recursion stack.

---

### 2. N-Queens – LeetCode #51

- **Difficulty:** Hard
- **Language:** Java
- **Approach:** Backtracking with column and diagonal tracking

**Problem:** Place `n` queens on an `n × n` chessboard so that no two queens attack each other. Return all valid board configurations.

**Approach:**
1. Place one queen in each row.
2. Check whether the column and both diagonals are safe.
3. Use boolean arrays to track occupied columns and diagonals efficiently.
4. Recursively place queens in subsequent rows.
5. Backtrack by removing the queen when a placement does not lead to a solution.

**Complexity:**
- Time: O(N!) upper bound for the backtracking search.
- Auxiliary space: O(N) for tracking arrays and recursion, excluding stored solutions.

---

## Key Learnings

- Understanding recursion and backtracking.
- Validating constraints before making a choice.
- Undoing decisions when a solution path fails.
- Optimizing conflict checks using boolean arrays.
- Strengthening problem-solving skills through Hard-level DSA problems.

## Tech Stack

- Java
- Data Structures and Algorithms
- Recursion and Backtracking

## Challenge Progress

**Day 55 / 100** — More than halfway there!

One day, one step, one improvement at a time. 🚀

#DrGViswanathanChallenge #100DaysOfCode #LeetCode #Java #DSA #Backtracking #ProblemSolving



