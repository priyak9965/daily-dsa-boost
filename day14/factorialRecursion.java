/* Given a number X,  print its factorial.

To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.

Note: X  is always a positive number. */

class Solution {
    public int trailingZeroes(int n) {
        int count =0;
            while(n>0){
                n=n/5;
                count = count +n;
            }
        return count ;
    }
}
