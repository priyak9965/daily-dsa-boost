## Perfect Numbers
perfect number are those whole sum of all the positive divisors excluding the number itself is equal to the number.

In 0 to 10^8 there are the following Perfect Numbers:
6 , 28, 496, 8128, 33550336 

## Soluion with O(sqrt(n)):

Because divisors come in pairs. For example, if num is divisible by i, then num / i is also a divisor.

Let’s optimize your code to run in O(√n) time.

# How to Optimize
Steps:

Loop i from 2 up to √num (inclusive).

If i divides num, add:

i to the sum

plus num / i (the paired divisor)

Finally, add 1 to the sum (because 1 is always a proper divisor).

Check whether the sum equals num.

Important: If i equals num/i (i.e. i * i == num), only add it once to avoid double-counting.

# Optimized Code
Here’s your code optimized to O(√n):

java
Copy
Edit
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;
        int sum = 1; // start with 1, which is always a divisor
        int sqrt = (int)Math.sqrt(num);
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                sum += i;
                int other = num / i;
                if (other != i) {
                    sum += other;
                }
            }
        }
        return sum == num;
    }
}
# Example
Check if 28 is perfect:

Divisors pairs:

2 and 14

4 and 7

sum = 1 + 2 + 14 + 4 + 7 = 28 ✅

So it’s perfect.

# Time Complexity
The loop runs up to √num ⇒ O(√n).

