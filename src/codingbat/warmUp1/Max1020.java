package codingbat.warmUp1;

import static codingbat.warmUp1.LoneTeen.isWithin;

/* Problem max1020.
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
or return 0 if neither is in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11
*/
public class Max1020 {
    public static int max1020(int a, int b) { // Problem "max1020" solve method.
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (isWithin(a, 10, 20)) return a;    // uses util method isWithin() from the problem "loneTeen".
        if (isWithin(b, 10, 20)) return b;
        return 0;
    }
}
