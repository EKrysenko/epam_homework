package codingbat.string1;

/**
 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
 * In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
 * Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".

 makeTags("i", "Yay") → "<i>Yay</i>"
 makeTags("i", "Hello") → "<i>Hello</i>"
 makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */
public class MakeTags {
    public static String makeTags(String tag, String word) {
        return addBrac(tag, 1) + word + addBrac(tag, 2);
    }

    public static String addBrac(String tag, int i) { // Util method makes tag-braces around string tag.
        switch(i){
            case 1:
                return "<" + tag + ">";
            case 2:
                return "</" + tag + ">";
            default: return tag;
        }
    }
}

