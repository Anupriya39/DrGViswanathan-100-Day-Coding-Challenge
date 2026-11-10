# Day 70 – Factorial Trailing Zeroes

**LeetCode Problem:** [172. Factorial Trailing Zeroes](https://leetcode.com/problems/factorial-trailing-zeroes/)

**Difficulty:** Medium  
**Language:** Java  
**Topic:** Mathematics, Number Theory

## Problem Description

Given an integer `n`, return the number of trailing zeroes in `n!`.

A trailing zero is formed by multiplying 2 and 5. Since factorials contain more factors of 2 than factors of 5, we only need to count the number of factors of 5.

## Approach – Mathematical Observation

1. A trailing zero is formed by a pair of 2 and 5.
2. In a factorial, factors of 2 are always more frequent than factors of 5.
3. Count the multiples of 5 by dividing `n` by 5.
4. Divide again by 5 to count additional factors from multiples of 25, 125, and so on.
5. Add all the quotients to get the total number of trailing zeroes.

## Java Solution

```java
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;

        while (n > 0) {
            n /= 5;
            count += n;
        }

        return count;
    }
}
```

## Example

**Input:** `n = 25`

- 25 / 5 = 5
- 5 / 5 = 1
- 1 / 5 = 0

Total = 5 + 1 = 6

**Output:** `6`

## Complexity Analysis

- **Time Complexity:** O(log₅ n) – Repeatedly divides n by 5.
- **Space Complexity:** O(1) – Uses only a constant amount of extra space.

## Key Learnings

- Understanding how factors of 2 and 5 form trailing zeroes.
- Applying mathematical observations to optimize solutions.
- Counting factors efficiently without calculating factorials.
- Improving number theory and problem-solving skills.

## Submission Status

- Accepted: 500/500 test cases
- Runtime: 1 ms

**Day 70/100 – Keep learning, keep growing!** 🚀
