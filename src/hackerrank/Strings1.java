package hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class Strings1 {

    public static void stringIntroduction(String[] args) {

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

    public static void subString(String[] args) {
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

    
    public static void stringReverse(String[] args) {
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


    public static void anagrams(String[] args) {

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

}
