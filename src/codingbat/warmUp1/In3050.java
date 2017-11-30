package codingbat.warmUp1;

import static codingbat.warmUp1.LoneTeen.isWithin;

/* Problem in3050.
Given 2 int values, return true if they are both in the range 30..40 inclusive,
or they are both in the range 40..50 inclusive.

in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
*/
public class In3050 {
        public static boolean in3050(int a, int b){              // Problem "in3050" solve method.
            return isWithin(a, 30, 40) && isWithin(b, 30, 40) || // uses util method isWithin() from the problem "loneTeen".
                    isWithin(a, 40, 50) && isWithin(b, 40, 50);
        }
}
