package Milestone_3.Stacks.StacksUsingArray;

public class StacksUsingArrays {
    private int arr[];
    private int top;

    public StacksUsingArrays() {
        arr = new int[5];
        top = -1;
    }

    public StacksUsingArrays(int size) {
        arr = new int[size];
        top = -1;
    }

    public void push(int element) {
        // If stack is full

        if (top == arr.length - 1) {
            // Increasing the size of stack
            doubleCapacity();

            // Throw Exception
            // throw new StackOverflowException();
        }

        top++;
        arr[top] = element;
    }

    private void doubleCapacity() {
        int temp[] = arr;
        arr = new int[arr.length * 2];

        // arr = temp;
        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }
    }

    public int pop() {
        // If stack is empty

        // Throw exception
        // if (top == -1) {
        // throw new StackUnderflowException();
        // }

        // return -1
        if (top == -1) {
            return -1;
        }
        int element = arr[top];
        top--;
        return element;
    }

    public int size() {
        return top + 1;
    }

    public int top() {

        // If stack is empty

        // Throw exception
        // if (top == -1) {
        // throw new StackUnderflowException();
        // }

        // return -1
        if (top == -1) {
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void printStack() {
        for (int i = 0; i < top + 1; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        StacksUsingArrays stack = new StacksUsingArrays();

        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println("Top = " + stack.top());
        System.out.println("Size = " + stack.size());
        System.out.println("Element popped : " + stack.pop());
        System.out.println("Top = " + stack.top());
        System.out.println("Size = " + stack.size());
        System.out.println("Element popped : " + stack.pop());
        System.out.println("Size = " + stack.size());
        System.out.println();
        stack.printStack();

    }

}
