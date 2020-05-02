package com.gjj.test;

import java.util.Stack;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class thrid {
    public ListNode reverseKGroup(ListNode head, int k) {
         ListNode cur = head;
         int count = 0;
         ListNode node = head;
         Stack<Integer> stack = new Stack<Integer>();
         while(cur!=null){
            while(cur!=null && count!=k){
                stack.push(cur.val);
                cur = cur.next;
                count++;
            }
            if(count<k){
               break;
            }
            for(int i = 0;i< k;i++){
                node.val = stack.pop();
                node = node.next;
                count--;
            }
         }   
         return head;
    }
}