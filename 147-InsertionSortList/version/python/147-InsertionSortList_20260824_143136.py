# Last updated: 24/08/2026, 14:31:36
1class Solution:
2    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
3        if not head or not head.next:
4            return head
5        
6        # Split the list into two halfs
7        left = head
8        right = self.getMid(head)
9        tmp = right.next
10        right.next = None
11        right = tmp
12        
13        left = self.sortList(left)
14        right = self.sortList(right)
15        
16        return self.merge(left, right)
17    
18    def getMid(self, head):
19        slow = head
20        fast = head.next
21        
22        while fast and fast.next:
23            slow = slow.next
24            fast = fast.next.next
25        return slow
26    
27    # Merge the list
28    def merge(self, list1, list2):
29        newHead = tail = ListNode()
30        while list1 and list2:
31            if list1.val > list2.val:
32                tail.next = list2
33                list2 = list2.next
34            else:
35                tail.next = list1
36                list1 = list1.next
37            tail = tail.next
38        
39        if list1:
40            tail.next = list1
41        if list2:
42            tail.next = list2
43        
44        return newHead.next
45        