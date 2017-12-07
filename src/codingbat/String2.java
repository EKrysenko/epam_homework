package codingbat;

public class String2 {

    /**
     * Given a string, return a string where for every char in the original, there are two chars.
     * doubleChar("The") → "TThhee"
     * doubleChar("AAbb") → "AAAAbbbb"
     * doubleChar("Hi-There") → "HHii--TThheerree"
     */
    public static String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); ++i) {
            result += "" + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

    /**
     * Return the number of times that the string "code" appears anywhere in the given string,
     * except we'll accept any letter for the 'd', so "cope" and "cooe" count.
     * countCode("aaacodebbb") → 1
     * countCode("codexxcode") → 2
     * countCode("cozexxcope") → 2
     */
    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i + 3 < str.length(); ++i) {
            if (str.charAt(i) == 'c'     &&
                str.charAt(i + 1) == 'o' &&
                str.charAt(i + 3) == 'e') {
                ++count;
            }
        }
        return count;
    }

    /**
     * Return true if the given string contains a "bob" string,
     * but where the middle 'o' char can be any char.
     * bobThere("abcbob") → true
     * bobThere("b9b") → true
     * bobThere("bac") → false
     */
    public static boolean bobThere(String str) {
        return str.matches(".*b.b.*");
    }

    /**
     * Given a string and an int n, return a string made of n repetitions
     * of the last n characters of the string. You may assume that n is
     * between 0 and the length of the string, inclusive.
     * repeatEnd("Hello", 3) → "llollollo"
     * repeatEnd("Hello", 2) → "lolo"
     * repeatEnd("Hello", 1) → "o"
     */
    public static String repeatEnd(String str, int n) {
        String result = "";
        for (int i = 0; i < n; ++i) {
            result += "" + str.substring(str.length() - n, str.length());
        }
        return result;
    }

    /**
     * Given a string, consider the prefix string made of the first N chars of the string.
     * Does that prefix string appear somewhere else in the string?
     * Assume that the string is not empty and that N is in the range 1..str.length().
     * prefixAgain("abXYabc", 1) → true
     * prefixAgain("abXYabc", 2) → true
     * prefixAgain("abXYabc", 3) → false
     */
    public static boolean prefixAgain(String str, int n) {
        final String PREFIX = str.substring(0, n);
        return str.substring(n, str.length()).contains(PREFIX);
    }

    /**
     * Returns true if for every '*' (star) in the string,
     * if there are chars both immediately before and after the star, they are the same.
     * sameStarChar("xy*yzz") → true
     * sameStarChar("xy*zzz") → false
     * sameStarChar("*xa*az") → true
     */
    public boolean sameStarChar(String str) {
        for (int i = 1; i + 1 < str.length(); ++i) {
            if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)){
                return false;
            }
        }
        return true;
    }

    /**
     * Return a version of the given string, where for every star (*)
     * in the string the star and the chars immediately to its left and right are gone.
     * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
     * starOut("ab*cd") → "ad"
     * starOut("ab**cd") → "ad"
     * starOut("sm*eilly") → "silly"
     */




}
