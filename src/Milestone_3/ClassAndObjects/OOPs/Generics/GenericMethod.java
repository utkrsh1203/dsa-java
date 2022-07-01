package Milestone_3.ClassAndObjects.OOPs.Generics;

public class GenericMethod {
    public static <T> void printArr(T arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        // Integer arr[] = { 0, 1, 2, 3, 4, 5 };
        // printArr(arr);
        // String arrS[] = { "a", "b", "c", "d", "e" };
        // printArr(arr);

        Vehicle v = new Vehicle(2, "a");
        System.out.println(v);

        // Vehicle arrV[] = new Vehicle[5];

        // printArr(arrV);
    }
}
