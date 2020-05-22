public class CommonDifference {

    public static String commonDifference(int firstNum, int secondNum, int thirdNum, int forthNum) {
        int difference = secondNum - firstNum;
        if (firstNum - difference > 0) {
            int base = firstNum - difference;
            return (difference + "n + " + base);
        } else {
            int negative = firstNum - difference;
            return (difference + "n " + negative);
        }
    }
}
