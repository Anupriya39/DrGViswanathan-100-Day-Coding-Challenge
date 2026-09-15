# Day 15 - 100 Days of Code 🚀

## LeetCode Problems Solved

### 1. Remove Nth Node From End of List - LeetCode #19

**Difficulty:** Medium

### Approach

Used the **Two-Pointer technique** with a dummy node.

- Created a dummy node before the head.
- Used `slow` and `fast` pointers.
- Moved `fast` ahead by `n + 1` positions.
- Moved both pointers together until `fast` reached the end.
- Removed the target node using:
  
  `slow.next = slow.next.next`

- Returned `dummy.next` as the new head.

### Complexity

- Time: **O(n)**
- Space: **O(1)**

---

### 2. Ransom Note - LeetCode #383

**Difficulty:** Easy

### Approach

Used a **frequency array** to count the occurrence of each character.

- Counted every character present in `magazine`.
- Traversed the `ransomNote`.
- Decreased the corresponding character count.
- If any character count became negative, the ransom note could not be constructed.
- Otherwise, returned `true`.

### Complexity

- Time: **O(n + m)**
- Space: **O(1)** because the frequency array has a fixed size of 26.

---

## Key Learnings 📚

- Practiced the **Two-Pointer technique** for linked lists.
- Learned how a **dummy node** helps handle linked-list edge cases.
- Strengthened understanding of **frequency counting**.
- Improved my ability to think about **time and space complexity**.
- Continued building consistency through the **100-Day Coding Challenge**.

## Language

- Java ☕
- Data Structures & Algorithms

## Progress

**Day 15 / 100** ✅

2 problems solved today.  
Consistency over perfection. 💪

#100DaysOfCode #LeetCode #DSA #Java #ProblemSolving
