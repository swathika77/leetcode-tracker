// Last updated: 28/07/2026, 14:37:32
1class Solution {
2    public void deleteNode(ListNode node) {
3        node.val = node.next.val;
4        node.next = node.next.next;
5    }
6}