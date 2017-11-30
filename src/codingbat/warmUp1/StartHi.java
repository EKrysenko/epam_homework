package codingbat.warmUp1;

/**
 * Problem startHi.
 *
 * Given a string, return true if the string starts with "hi" and false otherwise.
 * startHi("hi there") → true
 * startHi("hi") → true
 * startHi("hello hi") → false
 */

public class StartHi {
    public static boolean startHi(String str) { // Problem "startHi" solve method.
        if (str.length() < 2){
            return false;
        }
        return str.substring(0, 2).equals("hi");
    }
}
