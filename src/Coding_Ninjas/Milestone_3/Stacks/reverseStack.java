package Milestone_3.Stacks;

import java.util.*;

public class reverseStack {
    public static void reverse(Stack<Integer> input, Stack<Integer> extra) {
        // Your code goes here

        if (input.size() == 1 || input.size() == 0) {
            return;
        }

        int top = input.pop();

        reverse(input, extra);

        while (!input.empty()) {
            extra.push(input.pop());
        }

        input.push(top);

        while (!(extra.empty())) {
            input.push(extra.pop());
        }

    }

}
