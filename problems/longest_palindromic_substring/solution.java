import java.util.*;
class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        int index = 0;

        if(s.isEmpty() || length == 1) {
            return s;
        }
        String longest= s.substring(0,1);
        for(int i =0; i< length; i++) {
          String temp = expand(s,i,i,length) ;
            
            if(temp.length() > longest.length()) {
                longest = temp;
            }
            
            temp = expand(s,i,i+1,length);
            if(temp.length() > longest.length()) {
                longest = temp;
            }

        }
        
        return longest;
    }
    
    public String expand(String s, int begin, int end, int length) {
        while((begin >=0) && (end <= length-1) && (s.charAt(begin) == s.charAt(end)) ){
            begin--;
            end++;
        }
        return s.substring(begin+1,end);
    }
    
}