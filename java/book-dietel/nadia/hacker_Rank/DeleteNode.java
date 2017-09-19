
public class DeleteNode {

    class Node {
        int data;
        Node next;
    }

    Node Delete(Node head, int position) {
        Node node = head;
        if (position == 0) {
            return node.next;
        }
        while (--position > 0) {
            node = node.next;
        }
        node.next = node.next.next;
        return head;

    }
}
