public class MinutesAndSecondsConverter {

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            return "Invalid value";
        } else {
            if (minutes > 60) {
                int hours = minutes / 60;
                int minute = minutes % 60;
                return (hours + "h " + minute + "m " + seconds + "s");
            } else {
                return ("0h " + minutes + "m " + seconds + "s");
            }
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        } else {
            int minute = seconds / 60;
            int second = seconds % 60;
            return getDurationString(minute, second);
        }
    }
}