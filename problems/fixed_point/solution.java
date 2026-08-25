class Solution {
    public int fixedPoint(int[] arr) {
        int ans = -1; 
        int count = 0;
        for(int num : arr) {
            if(num < 0) {
                count++;
                continue;
               
                
            }

            int left = 0; 
            int right = arr.length-1;

            while(left<=right) {
                int mid = left + (right - left)/2;

                if(arr[mid] == num && count == arr[mid]) {
                    return num;
                } else if(arr[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid -1 ;
                }
            }
            count++;
        }
        return ans;
    }
}