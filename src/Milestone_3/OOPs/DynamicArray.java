package Milestone_3.OOPs;

class Array {
    private int data[];
    private int nextElementIndex;

    public Array() {
        data = new int[5];
        nextElementIndex = 0;
    }

    public int size() {
        return nextElementIndex;
    }

    public boolean isEmpty() {
        return nextElementIndex == 0;
    }

    public int get(int i) {
        if (i >= nextElementIndex) {
            // Throw error
            return 0;
        }
        return data[i];
    }

    public void add(int n) {
        if (nextElementIndex == data.length) {
            doubleCapacity();
        }
        data[nextElementIndex] = n;
        nextElementIndex++;
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            data[i] = temp[i];
        }
    }

    // public void set(int i, int n) {
    // if (i >= nextElementIndex) {
    // // Throw error
    // return;
    // }
    // data[i] = n;
    // }
    public void set(int i, int n) {
        if (i >= nextElementIndex) {
            // Throw error
            while (i >= data.length) {
                doubleCapacity();
            }
            data[i] = n;
            nextElementIndex = i + 1;
            return;
        }
        data[i] = n;
    }

    public void print() {
        for (int i = 0; i < nextElementIndex; i++) {
            System.out.print(data[i] + " ");
        }
    }

    public int removeLast() {
        int n = data[nextElementIndex - 1];
        data[nextElementIndex] = 0;
        nextElementIndex--;
        return n;
    }

    public void addAtIndex(int i, int n) {
        if (i >= nextElementIndex) {
            // Throw error
            while (i >= data.length) {
                doubleCapacity();
            }
            data[i] += n;
            nextElementIndex = i + 1;
            return;
        }
        data[i] += n;
    }

}

public class DynamicArray {

    public static void main(String[] args) {
        Array d = new Array();
        d.add(0);
        d.add(1);
        d.add(2);

        d.addAtIndex(1, 4);
        d.addAtIndex(5, 3);

        // d.set(5, 5);

        d.print();

    }

}
