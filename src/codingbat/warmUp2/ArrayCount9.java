package codingbat.warmUp2;

/**
 * Created by Пользователь on 27.11.2017.
 */
public class ArrayCount9 {
    public static int arrayCount9(int[] nums){
        int count = 0;
        for (int i : nums) {
            if(i == 9){
                ++count;
            }
        }
    return count;
    }
}
