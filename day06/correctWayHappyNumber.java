// question and reason for this solutin is already in happyNumber.java
class Solution {
    public boolean isHappy(int num) {
      
    Set<Integer> seen = new HashSet<>();

        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            int sum = 0;
            while (num > 0) {
                int x = num % 10;
                sum += x * x;
                num /= 10;
            }
            num = sum;
        }

        return num == 1;
     
    }
}

//in this we are adding the numbers in set to see if any number is being repeated to detect the infinite loop and if it is then we will just return it with false.
//there is also another method of floyd tortoise and hare solution.
