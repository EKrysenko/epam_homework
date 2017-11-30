package codingbat.string1;

/**
 * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

 comboString("Hello", "hi") → "hiHellohi"
 comboString("hi", "Hello") → "hiHellohi"
 comboString("aaa", "b") → "baaab"
 */
public class ComboString {
    public static String comboString(String a, String b) {
        String tmp = "";
        if (a.length() < b.length()){
            tmp = a;
            a = b;
            b = tmp;
        }
        return b + a + b;
    }
}

