package codingbat.warmUp1;

/* Problem front3.
    Given a string, we'll say that the front is the first 3 chars of the string.
    If the string length is less than 3, the front is whatever is there.
    Return a new string which is 3 copies of the front.

    front3("Java") → "JavJavJav"
    front3("Chocolate") → "ChoChoCho"
    front3("abc") → "abcabcabc"
    */
public class Front3 {
    public static String front3(String str){  // Problem front3 solve method.
        return getFront(str, 3) + getFront(str, 3) + getFront(str, 3);
    }
    public static String getFront(String str, int n){  // Util method returns first "n" characters of "str" as String.
        if (str.length() < n){
            return str;
        }else{
            return str.substring(0, n);
        }
    }
}
