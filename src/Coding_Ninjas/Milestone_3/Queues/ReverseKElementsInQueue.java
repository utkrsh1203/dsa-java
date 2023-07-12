package Coding_Ninjas.Milestone_3.Queues;

import java.util.*;

public class ReverseKElementsInQueue {
    public static void reverseQueue(Queue<Integer> input) {
        // Your code goes here
        if (input.size() <= 1) {
            return;
        }

        int n = input.poll();
        reverseQueue(input);
        input.add(n);
    }

    public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {
        // Your code goes here
        // int n = input.size();
        Queue<Integer> helper = new LinkedList<>();
        for (int i = 0; i < k; i++) {
            helper.add(input.poll());
        }
        reverseQueue(helper);
        while (!helper.isEmpty()) {
            input.add(helper.poll());
        }
        while (input.size() > k) {
            helper.add(input.poll());
        }
        while (!helper.isEmpty()) {
            input.add(helper.poll());
        }
        return input;
    }

}
