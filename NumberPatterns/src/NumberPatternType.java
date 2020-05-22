public class NumberPatternType {

    public static String typeIdentifier(int firstNum, int secondNum, int thirdNum, int forthNum) {

        if (secondNum - firstNum == forthNum - thirdNum) { // common difference or common multiple
            if (forthNum / firstNum != 0) { // common difference
                return CommonDifference.commonDifference(firstNum, secondNum, thirdNum, forthNum);
            } else { // common multiple
                return CommonMultiple.commonMultiple(firstNum, secondNum, thirdNum, forthNum);
            }
        } else {
            if ((forthNum % thirdNum == 0) && (thirdNum % secondNum == 0)) { // common ratio
                return CommonRatio.commonRatio(firstNum, secondNum, thirdNum, forthNum);
            } else if (Math.sqrt(firstNum) % 1 == 0) { // perfect square
                return PerfectSquare.perfectSquare(firstNum, secondNum, thirdNum, forthNum);
            } else { // the cube one
                return TheCubeOne.theCubeOne(firstNum, secondNum, thirdNum, forthNum);
            }
        }
    }


}
