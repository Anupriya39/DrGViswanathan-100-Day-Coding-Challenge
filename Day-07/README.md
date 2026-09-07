# Day 7/100 — DrGViswanathan Challenge 💻

Continuing my **100-Day Coding Challenge** with two more LeetCode problems focused on improving problem-solving and algorithmic thinking.

## 🧩 Problems Solved

### 1. Maximum Depth of Binary Tree — LeetCode #104

**Approach:**  
Used **recursion (DFS)** to calculate the depth of the left and right subtrees.  
For every node, the depth is:

`1 + max(leftDepth, rightDepth)`

**What I learned:**
- How recursion can simplify tree problems.
- Breaking a problem into smaller subtrees.
- Finding the maximum depth using DFS.

**Complexity:**
- Time: `O(n)`
- Space: `O(h)` — recursion stack, where `h` is the tree height.

---

### 2. Maximum Subarray — LeetCode #53

**Approach:**  
Used **Kadane's Algorithm** to keep track of the current subarray sum and the maximum sum found so far.

At every element, I decide whether to:
- Start a new subarray, or
- Extend the current subarray.

**What I learned:**
- How Kadane's Algorithm solves maximum subarray problems efficiently.
- How to make a decision at every element using previous results.
- Converting an `O(n²)` brute-force idea into an `O(n)` solution.

**Complexity:**
- Time: `O(n)`
- Space: `O(1)`

---

## 📚 Key Learnings

- Recursion is powerful for solving tree-based problems.
- Kadane's Algorithm is an important pattern for array problems.
- Choosing the right approach can significantly improve efficiency.
- Consistent practice is helping me understand the **logic behind the solution**, not just the code.

## 🚀 Progress

**Day 7/100 ✔️**

**2 problems solved. 93 more to go!**

Continuing to learn, practice, and improve one problem at a time. 💪

#DrGViswanathanChallenge #DrGViswanathan #100DayCodingChallenge #LeetCode #DSA #Java #ProblemSolving #CodingJourney #LearningInPublic #Consistency #Day7
