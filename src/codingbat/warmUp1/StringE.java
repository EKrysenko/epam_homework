package codingbat.warmUp1;

/** Problem StringE
 * Return true if the given string contains between 1 and 3 'e' chars.
 *
 * stringE("Hello") → true
 * stringE("Heelle") → true
 * stringE("Heelele") → false
 */

public class StringE {
    public static boolean stringE(String str){  // Problem "stringE" solve method.
        char[] chr = str.toCharArray();
        int count = 0;
        for(char c : chr){
            if (c == 'e'){
                ++count;
            }
        }
        return (count >= 1 && count <= 3);
    }
}
