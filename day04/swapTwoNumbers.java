/*You are given two numbers a and b. Your task is to swap the given two numbers.

Note: Try to do it without a temporary variable.*/

class Solution {
    static List<Integer> get(int a, int b) {
        // code here
        b= a+b;
        a = b-a;
        b = b - a;
        
        List<Integer> result = new ArrayList<>();
        result.add(a);
        result.add(b);
        return result;
    }
}
