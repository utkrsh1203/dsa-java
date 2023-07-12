package JavaImpFunctions;

public class ConvertStringToInt {
    public static int convertStringToInt(String input) {
        // Write your code here
        if (input.length() == 0) {
            return 0;
        }
        // Ascii value of '0' is 48, therefore to get the integer value of 48 we
        // subtract by 48.
        int n = input.charAt(0) - 48;

        for (int i = 0; i < input.length() - 1; i++) {
            n *= 10;
        }

        return n + convertStringToInt(input.substring(1));
    }
}
