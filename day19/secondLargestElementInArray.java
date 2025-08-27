/*Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the largest element.*/

class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        int max = arr[0];
        int smax = -1;
        for(int i=0; i<n; i++){
            if(arr[i]>max){
                smax = max;
               
                max = arr[i];
               
            }
            else if(arr[i]>smax && arr[i]<max){
                    smax=arr[i];
                }
        }
        return smax;
    }
}
