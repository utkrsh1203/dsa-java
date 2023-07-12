package Coding_Ninjas.Milestone_3.Stacks;

import java.util.Stack;

public class checkRedundantBrackets {
    public static boolean check(String expression) {
        // Your code goes here
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            if (expression.charAt(i) == '(' || expression.charAt(i) == '+' || expression.charAt(i) == '-'
                    || expression.charAt(i) == '*' || expression.charAt(i) == '/') {
                stack.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')') {
                if (stack.size() == 0) {
                    return false;
                }
                if (stack.peek() == '+' || stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '-') {
                    while (stack.peek() == '+' || stack.peek() == '*' || stack.peek() == '/' || stack.peek() == '-') {
                        stack.pop();
                    }
                    stack.pop();
                } else if (stack.peek() == '(') {
                    return true;
                }
            }

        }
        return false;
        // return stack.isEmpty();
    }
}
