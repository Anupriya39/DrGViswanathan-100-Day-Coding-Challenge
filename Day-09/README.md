# Day 9/100 — DrGViswanathan Challenge 💻

Continuing my **100-Day Coding Challenge** with two more LeetCode problems focused on improving my DSA and problem-solving skills.

---

## 🧩 Problems Solved

### 1. Product of Array Except Self — LeetCode #238

**Difficulty:** Medium

### 💡 Approach

Used the **Prefix and Suffix Product** technique.

- First pass calculates the product of all elements before the current index.
- Second pass calculates the product of all elements after the current index.
- The prefix and suffix products are combined to get the final answer.

This approach avoids using division and works efficiently in **O(n)** time.

### ⏱️ Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(1)` extra space (excluding the output array)

---

## 2. Symmetric Tree — LeetCode #101

**Difficulty:** Easy

### 💡 Approach

Used **recursion** to check whether the binary tree is symmetric.

The left subtree is compared with the right subtree in mirror order:

- Left's left ↔ Right's right
- Left's right ↔ Right's left
- Node values must be equal

### ⏱️ Complexity

- **Time Complexity:** `O(n)`
- **Space Complexity:** `O(h)` due to recursion stack

---

## 📚 What I Learned

- Prefix and suffix techniques are useful for solving array problems efficiently.
- Recursive thinking can simplify binary tree problems.
- Comparing the right parts of a tree in the correct order is important for symmetry.
- Focusing on both **correctness and complexity** helps build better solutions.

---

## 🚀 Challenge Progress

**Day 9/100 ✔️**

**2 problems solved. 91 more to go!**

One problem at a time.  
One concept at a time.  
One day at a time. 💪

#DrGViswanathanChallenge #DrGViswanathan #100DayCodingChallenge #LeetCode #DSA #Java #ProblemSolving #CodingJourney #LearningInPublic #Consistency #Day9
