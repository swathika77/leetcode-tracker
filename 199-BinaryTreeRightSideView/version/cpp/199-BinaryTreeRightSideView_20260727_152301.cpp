// Last updated: 27/07/2026, 15:23:01
1class Solution {
2public:
3    ListNode* reverseList(ListNode* head) {
4        // Initialize pointers
5        ListNode* prev = nullptr; // Previous node starts as NULL
6        ListNode* next = nullptr; // Next node
7        ListNode* curr = head;    // Current node starts at the head
8
9        // Traverse the list
10        while (curr != nullptr) {
11            // Save the next node
12            next = curr->next;
13
14            // Reverse the link
15            curr->next = prev;
16
17            // Move pointers forward
18            prev = curr; // Move prev to the current node
19            curr = next; // Move curr to the next node
20        }
21
22        // prev is now the new head of the reversed list
23        return prev;
24    }
25};