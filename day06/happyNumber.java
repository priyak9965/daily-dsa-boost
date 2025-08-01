/*Write an algorithm to determine if a number n is happy.

A happy number is a number defined by the following process:

Starting with any positive integer, replace the number by the sum of the squares of its digits.
Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
Those numbers for which this process ends in 1 are happy.
Return true if n is a happy number, and false if not.

 

Example 1:

Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
Example 2:

Input: n = 2
Output: false
 

Constraints:

1 <= n <= 231 - 1*/


class Solution {
    public boolean isHappy(int num) {
      
        while(num >4){
            int sum = 0;
            while(num>0){
            int x = num %10;
            sum = x*x + sum;
            num = num/10;
            }
        num = sum;

    }
    while (num<=4 && num>1){
         int sum = 0;
            
            int x = num %10;
            sum = x*x + sum;
            num = num/10;
           return false;
    }
    if(num == 1){
        return true;
    }
    else return false;
     
    }
}
//its working but it has no explaination it should be like finding sum = 1 or if a number is in infinite loop i.e numbers will repeat after certain time so use set or some other type of
//algorithm to find if this number already came once or not.
