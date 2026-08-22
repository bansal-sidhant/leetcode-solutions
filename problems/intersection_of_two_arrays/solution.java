class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length = nums1.length > nums2.length ? nums2.length : nums1.length;
        HashSet<Integer> result = new HashSet<>();
        
        if( nums1.length > nums2.length){
           length =  findIntersection(nums2, nums1, result);
        } else {
           length =  findIntersection(nums1, nums2, result);
        }
       // System.out.print(result[0]);
       return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public int findIntersection(int[] nums1, int[] nums2, HashSet<Integer> result) {
        int count = 0 ;
        for(int i = 0; i <= nums1.length -1; i++) {

            int left = 0;
            int right = nums2.length -1;

            while(left <= right) {
                int mid = left + (right -left)/2;

                if(nums2[mid] == nums1[i]) {
                    result.add(nums1[i]);
                    count++;
                    break;
                    
                } else if(nums2[mid] < nums1[i] ) {
                    left = mid + 1;
                    
                } else {
                   right = mid -1;
                }
            }
        }
        return count;
    }
}