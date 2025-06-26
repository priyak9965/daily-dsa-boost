/*Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-231 <= x <= 231 - 1*/

class Solution {
    public int reverse(int x) {
        int num = Math.abs(x);  // using this can overflow when we are taking the absolute of -2^31, there is no -2^31 exit in +ve side 
        
        int rev = 0; 
        
        while (num != 0) {
            int ld = num % 10; 
            
           
            if (rev > (Integer.MAX_VALUE - ld) / 10) {
                return 0; 
            }
            
            rev = rev * 10 + ld; 
            num = num / 10; 
        }
        
        return (x < 0) ? (-rev) : rev;
    }
}


//correct way to keep the 32 bit integer check 
class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (rev > Integer.MAX_VALUE / 10 || 
                (rev == Integer.MAX_VALUE / 10 && digit > 7)) return 0; 
            if (rev < Integer.MIN_VALUE / 10 || 
                (rev == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            rev = rev * 10 + digit;
        }

        return rev;
    }
}


//solution without using hardcode : Overflow Detection via Reversal Logic

class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            int newRev = rev * 10 + digit;

            // Overflow detected
            if ((newRev - digit) / 10 != rev)
                return 0;

            rev = newRev;
            x /= 10;
        }

        return rev;
    }
}

