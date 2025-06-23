# Digital root:
The digital root of a positive integer is found by summing the digits of the integer. If the resulting value is a single digit then that digit is the digital root. If the resulting value contains two or more digits, those digits are summed and the process is repeated. This is continued as long as necessary to obtain a single digit.
Given a number, the task is to find its digital root. The input number may be large and it may not be possible to store even if we use long long int.

# Mathematical Approach:
We know that every number in the decimal system can be expressed as a sum of its digits multiplied by powers of 10. For example, a number represented as abcd can be written as follows:

abcd = a*10^3 + b*10^2 + c*10^1 + d*10^0   

We can separate the digits and rewrite this as:
abcd = a + b + c + d + (a*999 + b*99 + c*9)
abcd = a + b + c + d + 9*(a*111 + b*11 + c)

This implies that any number can be expressed as the sum of its digits plus a multiple of 9.
So, if we take modulo with 9 on each side, 
abcd % 9 = (a + b + c + d) % 9 + 0

This means that the remainder when abcd is divided by 9 is equal to the remainder where the sum of its digits (a + b + c + d) is divided by 9.

# Intuition
The problem asks us to repeatedly add the digits of a number until only one digit remains. Initially, I considered looping or recursion to keep summing digits. But then I remembered the concept of the digital root from number theory, which solves this in constant time.

# Approach:
We use the digital root formula:

If the number is 0, return 0
Otherwise, return 1 + (num - 1) % 9

# This formula works because:
For any positive number num, its digital root is equivalent to num % 9, except for multiples of 9 (where it should return 9 instead of 0).
So we shift the value by subtracting 1, take % 9, and add 1 back.

# Complexity
Time complexity:
O(1) — Constant time due to direct math formula.
Space complexity:
O(1) — No extra space used.

# Code
class Solution:
    def addDigits(self, num: int) -> int:
        return 0 if num == 0 else 1 + (num - 1) % 9
