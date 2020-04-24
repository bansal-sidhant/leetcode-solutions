/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
import java.lang.Math;

class Solution {
    ListNode head;
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        while(l1 != null || l2 != null ) {
            int sum = 0;
            if(l1 == null && l2 != null) {
                sum = l2.val;
                l2 = l2.next;
            } else if(l2 == null && l1 != null) {
                sum = l1.val;
                l1 = l1.next;
            } else {
            sum = l1.val + l2.val;
            l1 = l1.next;
            l2 = l2.next;
            }
            sum = sum+carry;
            if((sum/10) == 0) {
                push(sum);
                carry=0;
            } else {
                push((sum%10)); 
                carry = sum/10;
                                   
            }
            
        }
        if(carry!=0) {
            push(carry);
        }
        return reverse(head);
    }
    
    public void push (int value) {
        ListNode newNode = new ListNode(value);
        
        newNode.next = head;
        
        head = newNode;
        
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        ListNode next = null; 
        while(current != null) {
            next= current.next;
            current.next = prev;
            prev= current;
            current = next;
        }
        head = prev;
        
        return head;
    }
}