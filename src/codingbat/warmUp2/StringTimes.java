package codingbat.warmUp2;

/**
 * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
 *
 * stringTimes("Hi", 2) → "HiHi"
 * stringTimes("Hi", 3) → "HiHiHi"
 * stringTimes("Hi", 1) → "Hi"
 */

public class StringTimes {
    public static String stringTimes(String str, int n) {
        String result = "";
        if (str.length() < 1){
            return str;
        }
        for (int i = 0; i < n; ++i){
            result += str;
        }
        return result;
    }
}
