# Day 10 – Two Sum II: Input Array Is Sorted

## LeetCode Problem
**Problem:** 167. Two Sum II - Input Array Is Sorted  
**Difficulty:** Medium  
**Language:** Java

## Problem Description

Given a 1-indexed array of integers `numbers` that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target.

Return the indices of the two numbers, where the indices are increased by one.

You may not use the same element twice, and the solution must use only constant extra space.

## Approach

I used the **Two Pointer technique**.

- Start one pointer at the beginning of the array (`left`).
- Start another pointer at the end (`right`).
- Calculate the sum of the two elements.
- If the sum equals the target, return their 1-based indices.
- If the sum is smaller than the target, move `left` forward.
- If the sum is larger than the target, move `right` backward.

Because the array is already sorted, this approach efficiently finds the required pair without using extra data structures.

## Example

### Input
```text
numbers = [2,7,11,15]
target = 9
