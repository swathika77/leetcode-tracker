// Last updated: 03/09/2026, 09:43:50
1class Solution
2{
3    public Node copyRandomList(Node head)
4    {
5        if (head == null)
6        {
7            return null;
8        }
9        HashMap<Node, Node> m = new HashMap<>();
10        Node newHead = new Node(head.val);
11        Node oldTemp = head.next;
12        Node newTemp = newHead;
13        m.put(head, newHead);
14
15        while (oldTemp != null)
16        {
17            Node copyNode = new Node(oldTemp.val);
18            m.put(oldTemp, copyNode);
19            newTemp.next = copyNode;
20            oldTemp = oldTemp.next;
21            newTemp = newTemp.next;
22        }
23        oldTemp = head;
24        newTemp = newHead;
25        while (oldTemp != null)
26        {
27            newTemp.random = m.get(oldTemp.random);
28            oldTemp = oldTemp.next;
29            newTemp = newTemp.next;
30        }
31        return newHead;
32    }
33}