package codingbat.string1;

/**
 * Given a string, return a version without the first 2 chars.
 * Except keep the first char if it is 'a' and keep the second char if it is 'b'.
 * The string may be any length. Harder than it looks.

 deFront("Hello") → "llo"
 deFront("java") → "va"
 deFront("away") → "aay"
 */

public class DeFront {
    public static String deFront(String str) {
        int len = str.length();
        String result = "";
        if(str.length() < 1){
            return result;
        }
        if(str.charAt(0) == 'a'){
            result += 'a';
        }
        if(str.length() < 2){
            return result;
        }
        if(str.charAt(1) == 'b'){
            result += 'b';
        }
        result += str.substring(2, len);
        return result;
    }
}
