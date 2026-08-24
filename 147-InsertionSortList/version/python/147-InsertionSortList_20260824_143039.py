# Last updated: 24/08/2026, 14:30:39
1# Definition for singly-linked list.
2# class ListNode:
3#     def __init__(self, val=0, next=None):
4#         self.val = val
5#         self.next = next
6class Solution:
7    def insertionSortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
8        dummy = ListNode(0)
9        current = head
10
11        while current:
12            nxt = current.next
13
14            prev = dummy
15
16            while prev.next and prev.next.val < current.val:
17                prev = prev.next
18
19            current.next = prev.next
20            prev.next = current
21
22            current = nxt
23
24        return dummy.next