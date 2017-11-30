package codingbat.warmUp1;

/**
 * Problem NearHundred.
 Given an int n, return true if it is within 10 of 100 or 200.
 Note: Math.abs(num) computes the absolute value of a number.

 NearHundred(93) → true
 NearHundred(90) → true
 NearHundred(89) → false
 */
public class NearHundred {
    public static boolean nearHundred(int n){  // Problem "NearHundred" solve method.
        return ((Math.abs(100 - n) <= 10) || Math.abs(200 - n) <= 10);
    }
}
