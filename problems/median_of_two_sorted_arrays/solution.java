import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] sortArray = new int[length1+length2];
        int index1 = 0;
        int index2 = 0;
        int index3 =0;
        while(index3 < sortArray.length) {
            
            if(index1 < length1 && index2 < length2){
            
            if(nums1[index1] > nums2[index2]) {
                sortArray[index3] = nums2[index2];
                index2++;
            } else if(nums1[index1] < nums2[index2]) {
                sortArray[index3] = nums1[index1];
                index1++;
            } else if(nums1[index1] == nums2[index2]){
                sortArray[index3] = nums1[index1];
                index3++;
                sortArray[index3] = nums2[index2];
                index1++;
                index2++;              
            }
            
        } else if(index1< length1 && index2 == length2) {
                sortArray[index3] = nums1[index1];
                index1++;
        } else if(index1 == length1 && index2 < length2)  {
                sortArray[index3] = nums2[index2];
                index2++;
        }
            index3++;
        }
        
    int median = sortArray.length/2;
        System.out.println(median);
        if(sortArray.length == 1) {
            return new Double(sortArray[0]);
        }
        if(sortArray.length%2 ==0 ) {
            //int sum = (sortArray[median]+sortArray[median+1])/2;
            Double firstNum = new Double(sortArray[median]);
            Double secondNum = new Double(sortArray[median-1]);
            Double sum = (firstNum+secondNum)/2;
            return sum;
        } else {
            return new Double(sortArray[median]);
        }
        
        //return 0.0;
    }
    
    
}