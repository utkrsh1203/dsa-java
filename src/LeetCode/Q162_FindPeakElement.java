package LeetCode;

// A peak element is an element that is strictly greater than its neighbors.

// Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

// You may imagine that nums[-1] = nums[n] = -∞.

// You must write an algorithm that runs in O(log n) time.

public class Q162_FindPeakElement {

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            // we are breaking the loop if start is == end
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // we are in decreasing part of array
                end = mid;
            } else {
                // we are increasing part of array
                start = mid + 1;
            }
        }
        return start; // this part executes once the while loop violates hence we can either return
                      // start / end
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 5, 6, 4 };
        System.out.println(findPeakElement(arr));
    }
}
