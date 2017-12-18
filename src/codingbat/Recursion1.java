package codingbat;

public class Recursion1 {

    /**
     * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
     * Compute the result recursively (without loops).
     * factorial(1) → 1
     * factorial(2) → 2
     * factorial(3) → 6
     */
    public int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    /**
     * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears.
     * The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return
     * the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
     * bunnyEars2(0) → 0
     * bunnyEars2(1) → 2
     * bunnyEars2(2) → 5
     */
    public int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        if (bunnies % 2 == 1) {
            return 2 + bunnyEars2(bunnies - 1);
        }
        return 3 + bunnyEars2(bunnies - 1);
    }

    /**
     * Given a non-negative int n, return the count of the occurrences of 7 as a digit,
     * so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit
     * (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     * count7(717) → 2
     * count7(7) → 1
     * count7(123) → 0
     */
    public int count7(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        }
        return count7(n / 10);
    }

    /**
     * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
     * countX("xxhixx") → 4
     * countX("xhixhix") → 3
     * countX("hi") → 0
     */
    public int countX(String str) {
        if (str.length() == 0) {
            return 0;
        }
        if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1));
        }
        return countX(str.substring(1));
    }

    /**
     * Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".
     * changePi("xpix") → "x3.14x"
     * changePi("pipi") → "3.143.14"
     * changePi("pip") → "3.14p"
     */
    public String changePi(String str) {
        if (str.length() < 2) {
            return str;
        }
        if (str.substring(0, 2).equals("pi")) {
            return "3.14" + changePi(str.substring(2));
        }
        return str.charAt(0) + changePi(str.substring(1));
    }

    /**
     * Given an array of ints, compute recursively the number of times that the value 11 appears in the array.
     * We'll use the convention of considering only the part of the array that begins at the given index.
     * In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
     * array11([1, 2, 11], 0) → 1
     * array11([11, 11], 0) → 2
     * array11([1, 2, 3, 4], 0) → 0
     */
    public int array11(int[] nums, int index) {
        if (index >= nums.length) {
            return 0;
        }
        int d = nums[index] == 11 ? 1 : 0;
        return d + array11(nums, index + 1);
    }

    /**
     *Given a string, compute recursively a new string where identical chars that
     * are adjacent in the original string are separated from each other by a "*".
     * pairStar("hello") → "hel*lo"
     * pairStar("xxyy") → "x*xy*y"
     * pairStar("aaaa") → "a*a*a*a"
     */
    public String pairStar(String str) {
        return str;
    }



}
