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
```
## 🔍 How the Code Works (Step-by-Step)
Two-pointer approach:

 1.Start comparing characters from the beginning (start) and end (end) of the string.

 2.Move inward until both pointers meet.

Character filtering:

 1.Skip any character that is not a letter or a digit.

 2.Only compare alphanumeric characters.

Case-insensitive comparison:

 1.Convert characters to lowercase using Character.toLowerCase() before comparing.

 2.Return false if any mismatch occurs.

Return true if the entire string matches in reverse.

## ⚡ Why This Code is Fast
1.No extra space: No temporary string or array is created (unlike using regex or StringBuilder).

2.Single-pass scan: Only one loop with direct character comparisons.

3.ASCII-only optimization:

   a.Manual checks (c >= 'a' && c <= 'z') are faster than Character.isLetterOrDigit() in tight loops.

4.Short-circuit skips: Uses continue to quickly move over irrelevant characters.

## 💡 Java String vs Array: Why s[i] Doesn't Work
❌ Not Allowed in Java:
```
char c = s[i]; // ❌ Compilation error

```
## ✅ Correct in Java:
```
char c = s.charAt(i); // ✅
```
## 🔍 Why?
In Java, String is not an array.

Internally, Java stores string characters in a char[], but access is only allowed via charAt(int index) method.

This provides bounds checking, immutability, and abstraction, which improves safety and portability.

## 🧠 Summary

| Concept                | Explanation                                            |
|------------------------|--------------------------------------------------------|
| Algorithm Type         | Two-pointer                                            |
| Time Complexity        | O(n)                                                   |
| Space Complexity       | O(1)                                                   |
| Java-specific Feature  | Uses `charAt()` for safe character access              |
| Case Handling          | Done using `Character.toLowerCase()`                   |
| Speed Optimization     | Manual ASCII filtering instead of regex or builder     |


## 📌 Tip
To write faster, cleaner Java code:

Use charAt(i) for string character access.

Prefer primitive operations (like c >= 'a') in high-performance sections.

Avoid creating intermediate strings unless necessary.
