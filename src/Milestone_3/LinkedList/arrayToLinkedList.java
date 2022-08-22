package Milestone_3.LinkedList;

public class arrayToLinkedList {
    public static LinkedListNode<Integer> convertArrayToList(int[] input) {
        LinkedListNode<Integer> head = null;
        LinkedListNode<Integer> ln = null;
        for (int value : input) {
            if (head == null) {
                head = new LinkedListNode<Integer>(input[0]);
                ln = head;
            } else {
                ln.next = new LinkedListNode<Integer>(value);
                ln = ln.next;
            }
        }
        return head;
    }
}
