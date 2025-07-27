/*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
*/

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase(); //this will put the whole string in lowecase for uniformity.
        int start = 0;
        int end = s.length() - 1;
        
        while(start < end) {
            char left = s.charAt(start); //you have to use charAt for this, you cannot use s[start] for strings in java like in C++, string is not treated like array of characters in java
            char right = s.charAt(end);
            
          
            if (!((left >= 'a' && left <= 'z') || (left >= '0' && left <= '9'))) { //exclude the characters that are not alphanumeric
                start++;
                continue;
            }
            if (!((right >= 'a' && right <= 'z') || (right >= '0' && right <= '9'))) {
                end--;
                continue;
            }

            if (left == right) {
                start++;
                end--;
                continue;
            }

            else{
                return false;
            }
        }

        return true;
    }
}

