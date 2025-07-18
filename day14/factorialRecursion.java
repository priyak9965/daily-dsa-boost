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


// This above is optimal solution with  O(log5(n)), if you go for calculation of factorial first and then finding the trailing zeroes using loop then it will take
// you forever to calculate to higher number of values and also if you have taken int as datatype then the factorial will overflow with the actual size of the integer numbers.
//eg: for 13, factorial is 6,227,020,800 which is bigger than integer limit so the answer that will come is  1,932,053,504 which is due to overflow and wrapping behaviour.
