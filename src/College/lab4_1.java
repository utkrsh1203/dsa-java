package College;

public class lab4_1 {
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

    public static void main(String args[]) {
        int arr[] = { 7, 4, 7, 2, 7, 1, 2, 5, 3, 6 };

        int count[] = countSort(arr);

        int mostFrequent = 0;
        int maxFreq = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxFreq) {
                mostFrequent = i;
                maxFreq = count[i];
            }
        }
        double median;
        if (count.length % 2 == 0) {
            median = ((double) arr[arr.length / 2] + (double) arr[arr.length / 2 - 1]) / 2;
        } else {
            median = arr[arr.length / 2];
        }

        System.out.println("Frequent Value = " + mostFrequent);
        System.out.println("Median = " + median);
        System.out.println("Difference = " + (mostFrequent - median));
    }
}
