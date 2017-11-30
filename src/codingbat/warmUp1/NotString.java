package codingbat.warmUp1;

/* Problem notString.
    Given a string, return a new string where "not " has been added to the front.
    However, if the string already begins with "not", return the string unchanged.
    Note: use .equals() to compare 2 strings.

    notString("candy") → "not candy"
    notString("x") → "not x"
    notString("not bad") → "not bad"
    */
public class NotString {
    public static String notString(String str){  // Problem "notString" solve method.
        return isSubstring(str)? str : "not ".concat(str);
    }
    public static boolean isSubstring(String str){                    // Util method returns true if "str" lentght
        return str.length() > 2 && str.substring(0, 3).equals("not"); // more then 2 and first 3 chars equals "not".
    }
}
