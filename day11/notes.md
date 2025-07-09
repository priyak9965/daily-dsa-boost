# Checking if an Integer is a Power of Two

## Problem Statement

Given an integer `n`, return `true` if it is a power of two. Otherwise, return `false`.

An integer `n` is a power of two if there exists an integer `x` such that:

n == 2^x


---

## Why the Original Approach Was Incorrect

Some incorrect ideas:
- Checking the **last digit** of the number (e.g. if it ends with 2, 4, 6, 8)  
  → Not reliable, since many non-powers of two can also end with these digits.  
  Example: 42 ends with `2` but is not a power of two.
  
- Checking divisibility by numbers like 6, 7, 9, or 11  
  → Doesn’t reliably detect powers of two.

These methods **cannot accurately determine** if a number is a power of two.

---

## Optimal Solution Without Loops or Recursion

### Key Insight:

A power of two has exactly **one bit set** in its binary representation.

| Decimal | Binary    |
|---------|-----------|
| 1       | `0b0001`  |
| 2       | `0b0010`  |
| 4       | `0b0100`  |
| 8       | `0b1000`  |
| 16      | `0b10000` |

Hence, to check if a number `n` is a power of two:

n > 0 && (n & (n - 1)) == 0


---

### Why This Works:

- `(n - 1)` flips all the bits **after** the highest set bit in `n`.
- Doing `n & (n - 1)` yields `0` **only** if there was exactly **one set bit** in `n`.

Example with `n = 8`:

n = 1000 (binary)
n - 1 = 0111 (binary)
n & (n-1)= 0000


Since the result is `0`, it confirms that `n` is a power of two.

---

## Java Code

Here’s the correct Java implementation:

```java
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
```

Time and Space Complexity
Time Complexity: O(1)

Space Complexity: O(1)

| Input | Output |
| ----- | ------ |
| 1     | true   |
| 2     | true   |
| 3     | false  |
| 4     | true   |
| 6     | false  |
| 16    | true   |
| 42    | false  |
| 1024  | true   |

Summary:
✅ Do not check last digits or arbitrary divisors.
✅ The bitwise trick (n & (n-1)) == 0 is the correct, efficient way to detect powers of two.
