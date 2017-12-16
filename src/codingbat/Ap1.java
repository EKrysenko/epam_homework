package codingbat;

import java.util.ArrayList;
import java.util.List;

public class Ap1 {

    /**
     * Given an array of scores, return true if each score is equal or
     * greater than the one before. The array will be length 2 or more.
     * scoresIncreasing([1, 3, 4]) → true
     * scoresIncreasing([1, 3, 2]) → false
     * scoresIncreasing([1, 1, 4]) → true
     */
    public boolean scoresIncreasing(int[] scores) {
        for (int i = 0; i + 1 < scores.length; ++i) {
            if (scores[i] > scores[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Given an array of scores, compute the int average of the first half and the second half,
     * and return whichever is larger. We'll say that the second half begins at index length/2.
     * The array length will be at least 2. To practice decomposition, write a separate helper method
     * int average(int[] scores, int start, int end) { which computes the average of the elements
     * between indexes start..end. Call your helper method twice to implement scoresAverage().
     * Write your helper method after your scoresAverage() method in the JavaBat text area.
     * Normally you would compute averages with doubles, but here we use ints so the expected results are exact.
     * scoresAverage([2, 2, 4, 4]) → 4
     * scoresAverage([4, 4, 4, 2, 2, 2]) → 4
     * scoresAverage([3, 4, 5, 1, 2, 3]) → 4
     */
    public int scoresAverage(int[] scores) {
        int half = scores.length / 2;
        return Math.max(average(scores, 0, half), average(scores, half, scores.length));
    }

    private int average(int[] scores, int start, int end) {
        int sum = 0;

        for (int i = start; i < end; ++i) {
            sum += scores[i];
        }
        return sum / (end - start);
    }

    /**
     * Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the
     * given length are omitted. See wordsWithout() below which is more difficult because it uses arrays.
     * wordsWithoutList(["a", "bb", "b", "ccc"], 1) → ["bb", "ccc"]
     * wordsWithoutList(["a", "bb", "b", "ccc"], 3) → ["a", "bb", "b"]
     * wordsWithoutList(["a", "bb", "b", "ccc"], 4) → ["a", "bb", "b", "ccc"]
     */
    public List wordsWithoutList(String[] words, int len) {
        List<String> list = new ArrayList<>();
        for (String str : words) {
            if (str.length() != len) {
                list.add(str);
            }
        }
        return list;
    }

    /**
     * Given an array of positive ints, return a new array of length "count" containing the first even
     * numbers from the original array. The original array will contain at least "count" even numbers.
     * copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
     * copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
     * copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
     */
    public int[] copyEvens(int[] nums, int count) {
        int[] evens = new int[count];
        int i = 0;
        int j = 0;
        while (count > 0) {
            if (nums[i] % 2 == 0) {
                evens[j] = nums[i];
                --count;
                ++j;
            }
            ++i;
        }
        return evens;
    }

    /**
     * The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b", "b"}.
     * the "answers" array contains a student's answers, with "?" representing a question left blank.
     * The two arrays are not empty and are the same length. Return the score for this array of answers,
     * giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank answer.
     * scoreUp(["a", "a", "b", "b"], ["a", "c", "b", "c"]) → 6
     * scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "c"]) → 11
     * scoreUp(["a", "a", "b", "b"], ["a", "a", "b", "b"]) → 16
     */
    public int scoreUp(String[] key, String[] answers) {
        int scores = 0;
        for (int i = 0; i < key.length; ++i) {
            if (answers[i].equals("?")) {
                continue;
            }
            if (answers[i].equals(key[i])) {
                scores += 4;
                continue;
            }
            --scores;
        }
        return scores;
    }

    /**
     * We have an array of heights, representing the altitude along a walking trail. Given start/end indexes
     * into the array, return the sum of the changes for a walk beginning at the start index and ending at
     * the end index. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a sum of 1 + 5 = 6.
     * The start end end index will both be valid indexes into the array with start <= end.
     * sumHeights([5, 3, 6, 7, 2], 2, 4) → 6
     * sumHeights([5, 3, 6, 7, 2], 0, 1) → 2
     * sumHeights([5, 3, 6, 7, 2], 0, 4) → 11
     */
    public int sumHeights(int[] heights, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; ++i)
            sum += Math.abs(heights[i] - heights[i + 1]);
        return sum;
    }

    /**
     * We have data for two users, A and B, each with a String name and an int id. The goal is to order
     * the users such as for sorting. Return -1 if A comes before B, 1 if A comes after B, and 0 if they
     * are the same. Order first by the string names, and then by the id numbers if the names are the same.
     * Note: with Strings str1.compareTo(str2) returns an int value which is negative/0/positive to indicate
     * how str1 is ordered to str2 (the value is not limited to -1/0/1).
     * (On the AP, there would be two User objects, but here the code simply takes the two strings and
     * two ints directly. The code logic is the same.)
     * userCompare("bb", 1, "zz", 2) → -1
     * userCompare("bb", 1, "aa", 2) → 1
     * userCompare("bb", 1, "bb", 1) → 0
     */
    public int userCompare(String aName, int aId, String bName, int bId) {
        int compareResult = 0;
        if (aName.compareTo(bName) < 0) {
            return -1;
        }
        if (aName.compareTo(bName) > 0) {
            return 1;
        }
        if (aId > bId) {
            return 1;
        }
        if (aId < bId) {
            return -1;
        }
        return compareResult;
    }


}
