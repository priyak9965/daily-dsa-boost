/*Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
 

Constraints:

1 <= s.length <= 105
s[i] is a printable ascii character.*/

class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i = 0; i<n/2; i++){ //the i<=n/2 will not work as for equal to case it will go beyond half in even case and swap already swapped value
            char x = s[i];
            s[i] = s[n-i-1]; // here the first pointer will start from i and the pointer from end will start from n-i-1
            s[n-i-1]= x;
        }
    }
}
