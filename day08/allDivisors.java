/*Given an integer N, print all the divisors of N in the ascending order.
 

Example 1:

Input : 20
Output: 1 2 4 5 10 20
Explanation: 20 is completely 
divisible by 1, 2, 4, 5, 10 and 20.

Example 2:

Input: 21191
Output: 1 21191
Explanation: As 21191 is a prime number,
it has only 2 factors(1 and the number itself).

Your Task:

Your task is to complete the function print_divisors() which takes N as input parameter and prints all the factors of N as space seperated integers in sorted order. You don't have to print any new line after printing the desired output. It will be handled in driver code.
 

Expected Time Complexity: O(sqrt(N))
Expected Space Complexity: O(sqrt(N))
 

Constraints:
1 <= N <= 105*/

class Solution {
    public static void print_divisors(int n) {
        // code here
        // List<Integer> x = new Arraylist<>();
        for( int i = 1; i < n+1; i ++){
            if(n%i == 0){
                // x.add(i);
                System.out.print(i + " ");
            }
        }
    }
}
//this solution is in O(n) time complexity , has to reduce to O(sqrt(n)) time complexity

//with O(sqrt(n)) complexity ,using list to first add the number in half time and the using collection's sort method to print the numbers in sorted order.
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


class Solution {
    public static void print_divisors(int n) {
        // code here
        List<Integer> x = new ArrayList<>();
        for( int i = 1; i*i <=n; i ++){
            if(n%i == 0){
               if((n/i)!=i){
                    x.add(i);
                x.add(n/i);
               }
               else{
                   x.add(i);
               }
            }
        }
        
        Collections.sort(x);
        for (int val : x) {
    System.out.print(val + " ");
    }
}
}
