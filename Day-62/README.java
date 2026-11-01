# LeetCode 367 – Valid Perfect Square

**Day 62/100 | #DrGViswanathan Challenge**

## Problem
Given a positive integer `num`, determine whether it is a perfect square without using built-in square root functions.

## Approach: Binary Search
- Initialize the search range from `1` to `num`.
- Calculate the middle value.
- Compute its square using `long` to prevent integer overflow.
- If the square equals `num`, return `true`.
- If the square is smaller, search the right half.
- Otherwise, search the left half.
- If no match is found, return `false`.

## Java Solution

```java
class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;

            if (square == num) {
                return true;
            } else if (square < num) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return false;
    }
}
```

## Complexity Analysis
- **Time Complexity:** O(log n)
- **Space Complexity:** O(1)

## Key Learning
Binary Search can be applied to mathematical problems by searching over a range of possible answers. Using `long` prevents overflow while calculating squares.

**Language:** Java  
**Platform:** LeetCode  
**Problem:** [367. Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/)

Day 62/100 ✔️  
Keep learning. Keep solving. Keep growing! 🚀
