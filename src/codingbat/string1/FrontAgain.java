package codingbat.string1;

/**
 * Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


 frontAgain("edited") → true
 frontAgain("edit") → false
 frontAgain("ed") → true
 */
public class FrontAgain {
    public static boolean frontAgain(String str) {
        int len = str.length();
        if (len < 2) {
            return false;
        }
        String front = str.substring(0, 2);
        String back = str.substring(len - 2, len);
        return front.equals(back);
    }
}

