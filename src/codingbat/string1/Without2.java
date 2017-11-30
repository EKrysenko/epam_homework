package codingbat.string1;

/**
 * Given a string, if a length 2 substring appears at both its beginning and end,
 * return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
 * The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

 without2("HelloHe") → "lloHe"
 without2("HelloHi") → "HelloHi"
 without2("Hi") → ""
 */

public class Without2 {
    public static String without2(String str) {
        int len = str.length();
        if (len == 2){
            return "";
        }
        if (len < 2){
            return str;
        }
        String front = str.substring(0, 2);
        String back = str.substring(len - 2, len);
        return (front.equals(back) ? str.substring(2, len) : str);
    }
}
