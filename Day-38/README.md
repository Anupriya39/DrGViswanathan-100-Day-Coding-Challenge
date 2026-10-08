# Day 38 – Course Schedule

## LeetCode #207

### Problem
Given `numCourses` and a list of prerequisite pairs, determine whether it is possible to finish all courses.

### Approach
Used **BFS with Topological Sort (Kahn's Algorithm)**.

1. Build a directed graph using the prerequisite relationships.
2. Calculate the indegree of every course.
3. Add all courses with indegree `0` to a queue.
4. Process courses from the queue.
5. Reduce the indegree of their dependent courses.
6. Add a course to the queue when its indegree becomes `0`.
7. If all courses are processed, return `true`; otherwise, a cycle exists and return `false`.

### Complexity

- Time Complexity: `O(V + E)`
- Space Complexity: `O(V + E)`

Where:
- `V` = number of courses
- `E` = number of prerequisite relationships

### Key Learning

- Topological Sorting
- BFS
- Indegree
- Cycle detection in directed graphs
- Graph representation using adjacency lists

### Language
Java

### LeetCode
[Course Schedule – LeetCode #207]
