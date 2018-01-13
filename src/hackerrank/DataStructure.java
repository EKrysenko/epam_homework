package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class DataStructure {

    public static void array1D() {

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

    public static void array2D() {
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

    public static void subArray() {
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

    public static void arrayList() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List<Integer>> rows = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            int d = in.nextInt();
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; ++j) {
                row.add(in.nextInt());
            }

            rows.add(row);
        }

        int q = in.nextInt();

        for (int i = 0; i < q; ++i) {
            int x = in.nextInt();
            int y = in.nextInt();

            try {
                System.out.println(rows.get(x - 1).get(y - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }

    public static void array1dPart2() {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int j = 0; j < q; j++){
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }
            if(canWin(leap, game, 0)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        scan.close();
    }

    private static boolean canWin(int leap, int[] game, int i) {
        if(i < 0 || game[i] == 1){
            return false;
        }
        if((i == game.length - 1) || i + leap > game.length - 1){
            return true;
        }

        game[i] = 1;
        return canWin(leap, game, i + 1) || canWin(leap, game, i - 1) || canWin(leap, game, i + leap);
    }

    public static void list() {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            int value = scan.nextInt();
            list.add(value);
        }

        int q = scan.nextInt();
        for (int i = 0; i < q; ++i) {
            String action = scan.next();
            if (action.equals("Insert")) {
                int index = scan.nextInt();
                int value = scan.nextInt();
                list.add(index, value);
            } else {
                int index = scan.nextInt();
                list.remove(index);
            }
        }
        scan.close();

        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }

    public static void map() throws IOException {

        BufferedReader inputValues = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(inputValues.readLine());
        Map<String, Integer> map = new HashMap<>();
        while (n-- > 0) {
            String name = inputValues.readLine();
            int phone   = Integer.valueOf(inputValues.readLine());
            map.put(name, phone);
        }


        String s;
        while((s = inputValues.readLine()) != null) {
            if (map.containsKey(s)) {
                System.out.println(s + "=" + map.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        inputValues.close();
    }

    public static void stack() {

        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            String expression = scan.next();
            System.out.println(isBalanced(expression, map) ? "true" : "false" );
        }
        scan.close();
    }

    private static boolean isBalanced(String expression, Map<Character, Character> map) {
        if ((expression.length() % 2) != 0) {
            return false;
        }
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < expression.length(); i++) {
            Character ch = expression.charAt(i);
            if (map.containsKey(ch)) {
                deque.push(ch);
            } else if (deque.isEmpty() || ch != map.get(deque.pop())) {
                return false;
            }
        }
        return deque.isEmpty();
    }


}

