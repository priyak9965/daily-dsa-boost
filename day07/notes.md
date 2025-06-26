# Reverse Integer – Java Solution Explanation

---

### `int num = Math.abs(x);`  
Store the absolute value of `x`.  
➡️ So it becomes easier to reverse digits without worrying about the sign first.

---

### `int rev = 0;`  
This will hold the reversed number.

---

### `while (num > 0)`  
We loop through each digit until the number becomes 0.

---

### `int y = num % 10;`  
Get the last digit of `num`.  
➡️ For example, if `num = 123`, then `y = 3`, then `2`, then `1`.

---

### `if (rev > (Integer.MAX_VALUE - y) / 10)`  
⚠️ **Why this check?**  
Before doing `rev = rev * 10 + y`, we must ensure it won’t overflow.

🧠 Example:
- `rev = 214748364` and `y = 8`  
- `rev * 10 + y = 2147483640 + 8 = 2147483648` → overflows!

So the condition:
```java
rev > (Integer.MAX_VALUE - y) / 10
