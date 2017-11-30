package codingbat.warmUp1;

/* Problem EndUp
    Given a string, return a new string where the last 3 chars are now in upper case.
    If the string has less than 3 chars, uppercase whatever is there.
    Note that str.toUpperCase() returns the uppercase version of a string.

    endUp("Hello") → "HeLLO"
    endUp("hi there") → "hi thERE"
    endUp("hi") → "HI"
    */
public class EndUp {
    public static String endUp(String str){  // Problem "endUp" solve method.
        if (str.length() < 3){
            return str.toUpperCase();
        }else{
            String end = str.substring(str.length() - 3, str.length());
            return str.replace(end, end.toUpperCase());
        }
    }
}
