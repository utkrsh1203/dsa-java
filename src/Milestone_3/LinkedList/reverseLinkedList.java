package Milestone_3.LinkedList;

class LinkedListNode<T> {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data) {
        this.data = data;
    }
}

public class reverseLinkedList {

    public static void print(LinkedListNode<Integer> head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {

        if (head == null || head.next == null) {
            return head;
        }
        LinkedListNode<Integer> helper = head.next;
        LinkedListNode<Integer> temp = null;

        while (helper != null) {
            helper = head.next;
            head.next = temp;
            temp = head;
            head = helper;
        }
        return temp;
    }

    public static void main(String[] args) {
        LinkedListNode<Integer> a1 = new LinkedListNode<>(1);
        LinkedListNode<Integer> a2 = new LinkedListNode<>(2);
        System.out.println(a1.next);
        a1.next = a2;
        System.out.println(a1.next);
        LinkedListNode<Integer> a3 = new LinkedListNode<>(3);
        a2.next = a3;
        LinkedListNode<Integer> a4 = new LinkedListNode<>(4);
        a3.next = a4;
        LinkedListNode<Integer> a5 = new LinkedListNode<>(4);
        a4.next = a5;

        LinkedListNode<Integer> ans = reverseLinkedList.reverse_I(a1);
        print(ans);

    }

}
