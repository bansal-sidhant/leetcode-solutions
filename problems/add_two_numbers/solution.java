/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode out = null;
       /* if(l1.val==0 && l2.val==0) {
            out = new ListNode(0);
            return out;
        } */
        int carry = 0;
       // System.out.println(l1.val);
       // System.out.println(l2.val);
        int sum = l1.val + l2.val;
        
        if((sum/10) != 0) {                
                carry = sum/10;
            }
          int  number = sum % 10;
        out = new ListNode(number);
        ListNode newOut = out;
        while(l1.next != null || l2.next != null) {
            
            
            int first = 0;
            int second = 0;
            //int number = 0;
            if(l1.next != null) {
                l1 = l1.next;
                first = l1.val;
            }
            
            if(l2.next!= null) {
                l2 = l2.next;
                second = l2.val;
            }
            
            sum = carry + first + second;
            carry = 0;
            if((sum/10) != 0) {                
                carry = sum/10;
            }
            number = sum % 10;
           // System.out.println(number);
            ListNode newNode = new ListNode(number);
            newOut.next = newNode;
            newOut = newNode;
                       
        }
        
        if(carry > 0) {
             ListNode newNode = new ListNode(carry);
            newOut.next = newNode;
        }
        
       return out;
    }
}