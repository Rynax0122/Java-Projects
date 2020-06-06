public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }

    public static boolean isPalindrome(int number) {

        int originalValue = number;
        int reverse = 0;
        int lastDigit = 0;

        while (number != 0) {
            lastDigit = number % 10;
            number = number / 10;
            reverse = (reverse + lastDigit) * 10;
        }

        reverse /= 10;
        if (reverse == originalValue) {
            return true;
        } else {
            return false;
        }
    }
}
