# Palindrome Checker in Java – Code Explanation and Optimization Notes

## ✅ Problem Statement
Determine if a given string is a **palindrome**, considering **only alphanumeric characters** and **ignoring case**.

Example:
- Input: `"A man, a plan, a canal: Panama"`
- Output: `true`  
- Explanation: Cleaned string = `"amanaplanacanalpanama"` which is a palindrome.

---

## ✅ Java Code

```java
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        
        while (start < end) {
            char left = s.charAt(start);
            char right = s.charAt(end);
            
            if (!((left >= 'a' && left <= 'z') || (left >= 'A' && left <= 'Z') || (left >= '0' && left <= '9'))) {
                start++;
                continue;
            }
            
            if (!((right >= 'a' && right <= 'z') || (right >= 'A' && right <= 'Z') || (right >= '0' && right <= '9'))) {
                end--;
                continue;
            }
            
            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }
            
            start++;
            end--;
        }
        
        return true;
    }
}
