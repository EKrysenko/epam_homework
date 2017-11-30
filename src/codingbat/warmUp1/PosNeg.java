package codingbat.warmUp1;

/**Problem posNeg.
 *Given 2 int values, return true if one is negative and one is positive.
 *Except if the parameter "negative" is true, then return true only if both are negative.
 *
 *posNeg(1, -1, false) → true
 *posNeg(-1, 1, false) → true
 *posNeg(-4, -5, true) → true
 */
public class PosNeg {
    public static boolean posNeg(int a, int b, boolean negative) {  // Problem "posNeg" solve method.
        if (negative){
            return a < 0 && b < 0;
        }
        if (a == 0 || b == 0){
            return false;
        }
        return a < 0 != b < 0;
    }
}
