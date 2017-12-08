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
    public static String starOut(String str) {
        int [] index = new int [str.length() + 2];
        String result = "";

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == '*') {
                index[i] = 1;
                index[i + 1] = 1;
                index[i + 2] = 1;
            }
        }
        for (int i = 1; i + 1 < index.length; ++i) {
            if (index[i] == 0) {
                result += "" + str.charAt(i - 1);
            }
        }
        return result;
    }

    /**
     * Return the number of times that the string "hi" appears anywhere in the given string.
     * countHi("abc hi ho") → 1
     * countHi("ABChi hi") → 2
     * countHi("hihi") → 2
     */
    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i + 1 < str.length(); ++i) {
            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                ++count;
            }
        }
        return count;
    }

    /**
     * Given two strings, return true if either of the strings appears at the very end
     * of the other string, ignoring upper/lower case differences
     * (in other words, the computation should not be "case sensitive").
     * endOther("Hiabc", "abc") → true
     * endOther("AbC", "HiaBc") → true
     * endOther("abc", "abXabc") → true
     */
    public static boolean endOther(String a, String b) {
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();

        if (a.length() < b.length()) {
            lowerA = b.toLowerCase();
            lowerB = a.toLowerCase();
        }
        int aLen = lowerA.length();
        int bLen = lowerB.length();
        return lowerB.equals(lowerA.substring(aLen - bLen, aLen));
    }

    /**
     * We'll say that a String is xy-balanced if for all the 'x' chars in the string,
     * there exists a 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not.
     * One 'y' can balance multiple 'x's. Return true if the given string is xy-balanced.
     * xyBalance("aaxbby") → true
     * xyBalance("aaxbb") → false
     * xyBalance("yaaxbb") → false
     */
    public static boolean xyBalance(String str) {
        if (str.length() == 1 && str.charAt(0) == 'x' ) {
            return false;
        }
        int xIndex = 0;
        int yIndex = 0;

        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'x') {
                xIndex = i;
            }
            if (str.charAt(i) == 'y') {
                yIndex = i;
            }
        }
        return xIndex <= yIndex;
    }

    /**
     * Given a string and an int n, return a string made of the first n characters of the string,
     * followed by the first n-1 characters of the string, and so on.
     * You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
     * repeatFront("Chocolate", 4) → "ChocChoChC"
     * repeatFront("Chocolate", 3) → "ChoChC"
     * repeatFront("Ice Cream", 2) → "IcI"
     */
    public static String repeatFront(String str, int n) {
        String result = "";
        for (int i = n; i >= 1; --i) {
            result += str.substring(0, i);
        }
        return result;
    }

    /**
     * Given a string, does "xyz" appear in the middle of the string?
     * To define middle, we'll say that the number of chars to the left and right of the "xyz"
     * must differ by at most one. This problem is harder than it looks.
     * xyzMiddle("AAxyzBB") → true
     * xyzMiddle("AxyzBB") → true
     * xyzMiddle("AxyzBBB") → false
     */
    public static boolean xyzMiddle(String str) {
        if (str.length() < 3) {
            return false;
        }
        int middle =  str.length() / 2;
        if (str.length() % 2 != 0) {
            return str.substring(middle - 1, middle + 2).equals("xyz");
        }
        return str.substring(middle - 2, middle + 1).equals("xyz") ||
                str.substring(middle - 1, middle + 2).equals("xyz");
    }

    /**
     * Given a string, compute a new string by moving the first char to come after the next two chars,
     * so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars,
     * so "abcdef" yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
     * oneTwo("abc") → "bca"
     * oneTwo("tca") → "cat"
     * oneTwo("tcagdo") → "catdog"
     */
    public static String oneTwo(String str) {
        String result = "";
        for (int i = 0; i + 2 < str.length(); ++i) {
            if (i % 3 == 0) {
                result += "" + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
            }
        }
        return result;
    }

    /**
     * Given a string and a non-empty word string, return a version of the original
     * String where all chars have been replaced by pluses ("+"), except for appearances
     * of the word string which are preserved unchanged.
     * plusOut("12xy34", "xy") → "++xy++"
     * plusOut("12xy34", "1") → "1+++++"
     * plusOut("12xy34xyabcxy", "xy") → "++xy++xy+++xy"
     */
    public static String plusOut(String str, String word) {
        String result = "";
        int sLen = str.length();
        int wLen = word.length();
        int pos = 0;

        for(int i = pos; i + wLen <= sLen; i++){
            if(str.substring(i, i + wLen).equals(word)){
                result += word;
                i += wLen - 1;
                pos += word.length();
            } else {
                result += "+";
                pos++;
            }
        }
        for(int i = pos; i < str.length(); i++){
            result += "+";
        }
        return result;
    }

    /**
     * Return true if the string "cat" and "dog" appear the same number of times in the given string.
     * catDog("catdog") → true
     * catDog("catcat") → false
     * catDog("1cat1cadodog") → true
     */
    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i + 2 < str.length(); ++i) {
            if (str.charAt(i) == 'd' &&
                    str.charAt(i + 1) == 'o' &&
                    str.charAt(i + 2) == 'g') {
                ++dogCount;
            }
            if (str.charAt(i) == 'c' &&
                    str.charAt(i + 1) == 'a' &&
                    str.charAt(i + 2) == 't') {
                ++catCount;
            }
        }
        return catCount == dogCount;
    }

    /**
     * Return true if the given string contains an appearance of "xyz" where the xyz
     * is not directly preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
     * xyzThere("abcxyz") → true
     * xyzThere("abc.xyz") → false
     * xyzThere("xyz.abc") → true
     */
    public static boolean xyzThere(String str) {
        if (!str.contains("xyz")) {
            return false;
        }
        for (int i = 0; i + 2 < str.length(); ++i) {
            int j = str.indexOf("xyz", i);
            if (j == 0) {
                return true;
            }
            if (str.charAt(j - 1) != '.') {
                return true;
            }
        }
        return false;
    }

    /**
     * Given two strings, a and b, create a bigger string made of the first char of a,
     * the first char of b, the second char of a, the second char of b, and so on.
     * Any leftover chars go at the end of the result.
     * mixString("abc", "xyz") → "axbycz"
     * mixString("Hi", "There") → "HTihere"
     * mixString("xxxx", "There") → "xTxhxexre"
     */
    public static String mixString(String a, String b) {
        int len = b.length();
        String result = "";
        if (a.length() < b.length()) {
            len = a.length();
        }
        for (int i = 0; i < len; ++i) {
            result += "" + a.charAt(i) + b.charAt(i);
        }
        result += a.substring(len, a.length()) + b.substring(len, b.length());
        return result;
    }

    /**
     * Given two strings, word and a separator sep, return a big string made of count
     * occurrences of the word, separated by the separator string.
     * repeatSeparator("Word", "X", 3) → "WordXWordXWord"
     * repeatSeparator("This", "And", 2) → "ThisAndThis"
     * repeatSeparator("This", "And", 1) → "This"
     */
    public static String repeatSeparator(String word, String sep, int count) {
        String result = "";
        if (count == 0) {
            return result;
        }
        for (int i = 0; i + 1 < count; ++i) {
            result += word + sep;
        }
        result += word;
        return result;
    }

    /**
     * A sandwich is two pieces of bread with something in between. Return the string that is between
     * the first and last appearance of "bread" in the given string, or return the empty string ""
     * if there are not two pieces of bread.
     * getSandwich("breadjambread") → "jam"
     * getSandwich("xxbreadjambreadyy") → "jam"
     * getSandwich("xxbreadyy") → ""
     */
    public static String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        return first == last ? "" : str.substring(first + 5, last);
    }

    /**
     * Look for patterns like "zip" and "zap" in the string -- length-3,
     * starting with 'z' and ending with 'p'. Return a string where for all such words,
     * the middle letter is gone, so "zipXzap" yields "zpXzp".
     * zipZap("zipXzap") → "zpXzp"
     * zipZap("zopzop") → "zpzp"
     * zipZap("zzzopzop") → "zzzpzp"
     */
    public static String zipZap(String str) {
        return str.replaceAll("z.p", "zp");
    }

    /**
     * Given a string and a non-empty word string, return a string made of each char just
     * before and just after every appearance of the word in the string.
     * Ignore cases where there is no char before or after the word, and a char
     * may be included twice if it is between two words.
     * wordEnds("abcXY123XYijk", "XY") → "c13i"
     * wordEnds("XY123XY", "XY") → "13"
     * wordEnds("XY1XY", "XY") → "11"
     */
    public static String wordEnds(String str, String word) {
        int sLen = str.length();
        int wLen = word.length();
        String result = "";

        for (int i = 0; i < sLen - wLen + 1; i++) {
            String tmp = str.substring(i, i + wLen);
            if (i > 0 && tmp.equals(word)) {
                result += str.substring(i - 1, i);
            }
            if (i < sLen - wLen && tmp.equals(word)) {
                result += str.substring(i + wLen, i + wLen + 1);
            }
        }
        return result;
    }
}
