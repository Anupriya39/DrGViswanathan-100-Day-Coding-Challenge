
# Day 48 - Edit Distance

**Challenge:** #DrGViswanathan Challenge  
**Day:** 48/100  
**Platform:** LeetCode  
**Problem:** 72. Edit Distance  
**Difficulty:** Medium  
**Language:** Java  
**Topic:** Dynamic Programming

## Problem Statement

Given two strings `word1` and `word2`, find the minimum
number of operations required to convert `word1` into `word2`.

The permitted operations are:
- Insert a character
- Delete a character
- Replace a character

## Approach: Dynamic Programming

Use a 2D DP table where `dp[i][j]` represents the minimum
operations required to convert the first `i` characters of
`word1` into the first `j` characters of `word2`.

### Steps

1. Initialize the first column with `i`, since converting
   a string of length `i` into an empty string requires `i`
   deletions.
2. Initialize the first row with `j`, since converting an
   empty string into a string of length `j` requires `j`
   insertions.
3. If the current characters match, use the diagonal value:
   `dp[i][j] = dp[i-1][j-1]`.
4. Otherwise, take one plus the minimum of deletion,
   insertion, and replacement.
5. Return `dp[m][n]`.

## Complexity Analysis

- **Time Complexity:** O(m × n)
- **Space Complexity:** O(m × n)

Here, `m` and `n` are the lengths of the two strings.

## Example

**Input:**
- word1 = "horse"
- word2 = "ros"

**Output:** 3

**Explanation:**

horse -> rorse (replace 'h' with 'r')  
rorse -> rose (delete 'r')  
rose -> ros (delete 'e')

## What I Learned

- Applying Dynamic Programming to string problems.
- Breaking a complex problem into smaller subproblems.
- Understanding insertion, deletion, and replacement transitions.
- Using a DP table to calculate the minimum transformation cost.

## Progress

Day 48/100 completed!

One problem, one concept, and another step forward.
