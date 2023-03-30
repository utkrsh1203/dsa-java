package College;

public class lab4_2 {
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            max = Math.max(max, i);
        }

        return max;
    }

    static int[] countSort(int[] arr) {
        int max = findMax(arr);
        int[] count = new int[max + 1];
        for (int i : arr) {
            count[i]++;
        }

        int index = 0;

        for (int j = 0; j < max + 1; j++) {
            for (int k = 0; k < count[j]; k++) {
                arr[index] = j;
                index++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 3 };

        int[] count = countSort(arr);

        for (int i = 0; i < count.length; i++) {
            if (count[i] == 2) {
                System.out.println(i);
            }
        }

    }

}
