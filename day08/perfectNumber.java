/*A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number itself. A divisor of an integer x is an integer that can divide x evenly.

Given an integer n, return true if n is a perfect number, otherwise return false.

 

Example 1:

Input: num = 28
Output: true
Explanation: 28 = 1 + 2 + 4 + 7 + 14
1, 2, 4, 7, and 14 are all divisors of 28.
Example 2:

Input: num = 7
Output: false
 

Constraints:

1 <= num <= 108*/

class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for(int i = 1; i <num; i ++){
            if(num%i == 0){
                sum = sum + i;
            }
        }
        return (sum == num);
    }
} // solution with O(n) time complexity, has to reduce it to O(sqrt(n));

class Solution { //solution with O(sqrt(n)) and better time complexity and space complexity, same is for divisor problem
    public boolean checkPerfectNumber(int num) {
        if(num<=1){
            return false;
        }
        int sum = 1;
        int sqrt = (int)Math.sqrt(num);
        for(int i = 2; i <=sqrt; i ++){
            if(num%i == 0){
                sum = sum + i;
                if((num/i) != i){
                    sum= sum+(num/i);
                }
            }
        }
        return (sum == num);
    }
}
