package codingbat.warmUp1;

import static codingbat.warmUp1.LoneTeen.isWithin;

/* Problem in1020.
    Given 2 int values, return true if either of them is in the range 10..20 inclusive.

    in1020(12, 99) → true
    in1020(21, 12) → true
    in1020(8, 99) → false
    */
public class In1020 {
    public static boolean in1020(int a, int b){             // Problem "in1020" solve method
        return isWithin(a, 10, 20) || isWithin(b, 10, 20);  // uses util method isWithin() from the problem "loneTeen".
    }
}
