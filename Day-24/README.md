# Day 24 - Kth Largest Element in an Array

**LeetCode Problem:** [215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)

**Difficulty:** Medium

**Language:** Java

## Problem Statement

Given an integer array `nums` and an integer `k`, return the kth largest element in the array.

## Approach: Min Heap (PriorityQueue)

* Use a Min Heap to store the k largest elements.
* Insert each array element into the PriorityQueue.
* If the heap size exceeds k, remove the smallest element.
* After processing all elements, the heap's top element is the kth largest.

## Complexity Analysis

* **Time Complexity:** O(n log k)
* **Space Complexity:** O(k)

Where n is the number of elements in the array and k is the given rank.

## Key Learnings

* Using Java's PriorityQueue as a Min Heap.
* Finding kth largest elements without sorting the entire array.
* Applying heap-based optimization to array problems.

## Status

Accepted on LeetCode ✅

Part of my #DrGViswanathanChallenge 100-Day Coding Challenge.

Day 24/100 🚀
