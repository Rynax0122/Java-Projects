public class PerfectSquare {

    public static String perfectSquare(int firstNum, int secondNum, int thirdNum, int forthNum) {
        double square = Math.sqrt(firstNum);
        double extra = square - 1;
        extra = (int)extra;
        return ("(n + " + extra + ") to power of 2");
    }
}
