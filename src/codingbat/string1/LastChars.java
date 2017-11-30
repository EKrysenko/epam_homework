package codingbat.string1;

/**
 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
 * so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

 lastChars("last", "chars") → "ls"
 lastChars("yo", "java") → "ya"
 lastChars("hi", "") → "h@"
 */
public class LastChars {
    public static String lastChars(String a, String b) {
        char start = '@';
        char end = '@';
        if (a.length() != 0){
            start = a.charAt(0);
        }
        if (b.length() != 0){
            end = b.charAt(b.length() - 1);
        }
        return "" + start + end;
    }
}

