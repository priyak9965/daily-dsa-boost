# Euclidean Algorithm - GCD Calculation

The Euclidean Algorithm finds the Greatest Common Divisor (GCD) of two numbers.

---

## How It Works

Given two numbers `a` and `b`:

- If `a > b`, divide `a` by `b`:
  
a = b × q + r


where `q` is the quotient and `r` is the remainder.

- Then:

gcd(a, b) = gcd(b, r)


- Repeat the steps until the remainder becomes zero.

- When one number becomes zero, the other number is the GCD.

---

## Example

Let’s compute:

gcd(48, 18)


---

### Step 1

Divide 48 by 18:

48 = 18 × 2 + 12

So:

gcd(48, 18) = gcd(18, 12)


---

### Step 2

Divide 18 by 12:

18 = 12 × 1 + 6

So:

gcd(18, 12) = gcd(12, 6)

---

### Step 3

Divide 12 by 6:

12 = 6 × 2 + 0

So:

gcd(12, 6) = gcd(6, 0)

---

### Conclusion

When one of the numbers becomes zero, the other number is the GCD.

Thus:

gcd(48, 18) = 6

---

## How This Matches the Java Code

Your Java code:

```java
class Solution {
    public static int gcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        if (a == 0)
            return b;
        else
            return a;
    }
}
