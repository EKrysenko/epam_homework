package codingbat.string1;

/**
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the concatenation creates a double-char,
 * then omit one of the chars, so "abc" and "cat" yields "abcat".

 conCat("abc", "cat") → "abcat"
 conCat("dog", "cat") → "dogcat"
 conCat("abc", "") → "abc"
 */
public class ConCat {
    public static String conCat(String a, String b) {
        if(isDoubleChar(a, b)){
            return a.substring(0, a.length() - 1).concat(b);
        }
        return a.concat(b);
    }

    public static boolean isDoubleChar(String a, String b) { // Util method returns true if last char
        if (a.length() == 0 || b.length() == 0) {            // of a == first char of b.
            return false;
        }
        return (a.charAt(a.length() - 1) == b.charAt(0));
    }
}

