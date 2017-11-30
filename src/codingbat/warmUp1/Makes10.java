package codingbat.warmUp1;

    /* Problem makes10.
    Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

    makes10(9, 10) → true
    makes10(9, 9) → false
    makes10(1, 9) → true
    */
public class Makes10 {
        public static boolean makes10(int a, int b){  // Problem "makes10" solve method.
            return is10(a, b) || a + b == 10;
        }
        public static boolean is10(int a, int b){ // Util method returns true if at least one of given ints == 10.
            return a == 10 || b == 10;
        }
}
