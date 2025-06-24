# Floyd's Cycle Detection (Tortoise and Hare)
You use two pointers:

slow moves one step at a time

fast moves two steps at a time

If there’s a cycle (i.e. not a happy number), they will eventually meet at a number ≠ 1.
If the number is happy, fast (and slow) will reach 1.

# Java Code (No HashSet or Map):

class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getSumOfSquares(n);
        while (fast != 1 && slow != fast) {
            slow = getSumOfSquares(slow);
            fast = getSumOfSquares(getSumOfSquares(fast));
        }
        return fast == 1;
    }
    private int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }
        return sum;
    }
}

# 🔍 How It Works:
slow moves: n → f(n) → f(f(n))...

fast moves faster: n → f(f(n)) → f(f(f(f(n))))...

If a cycle exists, slow == fast at some point.

If fast == 1, the number is happy.

# ✅ Example:
Try with n = 19:
slow: 19 → 82 → 68 → 100 → 1
fast: 82 → 100 → 1
✅ fast reaches 1 ⇒ happy

Try with n = 2:

slow and fast eventually meet in the cycle: 4 → 16 → ... → 4
❌ no 1 ⇒ not happy

# ✅ Benefits:
Uses O(1) space

Slightly more complex logic but no Set or Map
