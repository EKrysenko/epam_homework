package codingbat.string1;

/**
 * Given two strings, append them together (known as "concatenation")
 * and return the result. However, if the strings are different lengths,
 * omit chars from the longer string so it is the same length as the shorter string.
 * So "Hello" and "Hi" yield "loHi". The strings may be any length.

 minCat("Hello", "Hi") → "loHi"
 minCat("Hello", "java") → "ellojava"
 minCat("java", "Hello") → "javaello"
 */
public class MinCat {
    public static String minCat(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();

        if(aLen > bLen){
            return a.substring(aLen - bLen) + b;
        }
        if(aLen < bLen){
            return a + b.substring(bLen - aLen);
        }

        return a.concat(b);
    }
}
