class Solution {
    public int[] twoSum(int[] nums, int target) {
       int output[] = new int[2];
        int sum =0;
        for(int i =0 ; i < nums.length; i++) {
            
            for(int j=i+1; j < nums.length; j++ ) {
                
                sum = nums[i] + nums[j];
                
                if(sum == target) {
                    output[0] = i;
                    output[1] = j;
                    break;
                }
            }
            
        }
        return output;
    }
}