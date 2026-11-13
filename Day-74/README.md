# Day 74 – Reverse Integer

**LeetCode Problem:** [7. Reverse Integer](https://leetcode.com/problems/reverse-integer/)

**Difficulty:** Medium  
**Language:** Java  
**Topic:** Mathematics, Digit Manipulation

## Problem Statement
Given a signed 32-bit integer `x`, reverse its digits. If the reversed integer goes outside the signed 32-bit integer range, return `0`.

## Approach – Mathematical Method

1. Initialize `rev = 0` to store the reversed number.
2. Extract the last digit using `x % 10`.
3. Check for integer overflow before updating the reversed number.
4. Append the digit using `rev = rev * 10 + digit`.
5. Remove the last digit using `x = x / 10`.
6. Return the reversed integer.

## Java Solution

```java
class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;

            // Check for integer overflow
            if (rev > Integer.MAX_VALUE / 10 ||
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
            x /= 10;
        }

        return rev;
    }
}
```

## Complexity Analysis

- **Time Complexity:** O(log |x|) – Each iteration processes one digit.
- **Space Complexity:** O(1) – Uses only constant extra space.

## Key Learnings
- Digit extraction and manipulation.
- Handling negative integers.
- Integer overflow and boundary conditions.
- Optimizing mathematical operations.

**Status:** Accepted – All 1046 test cases passed.

**Day 74/100 – Consistency is the key to progress!**
