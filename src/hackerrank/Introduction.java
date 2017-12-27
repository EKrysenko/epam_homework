package hackerrank;

import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Introduction {

    /**
     * The code stubs in your editor declare a Solution class and a main method.
     * Complete the main method by copying the two lines of code below and pasting them
     * inside the body of your main method.
     */
    public static void welcome(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }

    /**
     * In this challenge, you must read  integers from stdin and then print them to stdout.
     * Each integer must be printed on a new line.
     * To make the problem a little easier, a portion of the code is provided for you in the editor below.
     */
    public static void stdInStdOut1(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a + "\n" + b + "\n" + c);
    }

    /**
     * Given an integer, n, perform the following conditional actions:
     * If n is odd, print Weird
     * If n is even and in the inclusive range of 2 to 5, print Not Weird
     * If n is even and in the inclusive range of 6 to 20, print Weird
     * If n is even and greater than 20, print Not Weird
     * Complete the stub code provided in your editor to print whether or not n is weird.
     */
    public static void ifElse(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "";
        if (n % 2 == 1) {
            ans = "Weird";
        } else {
            if ((2 <= n && n <= 5) ||
                    (n > 20)) {
                ans = "Not Weird";
            }
            if (6 <= n && n <= 20) {
                ans = "Weird";
            }
        }
        System.out.println(ans);

    }

    /**
     * In this challenge, you must read an integer, a double, and a String from stdin,
     * then print the values according to the instructions in the Output Format section below.
     * To make the problem a little easier, a portion of the code is provided for you in the editor.
     */
    public static void stdInStdOut2(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    /**
     * Java's System.out.printf function can be used to print formatted output.
     * The purpose of this exercise is to test your understanding of formatting output using printf.
     * To get you started, a portion of the solution is provided for you in the editor; you must format
     * and print the input to complete the solution.
     */
    public static void outputFormatting(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-15s" + "%03d" + "\n", s1, x);
        }
        System.out.println("================================");
    }

    /**
     * In this challenge, we're going to use loops to help us do some simple math.
     */
    public static void loops1(String[] args) {
        Scanner in = new Scanner(System.in);
        final int N = in.nextInt();
        for (int i = 1; i <= 10; ++i) {
            System.out.println(N + " x " + i + " = " + N * i);
        }
    }

    public static void loops2(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; ++i) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; ++j) {
                a += (int) Math.pow(2, j) * b;
                System.out.print(a + " ");
            }
            System.out.println();
        }
        in.close();
    }

    public static void dataTypes(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; ++i) {
            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (Byte.MIN_VALUE <= x && x <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (Short.MIN_VALUE <= x && x <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (Integer.MIN_VALUE <= x && x <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (Long.MIN_VALUE <= x && x <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }

        }
    }

    public static void endOfFile(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (sc.hasNext()) {
            System.out.println(n + " " + sc.nextLine());
            ++n;
        }
    }

    /**
     * Java Static Initializer Block
     */
    static boolean flag = true;
    static Scanner in = new Scanner(System.in);
    static int B = in.nextInt();
    static int H = in.nextInt();

    static {
        if (B > 0 && H > 0)
            flag = true;
        else {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void calculateAreaOfParallelogram(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }

    /**
     * You are given an integer n, you have to convert it into a string.
     * Please complete the partially completed code in the editor. If your code successfully converts n
     * into a string s the code will print "Good job". Otherwise it will print "Wrong answer".
     * can range between -100 to 100 inclusive.
     */
    public static void intToString(String[] args) {
        int n = new Scanner(System.in).nextInt();
        String s = String.valueOf(n);
        System.out.println(s);
    }

    public static String getDay(String day, String month, String year) {
        final String[] DAYS = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        int yearInt = Integer.valueOf(year);
        int monthInt = Integer.valueOf(month) - 1;
        int dayInt = Integer.valueOf(day);

        Calendar calendar = Calendar.getInstance();
        calendar.set(yearInt, monthInt, dayInt);
        return DAYS[calendar.get(Calendar.DAY_OF_WEEK) - 1];
    }

    public static void currencyFormatting(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        Locale INDIA = new Locale("en", "IN");
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india = NumberFormat.getCurrencyInstance(INDIA);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        System.out.println("US: " + us.format(payment));
        System.out.println("India: " + india.format(payment));
        System.out.println("China: " + china.format(payment));
        System.out.println("France: " + france.format(payment));
    }
}


