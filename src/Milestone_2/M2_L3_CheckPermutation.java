package Milestone_2;

public class M2_L3_CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
        // Your code goes here
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            int asc = str1.charAt(i) - 'a';
            arr1[asc]++;
        }
        for (int i = 0; i < str2.length(); i++) {
            int asc = str2.charAt(i) - 'a';
            arr2[asc]++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
