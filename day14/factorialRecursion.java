/* Given a number X,  print its factorial.

To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.

Note: X  is always a positive number. */

class Solution {
    public int trailingZeroes(int n) {
        int fact = 1;
        int count = 0;
        for (int i = 1; i<=n ; i++){
            fact = fact * i;
        
        }
    while(fact>0){
        if(fact%10 == 0){
            count ++;
            fact= fact/10;
        }
        else return count;
    } 
    return count; 
        
    }
}
