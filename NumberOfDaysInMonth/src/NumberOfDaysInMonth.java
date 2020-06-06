public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        } else if (year % 4 == 0) {
            if (year % 100 != 0) {
                return true;
            } else if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int returnValue = 0;
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
             returnValue = -1;
        } else {
            switch (month) {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    returnValue = 31;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        returnValue = 29;
                    } else {
                        returnValue = 28;
                    }
                    break;
                default:
                    returnValue = 30;
                break;
            }
        }
        return returnValue;
    }
}
