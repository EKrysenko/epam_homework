package codingbat.warmUp1;

    /* Problem delDel
    Given a string, if the string "del" appears starting at index 1,
    return a string where that "del" has been deleted.
    Otherwise, return the string unchanged.

    delDel("adelbc") → "abc"
    delDel("adelHello") → "aHello"
    delDel("adedbc") → "adedbc"
    */
public class DelDel {
        public static String delDel(String str){ // Problem "delDel" solve method
            if (str.length() < 4){
                return str;
            }
            if (!str.substring(1, 4).equals("del")){
                return str;
            }
            return str.replace("del", "");
        }
}
