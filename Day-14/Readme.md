# Day 14 – Search in Rotated Sorted Array

Continuing my **100-Day Coding Challenge** with another LeetCode problem in Java. 💻

## 🧩 Problem Solved

### Search in Rotated Sorted Array – LeetCode #33

Given a rotated sorted array and a target value, find the index of the target. If the target does not exist, return `-1`.

## 💡 Approach

Used a modified **Binary Search** approach.

At every step:

1. Find the middle element.
2. Check if the target is equal to the middle element.
3. Identify which half of the array is sorted.
4. Check whether the target lies within the sorted half.
5. Eliminate the unnecessary half and continue searching.

This allows the search space to be reduced by half at every step.

## ⏱️ Complexity

- **Time Complexity:** `O(log n)`
- **Space Complexity:** `O(1)`

## 📚 What I Learned

- Binary Search can be modified for rotated sorted arrays.
- Identifying the sorted half is the key to solving this problem efficiently.
- Reducing the search space helps achieve better time complexity.
- Understanding the logic behind an algorithm is more important than memorizing the code.

## 🛠️ Language Used

**Java**

## 🚀 Challenge Progress

**Day 14 / 100 ✔️**

**1 problem solved. 89 more to go!**

> Consistency over perfection. Keep solving, keep learning, keep improving. 💪

## 📂 File

- `SearchInRotatedSortedArray.java`
