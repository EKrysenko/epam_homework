package codingbat;

public class String3 {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy"
     * and the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive).
     * We'll say that a y or z is at the end of a word if there is not an alphabetic letter
     * immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * countYZ("fez day") → 2
     * countYZ("day fez") → 2
     * countYZ("day fyyyz") → 2
     */
    public int countYZ(String str) {
        int count = 0;
        String[] strForCheck = str.toLowerCase().split("[^a-z]");
        for (String string : strForCheck) {
            count += countLastChars(string, 'y', 'z');
        }
        return count;
    }
    private int countLastChars(String str, char y, char z) {
        int count = 0;
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(str.length() - 1) == y ||
                str.charAt(str.length() - 1) == z) {
            ++count;
        }
        return count;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
     * immediately to its left or right. Return true if all the g's in the given string are happy.
     * gHappy("xxggxx") → true
     * gHappy("xxgxx") → false
     * gHappy("xxggyygxx") → false
     */
    public boolean gHappy(String str) {
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'g') {
                int j = i;
                int count = 0;
                while (j < str.length() && str.charAt(j) == 'g') {
                    ++count;
                    ++j;
                }
                if (count < 2) {
                    return false;
                }
                i += count;
            }
        }
        return true;
    }

    /**
     * Given a string, return the longest substring that appears at both the beginning
     * and end of the string without overlapping. For example, sameEnds("abXab") is "ab".
     * sameEnds("abXYab") → "ab"
     * sameEnds("xx") → "x"
     * sameEnds("xxx") → "x"
     */
    public String sameEnds(String string) {
        int len = string.length();
        int count = len / 2 ;
        while (count > 0 &&
                !string.substring(0, count).equals(string.substring(len - count, len))) {
            --count;
        }
        return string.substring(0, count);
    }

    /**
     * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
     * A number is a series of 1 or more digit chars in a row.
     * sumNumbers("abc123xyz") → 123
     * sumNumbers("aa11b33") → 44
     * sumNumbers("7 11") → 18
     */
    public int sumNumbers(String str) {
        String[] strings = str.split("[^1-9]");
        int sum = 0;
        for (String string : strings) {
            sum += findInt(string);
        }
        return sum;
    }
    private int findInt(String str) {
        int sum = 0;
        String value = "";
        for (int i = 0; i < str.length(); ++i) {
            if (Character.isDigit(str.charAt(i))) {
                value += "" + str.charAt(i);
                sum = Integer.parseInt(value);
            }
        }
        return sum;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all
     * instances of the remove string have been removed (not case sensitive).
     * You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * withoutString("Hello there", "llo") → "He there"
     * withoutString("Hello there", "e") → "Hllo thr"
     * withoutString("Hello there", "x") → "Hello there"
     */
    public String withoutString(String base, String remove) {
        String result = "";
        int bLen = base.length();
        int rLen = remove.length();

        for (int i = 0; i < bLen; i++) {
            if (i + rLen < bLen  + 1 && base.substring(i, i + rLen).toLowerCase().equals(remove.toLowerCase())) {
                i = i + rLen - 1;
                continue;
            }
            result += base.substring(i, i + 1);
        }
        return result;
    }

    /**
     *We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * countTriple("abcXXXabc") → 1
     * countTriple("xxxabyyyycd") → 3
     * countTriple("a") → 0
     */
    public int countTriple(String str) {
        int count = 0;
        for (int i = 0; i + 2 < str.length(); ++i) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
                System.out.println(str.charAt(i));
                ++count;
            }
        }
        return count;
    }

    /**
     *Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
     * In other words, zero or more characters at the very begining of the given string, and at the very
     * end of the string in reverse order (possibly overlapping).
     * mirrorEnds("abXYZba") → "ab"
     * mirrorEnds("abca") → "a"
     * mirrorEnds("aba") → "aba"
     */
    private String mirrorEnds(String string) {
        int count = 0;
        int i= 0;
        int len = string.length();

        while (i < len) {
            if (string.charAt(count) == string.charAt(len - count - 1)) {
                ++count;
            }
            ++i;
        }
        return string.substring(0, count);
    }



}
