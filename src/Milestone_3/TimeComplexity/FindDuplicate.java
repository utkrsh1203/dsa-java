package Milestone_3.TimeComplexity;

import java.util.*;

public class FindDuplicate {
    public static int findDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (

                int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return arr[i];
            }
        }
        return arr[arr.length - 1];

    }

    public static int findDuplicate2(int[] arr) {
        int sumOfNminusTwoNaturalNumbers = 0;
        for (int i = 0; i < (arr.length - 1); i++) {
            sumOfNminusTwoNaturalNumbers += i;
        }
        int sumOfElements = 0;
        for (int i = 0; i < arr.length; i++) {
            sumOfElements += arr[i];
        }
        return (sumOfElements - sumOfNminusTwoNaturalNumbers);
    }

}
