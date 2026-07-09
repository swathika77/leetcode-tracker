// Last updated: 09/07/2026, 10:10:35
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
    ListNode head,tail;
    public ListNode reverseKGroup(ListNode givenHead, int k){
        Stack<ListNode> stk = new Stack<>();
        ListNode node = givenHead;
        head = tail = null;
        while(node != null){
            stk.push(node);
            node = node.next;
            if(stk.size() == k){
                insert(stk);
                tail.next = node;
            }
        }
       
        return head;
        
    }
    private void insert(Stack<ListNode> stk){
        while(!stk.isEmpty()){
            ListNode node = stk.pop();
            node.next = null;
            if(head == null){
                tail = head = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
        }
    }

}