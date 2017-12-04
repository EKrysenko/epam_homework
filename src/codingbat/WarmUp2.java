package codingbat;

import static codingbat.WarmUp1.getFront;

public class WarmUp2 {

    /**
     * Given a string and a non-negative int n, return a larger string that is n copies of the original string.
     *
     * stringTimes("Hi", 2) → "HiHi"
     * stringTimes("Hi", 3) → "HiHiHi"
     * stringTimes("Hi", 1) → "Hi"
     */
    public static String stringTimes(String str, int n) {
        String result = "";
        if (str.length() < 1){
            return str;
        }
        for (int i = 0; i < n; ++i){
            result += str;
        }
        return result;
    }

    /**
     * Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
     *
     * doubleX("axxbb") → true
     * doubleX("axaxax") → false
     * doubleX("xxxxx") → true
     */
    public static boolean  doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1){
            return false;
        }
        if (i + 1 >= str.length()) {
            return false;
        }
        return str.substring(i+1, i+2).equals("x");
    }

    /**
     * Given a string, return the count of the number of times that a substring
     * length 2 appears in the string and also as the last 2 chars of the string,
     * so "hixxxhi" yields 1 (we won't count the end substring).

     *last2("hixxhi") → 1
     *last2("xaxxaxaxx") → 1
     *last2("axxxaaxx") → 2
     */
    public static int last2(String str) {
        if (str.length() < 2){
            return 0;
        }
        String back = str.substring(str.length() - 2);
        int count = 0;
        for (int i=0; i < str.length() - 2; ++i){
            String tmp = str.substring(i, i+2);
            if (tmp.equals(back)){
                ++count;
            }
        }
        return count;
    }

    /**
     * Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

     * array123([1, 1, 2, 3, 1]) → true
     * array123([1, 1, 2, 4, 1]) → false
     * array123([1, 1, 2, 1, 2, 3]) → true
     */

    public static boolean array123(int[] nums) {
        for (int i = 0; i + 2 < nums.length; ++i){
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3){
                return true;
            }
        }
        return false;
    }

    /**
     * altPairs
     * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
     * altPairs("kitten") → "kien"
     * altPairs("Chocolate") → "Chole"
     * altPairs("CodingHorror") → "Congrr"
     */
    public static String altPairs(String str) {
        String result = "";
        char[] chr = str.toCharArray();

        for (int i = 0; i < chr.length; i += 4){
            result += "" + chr[i];
            if (i < chr.length - 1){
                result += chr[i + 1];
            }
        }
        return result;
    }

    /**
     * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
     *
     * noTriples([1, 1, 2, 2, 1]) → true
     * noTriples([1, 1, 2, 2, 2, 1]) → false
     * noTriples([1, 1, 1, 2, 2, 2, 1]) → false
     */
    public static boolean noTriples(int[] nums) {
        int count = 0;
        for(int i = 0; i + 1 < nums.length; ++i){
            int tmp = nums[i];
            if(nums[i + 1] == tmp){
                ++count;
            }else{
                count = 0;
            }
            if(count == 2){
                return false;
            }
        }
        return true;
    }

    /**
     * Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

     * frontTimes("Chocolate", 2) → "ChoCho"
     * frontTimes("Chocolate", 3) → "ChoChoCho"
     * frontTimes("Abc", 3) → "AbcAbcAbc"
     */
    public static String frontTimes(String str, int n) {
        String result = "";
        String front = getFront(str, 3);
        for (int i = 0; i < n; ++i){
            result += front;
        }
        return result;
    }

    /**
     * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
     *
     * stringBits("Hello") → "Hlo"
     * stringBits("Hi") → "H"
     * stringBits("Heeololeo") → "Hello"
     */
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

    /**
     * Given an array of ints, return the number of 9's in the array.
     * arrayCount9([1, 2, 9]) → 1
     * arrayCount9([1, 9, 9]) → 2
     * arrayCount9([1, 9, 9, 3, 9]) → 3
     */
    public static int arrayCount9(int[] nums){
        int count = 0;
        for (int i : nums) {
            if(i == 9){
                ++count;
            }
        }
        return count;
    }

    /**
     * Given 2 strings, a and b, return the number of the positions where they
     * contain the same length 2 substring.
     * So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az"
     * substrings appear in the same place in both strings.

     * stringMatch("xxcaazz", "xxbaaz") → 3
     * stringMatch("abc", "abc") → 2
     * stringMatch("abc", "axc") → 0
     */
    public static int stringMatch(String a, String b){
        int result = 0;
        String tmp = "";
        if (a.length() > b.length()){
            tmp = a;
            a = b;
            b = tmp;
        }
        for (int i = 0; i + 1 < a.length(); ++i){
            String subA = a.substring(i, i + 2);
            String subB = b.substring(i, i + 2);
            if(subA.equals(subB)){
                ++result;
            }
        }
        return result;
    }

    /**
     * Suppose the string "yak" is unlucky. Given a string,
     * return a version where all the "yak" are removed, but the "a"
     * can be any char. The "yak" strings will not overlap.

     * stringYak("yakpak") → "pak"
     * stringYak("pakyak") → "pak"
     * stringYak("yak123ya") → "123ya"
     */
    public static String stringYak(String str) {
        return str.replaceAll("y.k", "");
    }

    /**
     * Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value,
     * followed by the value plus 5, followed by the value minus 1.
     * Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

     * has271([1, 2, 7, 1]) → true
     * has271([1, 2, 8, 1]) → false
     * has271([2, 7, 1]) → true
     */
    public static boolean has271(int[] nums) {
        for (int i=0; i + 2 < nums.length; i++) {
            int val = nums[i];
            if (nums[i + 1] == (val + 5) && Math.abs(nums[i + 2] - (val - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }

    /**
     * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

     * countXX("abcxx") → 1
     * countXX("xxx") → 2
     * countXX("xxxx") → 3
     */
    public static int countXX(String str) {
        int count = 0;

        for(int i = 0; i < str.length() - 1; ++i){
            if(str.charAt(i) == 'x' && str.charAt(i + 1) == 'x'){
                ++count;
            }
        }
        return count;
    }

    /**
     * Given a non-empty string like "Code" return a string like "CCoCodCode".


     stringSplosion("Code") → "CCoCodCode"
     stringSplosion("abc") → "aababc"
     stringSplosion("ab") → "aab"
     */
    public static String stringSplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); ++i){
            result += str.substring(0, i + 1);
        }
        return result;
    }

    /**
     * Problem arrayFront9
     * Given an array of ints, return true if one of the first 4 elements in the array is a 9.
     * The array length may be less than 4.
     * arrayFront9([1, 2, 9, 3, 4]) → true
     * arrayFront9([1, 2, 3, 4, 9]) → false
     * arrayFront9([1, 2, 3, 4, 5]) → false
     */
    public static boolean arrayFront9(int[] nums) {
        int area = nums.length;
        area = Math.min(area, 4);
        for (int i = 0; i < area; ++i){
            if (nums[i] == 9){
                return true;
            }
        }
        return false;
    }

    /**
     * Problem stringX
     * Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.
     * stringX("xxHxix") → "xHix"
     * stringX("abxxxcd") → "abcd"
     * stringX("xabxxxcdx") → "xabcdx"
     */
    public static String stringX(String str) {
        int len = str.length();
        if (len <= 2){
            return str;
        }
        String result = "" + str.charAt(0) + str.substring(1, len - 1).replaceAll("x", "") + str.charAt(len - 1);
        return result;
    }

    /**
     * Problem array667
     * Given an array of ints, return the number of times that two 6's are next to each other in the array.
     * Also count instances where the second "6" is actually a 7.
     * array667([6, 6, 2]) → 1
     * array667([6, 6, 2, 6]) → 1
     * array667([6, 7, 2, 6]) → 1
     */
    public static int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; ++i){
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)){
                ++count;
            }
        }
        return count;
    }




}
