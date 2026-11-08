# Day 69 – 100 Days Coding Challenge

Today's LeetCode problems solved using Java.

## Problems Solved

| Problem | LeetCode | Difficulty | Topic |
|---|---|---|---|
| Bulb Switcher | #319 | Medium | Math |
| Remove Nth Node From End of List | #19 | Medium | Linked List, Two Pointers |

---

## 1. Bulb Switcher – LeetCode #319

### Approach – Mathematical Observation

- Initially, all bulbs are OFF.
- Each bulb is toggled once for every divisor of its position.
- Most numbers have an even number of divisors.
- Perfect squares have an odd number of divisors.
- Therefore, only bulbs at perfect-square positions remain ON.

The answer is the integer square root of `n`.

### Java Solution

```java
class Solution {
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n);
    }
}
```

### Complexity Analysis

- Time Complexity: O(1)
- Space Complexity: O(1)

---

## 2. Remove Nth Node From End of List – LeetCode #19

### Approach – Two Pointers

- Create a dummy node pointing to the head.
- Initialize `fast` and `slow` at the dummy node.
- Move `fast` ahead by `n + 1` positions.
- Move both pointers until `fast` reaches null.
- Now `slow` points to the node just before the target.
- Remove the target node by updating `slow.next`.

### Java Solution

```java
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // Move fast n + 1 steps ahead
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // Move both pointers
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Remove the target node
        slow.next = slow.next.next;

        return dummy.next;
    }
}
```

### Complexity Analysis

- Time Complexity: O(L), where L is the length of the linked list.
- Space Complexity: O(1).

---

## Key Learnings

- Identifying mathematical patterns to optimize solutions.
- Understanding perfect squares and divisor properties.
- Applying the Two Pointer technique.
- Using dummy nodes for simpler linked list operations.
- Improving problem-solving and edge-case handling.

## Submission Status

- Bulb Switcher: Accepted – 35/35 test cases.
- Remove Nth Node From End: Accepted – 208/208 test cases.

**Day 69/100 – Consistency is the key to progress!** 🚀
