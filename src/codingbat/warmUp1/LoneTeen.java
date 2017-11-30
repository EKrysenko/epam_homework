package codingbat.warmUp1;

/* Problem loneTeen.
    We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 2 int values, return true if one or the other is teen, but not both.

    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false
    */
public class LoneTeen {
    public static boolean loneTeen(int a, int b){ // Problem "loneTeen" solve method.
        return isWithin(a, 13, 19) != isWithin(b, 13, 19);
    }
    public static boolean isWithin(int a, int minRange, int maxRange){ // Util method returns true if int "a" is in range
        return minRange <= a && a <= maxRange;                         //  from "minRange" to "maxRange" inclusive.
    }
}
