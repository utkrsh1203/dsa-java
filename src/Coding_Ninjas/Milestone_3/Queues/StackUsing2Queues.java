package Milestone_3.Queues;

import java.util.*;

public class StackUsing2Queues extends QueuesUsingLinkedList {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsing2Queues() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    public int getSize() {
        // Implement the getSize() function
        return q1.size();
    }

    public boolean isEmpty() {
        // Implement the isEmpty() function
        return q1.isEmpty();
    }

    public void push(int element) {
        // Implement the push(element) function
        q1.add(element);
    }

    public int pop() {
        // Implement the pop() function
        while (q1.size() != 1) {
            q2.add(q1.remove());
        }
        int element = q1.remove();
        // q2.add(element);
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
        return element;
    }

    public int top() {
        // Implement the top() function
        while (q1.size() != 1) {
            q2.add(q1.remove());
        }
        int element = q1.remove();
        q2.add(element);
        while (!q2.isEmpty()) {
            q1.add(q2.remove());

        }
        return element;
    }

    // public void print() {

    // }

    public static void main(String[] args) {
        StackUsing2Queues q = new StackUsing2Queues();

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);

        System.out.println(q.pop());
        System.out.println(q.top());
        System.out.println(q.pop());

        // q.print();
    }

}
