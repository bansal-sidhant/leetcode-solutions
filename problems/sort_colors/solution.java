class Solution {
    public int[] sortColors(int[] nums) {
        sort(nums, 0, nums.length);
        return nums;
    }

    public void sort(int[] num, int start, int end) {
        if(end-start<=1) {
            return;
        }
        int pivot = num[end-1];
        int startPtr = start;
        int endPtr = end-1;

        while(startPtr < endPtr) {
            
            while(num[startPtr] < pivot && startPtr < endPtr) {
                startPtr++;
            }

            while(num[endPtr] >= pivot && startPtr < endPtr) {
                endPtr--;
            }

            if(startPtr != endPtr) {
                int temp = num[startPtr];
                num[startPtr] = num[endPtr];
                num[endPtr] = temp;
            }


        }

        int temp = num[startPtr];
        num[startPtr] = num[end-1];
        num[end-1] = temp;

        sort(num, start, startPtr);
        sort(num, startPtr +1 , end);
    }
}