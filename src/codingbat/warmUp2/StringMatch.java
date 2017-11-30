package codingbat.warmUp2;

/**
 * Given 2 strings, a and b, return the number of the positions where they
 * contain the same length 2 substring.
 * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az"
 * substrings appear in the same place in both strings.

 * stringMatch("xxcaazz", "xxbaaz") → 3
 * stringMatch("abc", "abc") → 2
 * stringMatch("abc", "axc") → 0
 */

public class StringMatch {
    public static int stringMatch(String a, String b){
        int result = 0;
        String tmp = "";
        if (a.length() > b.length()){
            tmp = a;
            a = b;
            b = tmp;
        }
        for (int i = 0; i < a.length() - 1; ++i){
            String subA = a.substring(i, i + 2);
            String subB = b.substring(i, i + 2);
            if(subA.equals(subB)){
                ++result;
            }
        }
        return result;
    }
}
