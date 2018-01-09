package hackerrank;

import java.util.Scanner;

public class DataStructure {

    public static void array1D(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; ++i) {
            int val = scan.nextInt();
            a[i] = val;
        }
        scan.close();

        for (int anA : a) {
            System.out.println(anA);
        }
    }

    public static void array2D(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 6; ++j) {
                arr[i][j] = in.nextInt();
                if (i > 1 && j > 1) {
                    int sum = arr[i][j]
                            + arr[i][j - 1]
                            + arr[i][j - 2]
                            + arr[i - 1][j - 1]
                            + arr[i - 2][j]
                            + arr[i - 2][j - 1]
                            + arr[i - 2][j - 2];
                    if (sum > max) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }

    public static void subArray(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int numberOfSubArrays = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < n; ++i) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum < 0) {
                    ++numberOfSubArrays;
                }
            }
        }
        System.out.println(numberOfSubArrays);
    }

}
