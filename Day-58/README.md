# Day 58 – 100 Days Coding Challenge

## LeetCode #258: Add Digits

- **Difficulty:** Easy
- **Topic:** Math, Simulation
- **Language:** Java
- **Approach:** Iterative Digit Sum

### Problem
Given an integer `num`, repeatedly add all its digits until the result contains only one digit, then return it.

### Approach
1. Run a loop while `num >= 10`.
2. Initialize `sum = 0` for each iteration.
3. Extract the last digit using `num % 10` and add it to `sum`.
4. Remove the last digit using `num /= 10`.
5. Set `num = sum` and repeat until a single digit remains.

### Example
**Input:** `num = 38`

- `3 + 8 = 11`
- `1 + 1 = 2`

**Output:** `2`

### Complexity Analysis
- **Time Complexity:** O(log n) for each digit-summing pass; repeated passes are needed until one digit remains.
- **Space Complexity:** O(1), as only a few variables are used.

### Key Learnings
- Extracting digits using modulo (`%`) and integer division (`/`).
- Applying loops to repeatedly transform a number.
- Handling zero and single-digit inputs.

## Challenge Progress
**Day 58/100** — Building consistency through daily problem-solving.

#DrGViswanathanChallenge #100DaysCodingChallenge #LeetCode #Java #DSA
