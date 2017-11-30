package codingbat.warmUp1;

/**
 * Problem close10.
 * Given 2 int values, return whichever value is nearest to the value 10,
 * or return 0 in the event of a tie.
 * Note that Math.abs(n) returns the absolute value of a number.
 * close10(8, 13) → 8
 * close10(13, 8) → 8
 * close10(13, 7) → 0
 */

public class Close10 {
    public static int close10(int a, int b){  // Problem "close10" solve method.
        int aTo10 = Math.abs(10 - a);
        int bTo10 = Math.abs(10 - b);
        if (aTo10 < bTo10){
            return a;
        }
        if(aTo10 > bTo10){
            return b;
        }
        return 0;
    }
}
