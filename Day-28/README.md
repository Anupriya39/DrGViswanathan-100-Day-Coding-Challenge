# Day 28 - 100 Days Coding Challenge

## #DrGViswanathan Challenge

Continuing my 100-Day Coding Challenge by solving LeetCode problems and strengthening my DSA skills using Java.

---

## Find Smallest Letter Greater Than Target

**LeetCode:** #744  
**Difficulty:** Easy

### Problem
Given a sorted array of characters and a target character, find the smallest character that is lexicographically greater than the target.

If no such character exists, return the first character in the array.

### Approach

Used **Binary Search** to efficiently find the first character strictly greater than the target.

- Set `left` at the beginning and `right` at the end.
- Find the middle element.
- If `letters[mid] <= target`, move `left` to `mid + 1`.
- Otherwise, move `right` to `mid - 1`.
- After the search, use `left % letters.length` to handle the wrap-around case.

### Complexity

- **Time:** O(log n)
- **Space:** O(1)

### Key Learning

- Learned how Binary Search can be applied to character arrays.
- Understood how to find the first element satisfying a condition.
- Learned how to handle boundary and wrap-around cases.
- Strengthened my understanding of efficient searching.

---

## Progress

**Day 28 / 100 ✅**

**1 Problem Solved**

> One problem, one concept, and another step forward.
> Staying consistent, learning, and improving every day! 🚀

---

### Topics Covered

`Binary Search` `Arrays` `Searching` `Java` `DSA` `Problem Solving`
