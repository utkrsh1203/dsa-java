package Coding_Ninjas.Milestone_3.Stacks;

import java.util.*;

public class minimumBracketTraversal {
    public static int countBracketReversals(String input) {
        // Your code goes here
        int cnt = 0;
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '{') {
                s.push('{');
            } else {
                if (s.empty()) {
                    cnt++;
                    s.push('{');
                } else {
                    s.pop();
                }
            }
        }

        if (s.empty()) {
            return cnt;
        }
        if (s.size() % 2 != 0) {
            return -1;
        }
        return s.size() / 2 + cnt;

    }
}
