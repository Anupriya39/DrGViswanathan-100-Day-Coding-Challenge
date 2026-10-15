# Day 45 — 100 Days of Coding Challenge

Two LeetCode problems solved using Java.

## 1. Non-Overlapping Intervals — #435

- **Difficulty:** Medium
- **Topics:** Greedy, Sorting, Arrays
- **Approach:** Sort intervals by ending time. Keep the interval that finishes earliest and remove each subsequent interval whose start is less than the previous kept interval's end.
- **Time Complexity:** O(n log n)
- **Space Complexity:** Depends on the sorting implementation.

## 2. Median of Two Sorted Arrays — #4

- **Difficulty:** Hard
- **Topics:** Binary Search, Arrays
- **Approach:** Apply binary search to the smaller array to find a valid partition of both arrays. Use the partition boundaries to calculate the median without merging the arrays.
- **Time Complexity:** O(log(min(m, n)))
- **Space Complexity:** O(1)

## Key Learnings

- Applied greedy selection to interval scheduling.
- Practiced binary search on sorted arrays.
- Learned how partition boundaries help find a median efficiently.
- Strengthened algorithmic thinking and complexity analysis.

## Challenge Progress

**Day 45/100 — Two problems solved.**

Consistency, practice, and progress — one day at a time!

#DrGViswanathanChallenge #100DaysOfCoding #LeetCode #DSA #Java
