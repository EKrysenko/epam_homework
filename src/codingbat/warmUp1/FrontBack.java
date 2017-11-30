package codingbat.warmUp1;

/**
 * Problem frontBack
 *Given a string, return a new string where the first and last chars have been exchanged.

 *frontBack("code") → "eodc"
 *frontBack("a") → "a"
 *frontBack("ab") → "ba"
 */
public class FrontBack {
    public static String frontBack(String str) {  // Problem "frontBack" solve method.
        if (str.length() <= 1){
            return str;
        }
        char front = str.charAt(0);
        char back = str.charAt(str.length() - 1);
        return "" + back + str.substring(1, str.length() - 1) + front;
    }
}
