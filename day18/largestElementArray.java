/*Given an array arr[]. The task is to find the largest element and return it.*/
//here arr.length if array is integer type but for strings we have to use length() method instead of directly writing the length.


class Solution {
    public static int largest(int[] arr) {
        // code here
        int n = arr.length;
        int largest = arr[0];
        for(int i = 0; i<n;i++){
            if(arr[i]>=largest){
                largest = arr[i];
            }
        }
        return largest;
        }
}
