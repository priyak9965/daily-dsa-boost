/*GCD of two numbers
Difficulty: BasicAccuracy: 51.03%Submissions: 120K+Points: 1
Given two positive integers a and b, find GCD of a and b.

Note: Don't use the inbuilt gcd function

Examples:

Input: a = 20, b = 28
Output: 4
Explanation: GCD of 20 and 28 is 4
Input: a = 60, b = 36
Output: 12
Explanation: GCD of 60 and 36 is 12
Constraints:
1 ≤ a, b ≤ 109

Expected Complexities
Time Complexity: O(log(min(a, b)))
Auxiliary Space: O(1)*/

//Looking at the expected time complexity its clear that they want the solution following euclidean theorem.
class Solution {
    public static int gcd(int a, int b) {
        // code here
        while(a>0 && b>0){
            if(a>b)
                a = a%b;
            else 
                b = b%a;
        }
        if(a==0) 
             return b;
        else 
            return a;
}
}
