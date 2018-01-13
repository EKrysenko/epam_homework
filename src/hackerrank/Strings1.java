package hackerrank;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Strings1 {

    public static void stringIntroduction() {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum = A.length() + B.length();
        System.out.println(sum);
        A = A.substring(0, 1).toUpperCase() + A.substring(1, A.length());
        B = B.substring(0, 1).toUpperCase() + B.substring(1, B.length());

        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        System.out.println(A + " " + B);
    }

    public static void subString() {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        for (int i = 1; i < s.length() - k + 1; ++i) {
            String token = s.substring(i, i + k);
            smallest = token.compareTo(smallest) < 0 ? token : smallest;
            largest = 0 < token.compareTo(largest) ? token : largest;
        }
        return smallest + "\n" + largest;
    }

    public static void stringReverse() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        System.out.println(A.equals(reverse(A, A.length() - 1)) ? "Yes" : "No");
    }

    private static String reverse(String stringToReverse, int index){
        if(index <= 0){
            return stringToReverse.charAt(0) + "";
        }
        return stringToReverse.charAt(index) + reverse(stringToReverse, index-1);
    }


    public static void anagrams() {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagram(String a, String b) {
        char[] aAsArray = a.toLowerCase().toCharArray();
        char[] bAsArray = b.toLowerCase().toCharArray();
        Arrays.sort(aAsArray);
        Arrays.sort(bAsArray);

        return Arrays.equals(aAsArray,bAsArray);
    }


    public static void stringTokens() {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.length() == 0) {
            System.out.println("0");
            return;
        }
        String[] strings = s.split("[^a-zA-Z]+");
        System.out.println(strings.length);
        for (String str : strings) {
            System.out.println(str);
        }
        scan.close();
    }

    public static void patternSyntaxChecker() {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            String pattern = in.nextLine();
            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            --testCases;
        }
    }

    class MyRegex {
        String pattern;

        MyRegex() {
            String blockOfDigits0to255 = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
            pattern = blockOfDigits0to255 + "." + blockOfDigits0to255 + "." + blockOfDigits0to255 + "." + blockOfDigits0to255;

        }
    }

    public static void duplicateWords() {

        String regex = "\\b(\\w+)(\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }

    class UsernameValidator {

        public static final String regularExpression="[a-zA-Z][a-zA-Z0-9_]{7,29}$";
    }

    public static void tagContentExtractor(){
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());

        while (testCases-- > 0) {
            String line = scan.nextLine();

            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher m = r.matcher(line);

            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if ( ! matchFound) {
                System.out.println("None");
            }
        }
    }

}
