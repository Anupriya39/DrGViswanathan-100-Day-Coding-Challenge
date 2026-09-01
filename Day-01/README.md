# Day 1 — Two Sum

**LeetCode:** #1  
**Difficulty:** Easy  
**Topic:** Array, HashMap

## 🧩 Problem

Given an array of integers `nums` and an integer `target`, return the indices of the two numbers such that they add up to the target.

## 💡 Approach

I first considered the brute-force approach, where every possible pair is checked.

However, this takes O(n²) time.

To optimize the solution, I used a HashMap.

For each element, I calculate:

`complement = target - nums[i]`

Then I check whether the complement already exists in the HashMap.

- If it exists → the required pair is found.
- If it doesn't exist → store the current number and its index.

## ⏱️ Complexity

**Time Complexity:** O(n)

**Space Complexity:** O(n)

## 📚 What I Learned

- How HashMap can optimize an array problem.
- How to use the complement technique.
- How an O(n²) brute-force solution can be optimized to O(n).
- Choosing the right data structure can make a significant difference.

## 🔗 LeetCode

Problem: Two Sum
