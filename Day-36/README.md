# 🚀 100 Days Coding Challenge

## Day 36 — Clone Graph

**LeetCode #133 | Medium**

### 📌 Problem

Given a reference to a node in a connected undirected graph, return a deep copy (clone) of the graph.

Each node contains:
- An integer value
- A list of neighboring nodes

---

## 💡 Approach

I used **Breadth-First Search (BFS)** along with a **HashMap**.

### Steps:

1. If the given node is `null`, return `null`.
2. Create a HashMap to store:
   
   `Original Node → Cloned Node`

3. Clone the starting node and add it to the queue.
4. Perform BFS traversal.
5. For every neighbor:
   - If it has not been cloned, create its clone.
   - Add the cloned neighbor to the queue.
   - Connect it to the current cloned node.
6. Return the cloned starting node.

The HashMap is important because graphs can contain cycles, so it prevents creating duplicate cloned nodes.

---

## ⏱️ Complexity

- **Time Complexity:** O(V + E)
- **Space Complexity:** O(V)

Where:
- `V` = number of vertices
- `E` = number of edges

---

## 📚 What I Learned

- Graph traversal using BFS
- Deep copying of graph structures
- Using HashMap for node mapping
- Handling cycles in graphs
- Maintaining relationships between cloned nodes

---

## 💻 Language

- Java

## 🔗 Problem

LeetCode #133 — Clone Graph

---

### Day 36/100 ✔️

**One problem, one concept, and another step forward.**

#100DaysOfCode #LeetCode #DSA #Java #Graph #BFS #HashMap #ProblemSolving
