/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int kthToLast(ListNode head, int k) {
         List list = new ArrayList<Integer>();
         while(head!=null) {
        	 list.add(head.val);
        	 head = head.next;
         }
        int tem = list.size()-k;
		return (int) list.get(tem);
    }
}