# Day 31 - 100 Days Coding Challenge

[#DrGViswanathan Challenge] | Day 31/100

Continuing my 100-Day Coding Challenge by solving two more DSA problems in Java.

## Problems Solved

### 1. Task Scheduler - LeetCode #621

**Approach:**
- Count the frequency of each task using an array.
- Find the task with the maximum frequency.
- Calculate the minimum intervals required considering the cooldown period.
- Account for tasks having the same maximum frequency.

**Key Concept:**
Frequency Counting / Greedy Approach

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### 2. Find the Duplicate Number - LeetCode #287

**Approach:**
- Treat the array as a linked structure where each value points to another index.
- Use Floyd's Cycle Detection Algorithm.
- Move `slow` one step and `fast` two steps until they meet.
- Reset `slow` to the beginning and move both pointers one step at a time.
- Their meeting point is the duplicate number.

**Key Concept:**
Floyd's Cycle Detection / Two Pointers

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

## What I Learned

- Frequency counting can simplify scheduling problems.
- Cooldown constraints can be handled using a mathematical/greedy approach.
- Learned how Floyd's Cycle Detection Algorithm works.
- Practiced solving a problem without modifying the input array.
- Strengthened my understanding of two-pointer techniques.

## Language

Java

## Challenge Progress

**Day 31/100 ✔️**

2 problems solved today.

> One problem, one concept, and another step forward.
