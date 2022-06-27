package Milestone_2;

public class M2_L3_RemoveCharacter {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        // Your code goes here
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                str1 += str.charAt(i);
            }
        }
        return str1;
    }

}
