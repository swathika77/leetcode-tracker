// Last updated: 09/10/2026, 09:26:55
class Solution
{
    public Node copyRandomList(Node head)
    {
        if (head == null)
        {
            return null;
        }
        HashMap<Node, Node> m = new HashMap<>();
        Node newHead = new Node(head.val);
        Node oldTemp = head.next;
        Node newTemp = newHead;
        m.put(head, newHead);

        while (oldTemp != null)
        {
            Node copyNode = new Node(oldTemp.val);
            m.put(oldTemp, copyNode);
            newTemp.next = copyNode;
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
        }
        oldTemp = head;
        newTemp = newHead;
        while (oldTemp != null)
        {
            newTemp.random = m.get(oldTemp.random);
            oldTemp = oldTemp.next;
            newTemp = newTemp.next;
        }
        return newHead;
    }
}