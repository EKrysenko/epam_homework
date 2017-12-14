package codingbat;

public class Array3 {

    /**
     * Consider the leftmost and righmost appearances of some value in an array.
     * We'll say that the "span" is the number of elements between the two inclusive.
     * A single value has a span of 1. Returns the largest span found in the given array.
     * maxSpan([1, 2, 1, 1, 3]) → 4
     * maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
     * maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
     */
    public int maxSpan(int[] nums) {
        int max = 0;

        for(int i = 0; i < nums.length; ++i) {
            int j = nums.length - 1;

            while(nums[i] != nums[j])
                j--;

            int span = j - i + 1;

            if(span > max) {
                max = span;
            }
        }
        return max;
    }

    /**
     * Given a non-empty array, return true if there is a place to split the array
     * so that the sum of the numbers on one side is equal to the sum of the numbers on the other side.
     * canBalance([1, 1, 1, 2, 1]) → true
     * canBalance([2, 1, 1, 2, 1]) → false
     * canBalance([10, 10]) → true
     */
    public boolean canBalance(int[] nums) {
        int sumLeft = 0;

        for (int i = 0; i < nums.length; ++i) {
            int sumRight = 0;

            sumLeft += nums[i];
            int j = nums.length - 1;

            while (j > i) {
                sumRight += nums[j];
                --j;
            }
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }

    /**
     * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n}
     * (spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
     * which is known to sum to exactly n*(n + 1)/2.
     * seriesUp(3) → [1, 1, 2, 1, 2, 3]
     * seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
     * seriesUp(2) → [1, 1, 2]
     */
    public int[] seriesUp(int n) {
        int[] nums = new int[n*(n+1)/2];
        int pointer = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                nums[pointer] = j;
                ++pointer;
            }
        }
        return nums;
    }

}
