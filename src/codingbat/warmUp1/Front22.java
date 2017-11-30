package codingbat.warmUp1;

import static codingbat.warmUp1.Front3.getFront;

/* Problem front22.
Given a string, take the first 2 chars and return
the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki".
If the string length is less than 2, use whatever chars are there.

front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"
*/
public class Front22 {
    public static String front22(String str){             // Problem front22 solve method
        return getFront(str, 2) + str + getFront(str, 2); // uses util method getFront() from the problem "front3".
    }
}
