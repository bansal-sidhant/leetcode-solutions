import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {

        int length = s.length();
        
        ArrayList<Character> stringArray = new ArrayList();
        ArrayList<Integer> lengthArray = new ArrayList();
        int index = 0;
        if(s.isEmpty()) {
            return 0;
        }
        if(s.isBlank()) {
            return 1;
        }
        // if(Character.isWhitespace(s.charAt(0))) {
        //     return 1;
        // }
       for(int i=0; i < length; i++) {
            
            stringArray.add(s.charAt(i));
           char current = s.charAt(i);
            if(stringArray.size() > 1) {

                for(int j=0; j < stringArray.size()-1; j++) {

                    if(current == stringArray.get(j)) {
                        lengthArray.add(stringArray.size()-1);
                        stringArray = new ArrayList();
                        i=index;
                        index++;
                        break;
                    } 
                }
            }
        }  
        lengthArray.add(stringArray.size());
        return findMax(lengthArray);
    }
    
    public Integer findMax(List<Integer> arrayList) {
        Integer max = 0;
            for(Integer num: arrayList) {
                if(max < num) {
                    max =num;
                }
            }
        
        return max;
    }
}