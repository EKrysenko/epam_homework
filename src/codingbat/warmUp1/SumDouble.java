package codingbat.warmUp1;

    /* Problem SumDouble.
    Given two int values, return their sum.
    Unless the two values are the same, then return double their sum.

    sumDouble(1, 2) → 3
    sumDouble(3, 2) → 5
    sumDouble(2, 2) → 8
    */
public class SumDouble {
        public static long sumDouble(int a, int b){  // Problem "sumDouble" solve method.
            long result = 0L;
            result = (a != b ? a + b : (a + b) * 2);

            return result;
        }
}
