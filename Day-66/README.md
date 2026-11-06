# Day 66 – 100 Days of Coding Challenge

## LeetCode Problem

**Excel Sheet Column Number — [LeetCode #171](https://leetcode.com/problems/excel-sheet-column-number/)**

- Difficulty: Easy
- Topic: String, Math
- Language: Java

## Approach: Base-26 Conversion

Excel column titles follow a base-26 numbering system where:

A = 1, B = 2, ..., Z = 26

Unlike a conventional base-26 system, the digits range from 1 to 26.

### Algorithm

1. Initialize `result = 0`.
2. Traverse the string from left to right.
3. Convert each character into its numerical value using `columnTitle.charAt(i) - 'A' + 1`.
4. Update the result using `result = result * 26 + value`.
5. Return the final result.

### Example

Input: `AB`

- A = 1 → result = 1
- B = 2 → result = 1 × 26 + 2 = 28

Output: `28`

## Complexity Analysis

- Time Complexity: O(n), where n is the length of the string.
- Space Complexity: O(1), using constant extra space.

## What I Learned

- Base-26 number conversion.
- Positional number systems.
- Character-to-integer conversion.
- Efficient string traversal.

## Challenge Progress

Day 66 / 100 ✔️

Consistency is the key to mastering DSA! 🚀
