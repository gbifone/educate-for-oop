
public class ReverseLinkedList {
    class Node {
        int data;
        Node next;
    }
    Node Reverse(Node head) {
        if (head == null){
            return null;
        }
        Node node = null;
        while(head != null){
            Node i = node;
            node = new Node();
            node.data = head.data;
            node.next = i;
            head = head.next;
        }
        return node;

    }
}
