package Milestone_3.LinkedList;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class deleteNode {
    public static LinkedListNode<Integer> delete(LinkedListNode<Integer> head, int pos) {
        // Write your code here.
        if (pos == 0) {
            if (head == null) {
                return head;
            }
            head = head.next;
            return head;
        }
        int i = 0;
        LinkedListNode<Integer> temp = head;
        while (temp.next != null && i < pos - 1) {
            temp = temp.next;
            i++;
        }
        if (temp.next == null && i < pos) {
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }
}
