package Milestone_3.LinkedList;

public class arrayToLinkedList {
    public static Node<Integer> convertArrayToList(int[] input) {
        Node<Integer> head = null;
        Node<Integer> ln = null;
        for (int value : input) {
            if (head == null) {
                head = new Node<Integer>(input[0]);
                ln = head;
            } else {
                ln.next = new Node<Integer>(value);
                ln = ln.next;
            }
        }
        return head;
    }
}
