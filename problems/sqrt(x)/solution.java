class Solution {
    public int mySqrt(int x) {
        int boundary  = -1;
        if(x ==0) {
            return 0;
        }

        int left = 1;
        int right = x;

        while(left <= right){
            int mid = left + (right - left) /2;

            if(mid >= x / mid) {
                boundary = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return boundary == x / boundary ? boundary : boundary - 1;
    }
}