package codingbat.Array1;

/**
 * Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

 reverse3([1, 2, 3]) → [3, 2, 1]
 reverse3([5, 11, 9]) → [9, 11, 5]
 reverse3([7, 0, 0]) → [0, 0, 7]
 */
public class Reverse3 {
    public static int[] reverse3(int[] nums) {
        int tmp = nums[0];
        nums[0] = nums[2];
        nums[2] = tmp;
        return nums;
    }
}
