class Solution {
    public int arrangeCoins(int n) {
       int left = 1; 
       int right = n;
       int result = -1; 

       while(left <=right) {
        int mid = left + (right -left) /2;

        long sum = ( (long)mid * (mid + 1))/2;

        if( sum <= n) {
            result = mid;
            left = mid + 1;
        } else {
            right  = mid - 1;
        }

       }

       return result;
    }
}