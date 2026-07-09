// Last updated: 09/07/2026, 10:10:42
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) return list1;
        else if (list1 == null || list2 == null) return list1 == null ? list2 : list1;
        ListNode d = null;
        ListNode td = null;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val) {
                if (d == null) {
                    d = list1;
                    td = list1;
                }
                else {
                    d.next = list1;
                    d = list1;
                }
                list1 = list1.next;
            }
            else {
                if (d == null) {
                    d = list2;
                    td = list2;
                }
                else {
                    d.next = list2;
                    d = list2;
                }
                list2 = list2.next;
            }
        }
        if (list1 != null) d.next = list1;
        else if (list2 != null) d.next = list2;
        return td; 
    }
}