// Last updated: 09/07/2026, 10:09:32
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        int n = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        k %= n;

        if (k == 0) {
            return head;
        }

        tail.next = head;

        int stepsToNewTail = n - k - 1;
        ListNode newTail = head;

        for (int i = 0; i < stepsToNewTail; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}