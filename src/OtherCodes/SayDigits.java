package OtherCodes;

public class SayDigits {

    static String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten" };

    public static void SayDigit(int n) {

        if (n == 0) {
            return;
        }
        // int temp = n;
        // n /= 10;
        SayDigit(n / 10);
        System.out.println(arr[n % 10]);

    }

    public static void main(String[] args) {
        SayDigit(523);
    }

}
