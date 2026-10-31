# Day 61/100 — Dr. G. Viswanathan Coding Challenge

Solved two LeetCode problems using Java, focusing on mathematical operations, linked-list manipulation, and two-pointer techniques.

## Problems Solved

### 1. Palindrome Number — LeetCode #9

**Difficulty:** Easy  
**Topics:** Math, Number Manipulation

**Approach:**
- Return `false` if the number is negative.
- Extract the last digit using `% 10`.
- Build the reversed number using `reversed = reversed * 10 + digit`.
- Remove the last digit using `/ 10`.
- Compare the reversed number with the original.

**Example:**
```text
Input: x = 121
Output: true
```

**Complexity:**
- Time: O(log n)
- Space: O(1)

### 2. Palindrome Linked List — LeetCode #234

**Difficulty:** Easy  
**Topics:** Linked List, Two Pointers

**Approach:**
- Use slow and fast pointers to find the middle of the linked list.
- Skip the middle node if the list has an odd number of nodes.
- Reverse the second half of the linked list.
- Compare the first half with the reversed second half.
- Return `true` if all corresponding values match.

**Example:**
```text
Input: head = [1,2,2,1]
Output: true
```

**Complexity:**
- Time: O(n)
- Auxiliary Space: O(1)

## Key Learnings

- Reversing digits using mathematical operations.
- Applying the slow and fast pointer technique.
- Reversing a linked list in-place.
- Comparing linked-list halves to identify palindromes.
- Improving space efficiency through pointer manipulation.

## Language
Java

## Challenge Progress
**Day 61/100 Completed** ✅

Consistency, practice, and progress — one day at a time!

#DrGViswanathanChallenge #100DayCodingChallenge #LeetCode #Java #DSA
