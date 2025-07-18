# 📘 Trailing Zeroes in Factorial — Line-by-Line Explanation

## 🚀 Problem
Given an integer `n`, find the number of **trailing zeros** in `n!` (n factorial).

---

## ✅ Optimal Approach (No Need to Compute Factorial)

### Method: Count the number of **factors of 5** in numbers from `1` to `n`

Trailing zeros come from multiplying **10s**, and `10 = 2 × 5`.  
Since factorials always have more 2s than 5s, we only need to **count the number of 5s**.

---

## 💡 Java Code

```java
class Solution {
    public int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;
        }
        return count;
    }
}

```
## 🧠 Time Complexity
 O(log₅(n))

 Very efficient even for large n (e.g., 10000+)

## Explaination
How this count works?
eg : 25! = 25 x 19 x.... which contains 25, 20, 15, 10 and 5 as 5 multiple which can be written
as 5x5, 5x4, 5x3, 5x2, 5x1 that in total contains 6 5s.

Therefore loop until you get n/5 == 0 and increment the counter as count + n since n/5 is basically giving how many 5s are there in that number untill single 5 is pending.

