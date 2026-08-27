class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int min = nums[right];

        while(left<right) {
            int mid = left + (right - left)/2;
            
            if(nums[mid] <= nums[right]) {
                min  = nums[mid];
                right = mid;
            } else {
                
                left  = mid +1;
            }
        }

        return min;
    }
}