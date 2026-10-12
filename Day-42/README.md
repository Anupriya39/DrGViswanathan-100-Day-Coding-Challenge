# Day 42 | Dr. G. Viswanathan 100-Day Coding Challenge

This repository contains my Java solution for LeetCode Problem #11, completed as part of my 100-Day Coding Challenge.

## Problem: Container With Most Water

- **LeetCode:** #11
- **Difficulty:** Medium
- **Topics:** Array, Two Pointers, Greedy
- **Language:** Java
- **Problem Link:** https://leetcode.com/problems/container-with-most-water/

## Approach

1. Initialize two pointers: `left` at the beginning and `right` at the end of the array.
2. Calculate the width using `right - left`.
3. Calculate the height using the minimum of `height[left]` and `height[right]`.
4. Update the maximum area found so far.
5. Move the pointer with the smaller height inward.
6. Repeat until the two pointers meet.

## Complexity Analysis

- **Time Complexity:** O(n) — Each pointer moves through the array at most once.
- **Space Complexity:** O(1) — Only a constant amount of extra space is used.

## What I Learned

- How the Two Pointers technique improves efficiency.
- Why the smaller-height pointer should move inward.
- How to optimize a brute-force approach from O(n²) to O(n).

## Challenge Progress

**Day 42 / 100** — One problem, one concept, and another step forward.

#LeetCode #Java #DSA #TwoPointers #100DaysOfCode
