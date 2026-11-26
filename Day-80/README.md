# Day 80 – #DrGViswanathan Challenge

Continuing my **100 Days of Coding Challenge** by solving LeetCode problems using Java.

## Problem Solved

### Valid Parentheses – LeetCode #20

- **Difficulty:** Easy
- **Topic:** Stack
- **Language:** Java
- **Status:** Accepted (103/103 test cases passed)

## Approach

1. Initialize a Stack to store opening brackets.
2. Traverse the string character by character.
3. Push opening brackets `(`, `{`, `[` onto the stack.
4. For closing brackets, check whether the stack is empty.
5. Pop the top element and verify whether it matches the closing bracket.
6. Finally, return true if the stack is empty; otherwise, return false.

## Complexity Analysis

- **Time Complexity:** O(n) – Each character is processed once.
- **Space Complexity:** O(n) – Stack may store up to n opening brackets.

## Key Learnings

- Understanding the LIFO principle.
- Using Stack for bracket matching.
- Handling nested parentheses.
- Checking valid opening and closing pairs.
- Improving logical problem-solving skills.

## Progress

**Day 80 / 100** ✔️

Consistency is the key to success!

#DrGViswanathanChallenge #100DaysOfCode #LeetCode #Java #DSA
