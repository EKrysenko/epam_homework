package codingbat.warmUp1;

/**
 * Problem mixStart.
 *
 * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
 * mixStart("mix snacks") → true
 * mixStart("pix snacks") → true
 * mixStart("piz snacks") → false
 */

public class MixStart {
    public static boolean mixStart(String str){  // Problem "mixStart" solve method.
        if (str.length() < 3){
            return false;
        }
        return (str.substring(1, 3).equals("ix"));
    }
}
