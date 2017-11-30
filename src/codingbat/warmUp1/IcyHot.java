package codingbat.warmUp1;

/*
    Problem icyHot.
    Given two temperatures, return true if one is less than 0 and the other is greater than 100.

    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false
    */
public class IcyHot {
    public static boolean icyHot(int temp1, int temp2){    // Solve "icyHot" problem method.
        return isOk(temp1, temp2) || isOk(temp2, temp1);
    }
    private static boolean isOk(int a, int b){             // Util method returns true if int a less then 0
        return a < 0 && 100 < b;                           // and  int b greater then 100.
    }
}
