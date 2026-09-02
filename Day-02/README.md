# Day 2 — LeetCode

## 1. Remove Linked List Elements — #203

**Difficulty:** Easy  
**Topic:** Linked List

### Approach
Used a dummy node to handle cases where the head itself needs to be removed. Traversed the list and skipped nodes whose value matched `val`.

### Complexity
- Time: O(n)
- Space: O(1)

### What I Learned
Dummy nodes make linked-list problems easier to handle, especially when the head node may need to be removed.

---

## 2. Group Anagrams — #49

**Difficulty:** Medium  
**Topic:** HashMap, Strings

### Approach
Converted each string into a character array, sorted it, and used the sorted string as the HashMap key. Anagrams produce the same key and are therefore grouped together.

### Complexity
- Time: O(n × k log k)
- Space: O(n × k)

### What I Learned
Choosing the right key and data structure can make grouping problems much simpler.
