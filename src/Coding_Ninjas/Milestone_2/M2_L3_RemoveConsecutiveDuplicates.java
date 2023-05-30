package Coding_Ninjas.Milestone_2;

public class M2_L3_RemoveConsecutiveDuplicates {
    public static String removeConsecutiveDuplicates(String str) {
        // Your code goes here
        String str1 = "";

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                continue;
            }
            str1 += str.charAt(i);
        }

        return str1;
    }

    public static void main(String[] args) {
        System.out.println(removeConsecutiveDuplicates("hih"));
    }
}
