/*Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.


Examples:
Input : nums = [1, 2, 3, 4, 5]

Output : true

Explanation : For all i (1 <= i <= 4) it holds nums[i] <= nums[i+1], hence it is sorted and we return true.*/

class Solution {
    public boolean check(int[] nums) {
        int count = 0, n = nums.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]>arr[i-1]){

            }else return false;
        }
        return true
    }
}
