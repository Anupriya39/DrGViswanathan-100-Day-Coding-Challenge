# Day 57 – 100 Days Coding Challenge

## LeetCode Problems

### 1. Missing Number — LeetCode #268
- **Difficulty:** Easy
- **Topic:** Arrays, Mathematics
- **Approach:** Mathematical Sum Formula

**Problem:** Given an array containing distinct numbers from `0` to `n`, find the missing number.

**Approach:**
1. Calculate the expected sum using `n * (n + 1) / 2`.
2. Calculate the actual sum of all array elements.
3. Subtract the actual sum from the expected sum to obtain the missing number.

**Complexity:**
- Time: O(n)
- Space: O(1)

### 2. Middle of the Linked List — LeetCode #876
- **Difficulty:** Easy
- **Topic:** Linked List, Two Pointers
- **Approach:** Slow and Fast Pointers

**Problem:** Return the middle node of a singly linked list. If there are two middle nodes, return the second one.

**Approach:**
1. Initialize both `slow` and `fast` pointers at the head.
2. Move `slow` one step and `fast` two steps at a time.
3. When `fast` reaches the end, `slow` points to the middle node.

**Complexity:**
- Time: O(n)
- Space: O(1)

## Key Learnings
- Using mathematical properties to optimize array problems.
- Applying the two-pointer technique to linked lists.
- Improving efficiency with linear-time, constant-extra-space solutions.

## Language
Java

## Progress
**Day 57/100** — Consistency, problem-solving, and continuous learning.

#DrGViswanathanChallenge #100DaysCodingChallenge #LeetCode #Java #DSA
