package codingbat.array1;

/**
 * Given an array of ints of odd length, look at the first,
 * last, and middle values in the array and return the largest.
 * The array length will be a least 1.

 maxTriple([1, 2, 3]) → 3
 maxTriple([1, 5, 3]) → 5
 maxTriple([5, 2, 3]) → 5
 */
public class MaxTriple {
    public static int maxTriple(int[] nums) {
        int max = nums[0];
        int len = nums.length;

        if (nums[len / 2] > max) {
            max = nums[len / 2]; //middle
        }
        if (nums[len - 1] > max) {
            max = nums[len - 1];
        }
        return max;
    }
}
