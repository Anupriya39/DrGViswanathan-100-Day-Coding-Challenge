# Day 51/100 — LeetCode DSA Challenge

**[#DrGViswanathan Challenge]**

## Problems Solved

### 1. Design Twitter — LeetCode #355
- **Difficulty:** Medium
- **Topics:** HashMap, HashSet, Priority Queue
- **Approach:** Store tweets with timestamps, manage follow relationships, and use a max-heap to retrieve the 10 most recent tweets.
- **Learning:** Designing a data structure that supports posting, following, unfollowing, and retrieving a news feed.

### 2. Count of Smaller Numbers After Self — LeetCode #315
- **Difficulty:** Hard
- **Topics:** Binary Indexed Tree (Fenwick Tree), Prefix Sum
- **Approach:** Traverse the array from right to left. Query the Fenwick Tree to count previously processed values smaller than the current value, then update the tree.
- **Learning:** Efficient prefix-sum queries and updates using a Fenwick Tree.

## Complexity Analysis

| Problem | Time Complexity | Auxiliary Space |
|---|---|---|
| Design Twitter | Depends on the number of stored tweets and followed users | Depends on stored tweets and follow relationships |
| Count of Smaller Numbers After Self | O(n log M) | O(M) |

For the Fenwick Tree solution, `M` is the size of the value-index range.

## Key Takeaways
- Choosing appropriate data structures for different operations.
- Using timestamps and heaps to retrieve recent items.
- Applying Fenwick Trees to optimize counting queries.
- Improving algorithmic thinking and complexity analysis.

## Progress

**Day 51/100 completed! ✔️**

Continuing the journey with consistency, practice, and one new learning at a time.

#DrGViswanathanChallenge #100DayCodingChallenge #LeetCode #Java #DSA #ProblemSolving
