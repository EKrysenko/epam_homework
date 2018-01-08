package hackerrank;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BigNumber {

    public static void bigInteger(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }

    public static void bigDecimal(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        Arrays.sort(s, new Comparator<Object>() {
            @Override
            public int compare(Object a1, Object a2) {
                BigDecimal bigDec1 = new BigDecimal((String) a1);
                BigDecimal bigDec2 = new BigDecimal((String) a2);
                return bigDec2.compareTo(bigDec1);
            }
        });

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }

    }

    public static void primality(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
    }
}
