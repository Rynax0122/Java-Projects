public class FeetAndInchesConverter {

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            return -1;
        } else {
            double centimeters = (feet * 12 + inches) * 2.54;
            System.out.println(feet + " feet + " + inches + " inches = " + centimeters + "cm");
            return centimeters;
        }
    }
}
