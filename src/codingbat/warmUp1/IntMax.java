package codingbat.warmUp1;

/* Problem intMax.
    Given three int values, a b c, return the largest.

    intMax(1, 2, 3) → 3
    intMax(1, 3, 2) → 3
    intMax(3, 2, 1) → 3
    */
public class IntMax {
    public static int intMax(int a, int b, int c){
        int max = 0;
        max = a > b ? a : b;
        return max > c? max : c;
    }
}
