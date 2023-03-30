package College;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class lab3 {

    public static Node add(Node root, int n) {

        Node temp = new Node(n);
        Node curr = root;
        while (curr.next != null) {
            curr = curr.next;

        }
        curr.next = temp;
        return root;
    }

    public static void peak(Node root) {
        Node temp = root;
        int prev = Integer.MIN_VALUE;
        int comp = 0;
        while (temp.next != null) {
            comp++;
            if (temp.data > prev && temp.data > temp.next.data) {
                System.out.println("No of Comparisons = " + " " + (comp - 1));
                System.out.println(temp.data);
                return;
            }
            prev = temp.data;
            temp = temp.next;
        }
        System.out.println("No of Comparisons = " + " " + (comp - 1));
        System.out.println(-1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Enter root value : ");
        int data = sc.nextInt();
        Node root = new Node(data);
        for (int i = 0; i < n - 1; i++) {
            System.out.println("Enter number : ");
            int j = sc.nextInt();
            add(root, j);
        }
        peak(root);
        sc.close();

    }

}
