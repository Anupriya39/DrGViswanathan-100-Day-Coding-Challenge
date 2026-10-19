
# Day 49 - 100 Days of Code

**Challenge:** #DrGViswanathan Challenge  
**Day:** 49/100  
**Platform:** LeetCode  
**Language:** Java

## Problems Solved

### 1. Sliding Window Maximum

- **LeetCode:** #239
- **Difficulty:** Hard
- **Topic:** Sliding Window, Monotonic Deque

#### Approach
Maintain a deque of array indices in decreasing order
of their corresponding values.

- Remove indices that fall outside the current window.
- Remove smaller elements from the back.
- The front of the deque gives the current window maximum.
- Store the maximum after each complete window.

**Time Complexity:** O(n)  
**Space Complexity:** O(k)

### 2. Regular Expression Matching

- **LeetCode:** #10
- **Difficulty:** Hard
- **Topic:** Dynamic Programming, String Matching

#### Approach
Use a 2D DP table where `dp[i][j]` indicates whether the
first `i` characters of the input string match the first
`j` characters of the pattern.

- `.` matches any single character.
- `*` matches zero or more occurrences of the preceding element.
- Matching characters use the diagonal DP state.
- For `*`, consider zero occurrences or another matching
  occurrence of the preceding element.

**Time Complexity:** O(m × n)  
**Space Complexity:** O(m × n)

## What I Learned

- Using a monotonic deque for efficient window maximums.
- Removing outdated indices and maintaining useful candidates.
- Designing DP states for regular expression matching.
- Handling `.` and `*` through different transitions.

## Progress

Day 49/100 completed!

Two problems, two concepts, and another step forward.

