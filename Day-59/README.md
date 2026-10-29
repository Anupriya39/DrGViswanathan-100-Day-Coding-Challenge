# Day 59/100 — Dr. G. Viswanathan Coding Challenge

Solutions to two LeetCode problems in Java, focusing on mathematical reasoning and linked-list manipulation.

## Problems Solved

### 1. Perfect Number — LeetCode #507

**Difficulty:** Easy  
**Topic:** Math, Number Theory

**Approach:**
- Return `false` for numbers less than or equal to 1.
- Initialize the sum of proper divisors to 1.
- Check divisors from 2 through `num / i`.
- When a divisor is found, add both the divisor and its paired divisor, avoiding double-counting perfect squares.
- Return `true` if the sum equals the original number.

**Example:**
```text
Input: num = 28
Output: true
Explanation: 1 + 2 + 4 + 7 + 14 = 28
```

**Complexity:**
- Time: O(√n), if divisor pairs are checked only up to the square root.
- Space: O(1).

### 2. Merge Two Sorted Lists — LeetCode #21

**Difficulty:** Easy  
**Topic:** Linked List, Two Pointers

**Approach:**
- Create a dummy node to simplify the merged list's construction.
- Use a pointer to compare the current nodes of both lists.
- Attach the smaller node to the merged list and advance its pointer.
- Append the remaining nodes when one list becomes empty.
- Return `dummy.next` as the merged list's head.

**Example:**
```text
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
```

**Complexity:**
- Time: O(m + n), where m and n are the lengths of the two lists.
- Auxiliary space: O(1) when existing nodes are reused.

## Key Learnings

- Finding divisors efficiently using divisor pairs.
- Handling edge cases in mathematical problems.
- Using dummy nodes and two pointers for linked-list operations.
- Maintaining sorted order while merging lists.

## Language
Java

## Challenge Progress
**Day 59/100 completed** ✅

Consistency, practice, and progress — one day at a time!

#DrGViswanathanChallenge #100DayCodingChallenge #LeetCode #Java #DSA
