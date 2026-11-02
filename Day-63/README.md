# Day 63 – LeetCode 203 & 202

**[#DrGViswanathan Challenge] | 100 Days of Coding**

## Problems Solved

1. [203. Remove Linked List Elements](https://leetcode.com/problems/remove-linked-list-elements/)
2. [202. Happy Number](https://leetcode.com/problems/happy-number/)

## 1. Remove Linked List Elements

### Approach: Dummy Node

- Create a dummy node pointing to the head.
- Traverse the linked list using a current pointer.
- If the next node contains the target value, skip it.
- Otherwise, move the current pointer forward.
- Return `dummy.next`.

### Complexity
- Time: O(n)
- Space: O(1)

## 2. Happy Number

### Approach: HashSet

- Calculate the sum of the squares of the digits.
- Store each number in a HashSet.
- Repeat the process until the number becomes `1` or a repeated number is found.
- If it reaches `1`, the number is happy; otherwise, it is not.

### Complexity
- Time: O(log n) per transformation, with a bounded number of transformations.
- Space: O(k), where k is the number of distinct values stored.

## Key Learnings

- Dummy nodes simplify linked-list deletion.
- HashSet helps detect repeated states and cycles.
- Digit manipulation is useful for mathematical problems.

**Language:** Java  
**Platform:** LeetCode  
**Day:** 63/100 ✔️

Keep learning. Keep solving. Keep growing! 🚀
