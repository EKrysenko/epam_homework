package codingbat.warmUp2;


import static codingbat.warmUp1.Front3.getFront;

/**
 * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

 * frontTimes("Chocolate", 2) → "ChoCho"
 * frontTimes("Chocolate", 3) → "ChoChoCho"
 * frontTimes("Abc", 3) → "AbcAbcAbc"
 */

public class FrontTimes {
    public static String frontTimes(String str, int n) {
        String result = "";
        String front = getFront(str, 3);
        for (int i = 0; i < n; ++i){
            result += front;
        }
        return result;
    }
}
