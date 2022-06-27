package LeetCode;

public class Q1423 {

    public static int maxScore(int[] cardPoints, int k) {
        if (k == 0) {
            return 0;
        }
        if (k == cardPoints.length) {
            int sum = 0;
            for (int i = 0; i < cardPoints.length; i++) {
                sum += cardPoints[i];

            }
            return sum;
        }
        int start = cardPoints.length - k;
        int end = cardPoints.length - 1;
        int curr = 0;
        int max = 0;
        for (int i = start; i <= end; i++) {
            curr += cardPoints[i];
        }
        max = curr;
        System.out.println(max);
        while (end != k - 1) {

            curr = curr - cardPoints[start];
            start = (start + 1) % cardPoints.length;
            System.out.println(start);
            end = (end + 1) % cardPoints.length;
            curr += cardPoints[end];
            System.out.println(end);
            System.out.println(curr);
            if (curr > max) {
                max = curr;
            }

        }
        return max;

    }

    public static void main(String[] args) {
        int arr[] = { 53, 14, 91, 35, 51, 9, 80, 27, 6, 15, 77, 86, 34, 62, 55, 45, 91, 45, 23, 75, 66, 42, 62, 13, 34,
                18, 89, 67, 93, 83, 100, 14, 92, 73, 48, 2, 47, 93, 99, 100, 88, 84, 48 };
        System.out.println(maxScore(arr, 43));
    }

}
