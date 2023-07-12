package JavaImpFunctions.StackAndQueueImplementation;

public class QueueUsingArrays {
    int data[];
    int size;
    int front;
    int rear;

    public QueueUsingArrays() {

        data = new int[5];
        front = -1;
        rear = -1;
    }

    public int size() {
        return size;
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[data.length * 2];
        int index = 0;
        for (int i = front; index < size; i = (i + 1) % temp.length) {
            data[index++] = temp[i];
        }
        front = 0;
        rear = temp.length - 1;
    }

    public void enqueue(int elem) {
        if (size == data.length) {
            doubleCapacity();
        }
        if (size == 0) {
            front = 0;
        }
        rear = (rear + 1) % data.length;
        data[rear] = elem;

        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
        }
        int temp = data[front];
        front = (front + 1) % data.length;
        size--;
        if (size == 0) {
            front = -1;
            rear = -1;
        }
        return temp;
    }

    public int front() {
        if (size == 0) {
            System.out.println("Queue is empty");
        }
        return data[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void printQueue() {
        while (!this.isEmpty()) {
            System.out.println(this.dequeue());
        }
    }

    public static void main(String[] args) {
        int data[] = { 1, 2, 3, 4, 5 };

        QueueUsingArrays q = new QueueUsingArrays();

        for (int i = 0; i < data.length; i++) {
            q.enqueue(data[i]);
        }

        q.dequeue();
        q.dequeue();
        q.enqueue(6);
        q.enqueue(7);
        q.enqueue(8);
        q.printQueue();

    }
}
