public class MinutesToYearsCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long numOfHours = minutes / 60;
            int numOfDays = (int)(numOfHours / 24);
            int numOfYears = numOfDays / 365;
            int remainingNumOfDays = numOfDays % 365;
            System.out.println(minutes + " min = " + numOfYears + " y and " + remainingNumOfDays + " d");
        }
    }
}
