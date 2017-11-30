package codingbat.warmUp2;

/**
 *
 Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.


 stringX("xxHxix") → "xHix"
 stringX("abxxxcd") → "abcd"
 stringX("xabxxxcdx") → "xabcdx"
 */

public class StringX {
    public static String stringX(String str) {
        int len = str.length();
        if (len <= 2){
            return str;
        }
        String result = "" + str.charAt(0) + str.substring(1, len - 1).replaceAll("x", "") + str.charAt(len - 1);
        return result;
    }

}
