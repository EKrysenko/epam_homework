package codingbat.warmUp2;

/**
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 *
 * stringBits("Hello") → "Hlo"
 * stringBits("Hi") → "H"
 * stringBits("Heeololeo") → "Hello"
 */

public class StringBits {
    public static String stringBits(String str){
        char[] chr = str.toCharArray();
        String result = "";
        for (int i = 0; i < chr.length; ++i){
            if(i % 2 == 0){
            result += chr[i];
            }
        }
        return result;
    }
}
