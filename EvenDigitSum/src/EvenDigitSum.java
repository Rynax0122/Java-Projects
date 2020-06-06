public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2222));
    }

    public static int getEvenDigitSum(int number) {
        int totalEvenSum = 0;

        if (number < 0) {
            return -1;
        } else {
            while (number != 0) {
                int evenTest = number % 10;
                number /= 10;
                if (evenTest % 2 == 0) {
                    totalEvenSum += evenTest;
                }
            }
            return totalEvenSum;
        }
    }
}
