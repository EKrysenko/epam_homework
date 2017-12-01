package codingbat.Array1;

/**
 * Created by Пользователь on 01.12.2017.
 */
public class SameFirstLast {
    public static boolean sameFirstLast(int[] nums) {
        int len = nums.length;
        if (len < 1) {
            return false;
        }
        return nums[0] == nums[len - 1];
    }
}
